package com.aldeadavila.ecommercemvvm.data.mapper

import com.aldeadavila.ecommercemvvm.data.datasource.local.entity.CategoryEntity
import com.aldeadavila.ecommercemvvm.domain.model.Category

fun CategoryEntity.toCategory(): Category {
    return Category(
        id = id,
        name = name,
        description = description,
        image = image
    )
}

fun Category.toCategoryEntity(): CategoryEntity {
    return CategoryEntity(
        id = id ?: "",
        name = name,
        description = description,
        image = image ?: ""
    )
}