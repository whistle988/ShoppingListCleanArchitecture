package com.example.shoppinglistcleanarchitecture.data

import com.example.shoppinglistcleanarchitecture.domain.ShopItem

class ShopListMapper {

    fun mapEntityToDbModel(shopItem: ShopItem) = ShopItemDbModel(
        id = shopItem.id,
        name = shopItem.name,
        count = shopItem.count,
        enabled = shopItem.enabled
    )

    fun mapDbModelToEntity(shopItemDbModel: ShopItemDbModel) = ShopItem(
        id = shopItemDbModel.id,
        name = shopItemDbModel.name,
        count = shopItemDbModel.count,
        enabled = shopItemDbModel.enabled
    )

    fun mapListOfDbModelToListOfEntity(list: List<ShopItemDbModel>) = list.map {
        mapDbModelToEntity(it)
    }
}
