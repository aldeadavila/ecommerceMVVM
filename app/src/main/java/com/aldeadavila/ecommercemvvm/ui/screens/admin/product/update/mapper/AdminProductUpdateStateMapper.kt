package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.mapper

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.AdminProductUpdateState

fun AdminProductUpdateState.toProduct(): Product {
    return Product(
        name = name,
        description = description,
        idCategory = idCategory,
        price = price
    )
}