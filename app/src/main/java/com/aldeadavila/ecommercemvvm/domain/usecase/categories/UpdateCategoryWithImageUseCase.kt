package com.aldeadavila.ecommercemvvm.domain.usecase.categories

import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.repository.CategoriesRepository
import java.io.File

class UpdateCategoryWithImageUseCase(private val categoriesRepository: CategoriesRepository) {

    suspend operator fun invoke(id: String, category: Category, file: File) = categoriesRepository.updateWithImage(id, category, file)
}