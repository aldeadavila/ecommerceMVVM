package com.aldeadavila.ecommercemvvm.domain.usecase.categories

data class CategoriesUseCase(
    val createCategory: CreateCategoryUseCase,
    val getCategories: GetCategoryUseCase
)
