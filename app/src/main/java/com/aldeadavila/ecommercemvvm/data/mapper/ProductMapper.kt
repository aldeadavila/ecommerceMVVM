package com.aldeadavila.ecommercemvvm.data.mapper

import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.ProductEntity
import com.aldeadavila.ecommercemvvm.domain.model.Product

fun ProductEntity.toProduct(): Product {
    return Product(
        id = id,
        name = name,
        description = description,
        image1 = image1,
        image2 = image2,
        price = price,
        idCategory = idCategory,
        imagesToUpdate = null
    )
}

fun Product.toProductEntity(): ProductEntity {
    return ProductEntity(
        id = id ?: "",
        name = name,
        description = description,
        image1 = image1 ?: "",
        image2 = image2 ?: "",
        price = price,
        idCategory = idCategory
    )
}