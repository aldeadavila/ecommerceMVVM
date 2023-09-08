package com.aldeadavila.ecommercemvvm.domain.usecase.products

import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.repository.ProductsRepository
import java.io.File

class UpdateProductWithImageUseCase(private val repository: ProductsRepository) {

    suspend operator fun  invoke(id: String, product: Product, files: List<File>) = repository.updateWithImage(id, product, files)
}