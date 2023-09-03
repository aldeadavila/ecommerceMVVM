package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository
import java.io.File

class CreateProductUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke(product: Product, files: List<File>) = repository.create(product, files)
}