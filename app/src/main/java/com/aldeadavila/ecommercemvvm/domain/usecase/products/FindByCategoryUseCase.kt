package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository

class FindByCategoryUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke(idCategory: String) = repository.findByCategory(idCategory)
}