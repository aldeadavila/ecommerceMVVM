package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository

class UpdateProductUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke(id: String, product: Product) = repository.update(id, product)
}