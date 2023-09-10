package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository

class FindAllUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke() = repository.findAll()
}