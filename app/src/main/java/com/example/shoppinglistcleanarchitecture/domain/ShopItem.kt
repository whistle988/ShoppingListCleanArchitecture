package com.example.shoppinglistcleanarchitecture.domain

data class ShopItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDEFIED_ID,
) {

    companion object {

        const val UNDEFIED_ID= 0
    }
}
