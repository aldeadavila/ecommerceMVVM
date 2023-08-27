package com.aldeadavila.ecommercemvvm.domain.usecase.categories

import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.repository.CategoriesRepository
import java.io.File

class CreateCategoryUseCase(private val categoriesRepository: CategoriesRepository) {

    suspend operator fun invoke(category: Category, file: File) = categoriesRepository.create(category, file)
}