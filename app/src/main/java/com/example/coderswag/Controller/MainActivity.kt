package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Adapter.CategoryRecycleAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    //for default adapter
//    lateinit var adapter: ArrayAdapter<Category>
    // for Category adapter
//    lateinit var adapter: CategoryAdapter
    // for category recycle adapter
    lateinit var adapter:CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataService.categories)
//        adapter = CategoryAdapter(this,DataService.categories)
        adapter = CategoryRecycleAdapter(this,DataService.categories){category ->
            val productIntent = Intent(this,ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
        }

        categoryListView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)

    }
}
