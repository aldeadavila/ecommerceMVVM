package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository

class DeleteProductUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke(id: String) = repository.detele(id)
}