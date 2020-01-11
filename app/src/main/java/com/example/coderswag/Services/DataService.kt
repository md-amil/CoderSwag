package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object  DataService {
    val categories = listOf(
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRT","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
        Product("Graphic beanie","20","hat1"),
        Product("hat black","25","hat2"),
        Product("hat white","30","hat3"),
        Product("hat snapback","35","hat4"),
        Product("Graphic beanie","20","hat1"),
        Product("hat black","25","hat2"),
        Product("hat white","30","hat3"),
        Product("hat snapback","35","hat4"),
        Product("Graphic beanie","20","hat1"),
        Product("hat black","25","hat2"),
        Product("hat white","30","hat3"),
        Product("hat snapback","35","hat4")
    )
    val hoodies = listOf(
        Product("hoodie red","100","hoodie1"),
        Product("hoodie black","200","hoodie2"),
        Product("hoodie gray","300","hoodie3"),
        Product("hoodie white","400","hoodie4"),
        Product("hoodie red","100","hoodie1"),
        Product("hoodie black","200","hoodie2"),
        Product("hoodie gray","300","hoodie3"),
        Product("hoodie white","400","hoodie4"),
        Product("hoodie red","100","hoodie1"),
        Product("hoodie black","200","hoodie2"),
        Product("hoodie gray","300","hoodie3"),
        Product("hoodie white","400","hoodie4")
    )
    val shirt = listOf(
        Product("black shirt","60","shirt1"),
        Product("light gray","70","shirt2"),
        Product("logo shirt red","80","shirt3"),
        Product("hustle","90","shirt4"),
        Product("cick flip studio","95","shirt5"),
        Product("black shirt","60","shirt1"),
        Product("light gray","70","shirt2"),
        Product("logo shirt red","80","shirt3"),
        Product("hustle","90","shirt4"),
        Product("cick flip studio","95","shirt5"),
        Product("black shirt","60","shirt1"),
        Product("light gray","70","shirt2"),
        Product("logo shirt red","80","shirt3"),
        Product("hustle","90","shirt4"),
        Product("cick flip studio","95","shirt5")
    )
    val digitalGoods = listOf<Product>()
    fun getProduct(cateogry:String):List<Product>{
        return when(cateogry){
            "HATS"->hats
            "HOODIES" -> hoodies
            "SHIRT"  -> shirt
            else      -> digitalGoods
        }
    }
}
