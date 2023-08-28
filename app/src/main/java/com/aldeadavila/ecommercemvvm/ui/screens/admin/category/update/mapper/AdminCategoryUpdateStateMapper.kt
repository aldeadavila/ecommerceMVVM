package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.mapper

import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.AdminCategoryUpdateState

fun AdminCategoryUpdateState.toCategory(): Category {
    return Category(
        name = name,
        description = description
    )

}