package com.example.shoppinglistcleanarchitecture.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoppinglistcleanarchitecture.data.ShopListRepositoryImpl
import com.example.shoppinglistcleanarchitecture.domain.DeleteShopItemUseCase
import com.example.shoppinglistcleanarchitecture.domain.EditShopItemUseCase
import com.example.shoppinglistcleanarchitecture.domain.GetShopListUseCase
import com.example.shoppinglistcleanarchitecture.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}
