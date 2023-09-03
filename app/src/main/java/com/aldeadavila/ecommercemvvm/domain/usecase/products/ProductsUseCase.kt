package com.aldeadavila.ecommercemvvm.domain.usecase.products

data class ProductsUseCase(
    val createProduct: CreateProductUseCase,
    val findByCategory: FindByCategoryUseCase
)
