package com.aldeadavila.ecommercemvvm.ui.screens.client.category.list

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.usecase.categories.CategoriesUseCase
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientCategoryListViewModel @Inject constructor(private val categoriesUseCase: CategoriesUseCase): ViewModel()  {

    var categoriesResponse by mutableStateOf<Resource<List<Category>>?>(null)
        private set

    init {
        getCategories()
    }
    fun getCategories() = viewModelScope.launch{
        categoriesResponse = Resource.Loading
        categoriesUseCase.getCategories().collect() {
            categoriesResponse = it
        }
    }
}