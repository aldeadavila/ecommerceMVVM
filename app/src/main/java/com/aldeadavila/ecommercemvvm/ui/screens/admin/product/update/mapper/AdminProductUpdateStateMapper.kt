package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.mapper

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.AdminProductUpdateState

fun AdminProductUpdateState.toProduct(): Product {
    return Product(
        id = id,
        name = name,
        description = description,
        idCategory = idCategory,
        price = price,
        imagesToUpdate = imagesToUpdate.toList(),
        image1 = image1,
        image2 = image2
    )
}