package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update


import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.Category
import com.aldeadavila.ecommercemvvm.domain.usecase.categories.CategoriesUseCase
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.update.mapper.toCategory
import com.aldeadavila.ecommercemvvm.ui.util.ComposeFileProvider
import com.aldeadavila.ecommercemvvm.ui.util.ResultingActivityHandler
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

@HiltViewModel
class AdminCategoryUpdateViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val categoriesUseCase: CategoriesUseCase,
    @ApplicationContext private val context: Context
): ViewModel() {

    var state by mutableStateOf(AdminCategoryUpdateState())
        private set

    var categoryResponse by mutableStateOf<Resource<Category>?>(null)

    //imagenes
    var file: File? = null
    val resultingActivityHandler = ResultingActivityHandler()

    val data = savedStateHandle.get<String>("category")
    val category = Category.fromJson(data!!)

    init {
        state = state.copy(
            name = category.name,
            image = category.image!!,
            description = category.description
        )
    }


    fun createCategory() = viewModelScope.launch {
        if(file != null) {
            categoryResponse = Resource.Loading
            val result = categoriesUseCase.createCategory(state.toCategory(), file!!)
            categoryResponse = result
        }
    }


    fun pickImage() = viewModelScope.launch {
        val result = resultingActivityHandler.getContent("image/*")
        if (result != null) {
            file = ComposeFileProvider.createFileFromUri(context, result)
            state = state.copy(image = result.toString())
        }
    }

    fun takePhoto() = viewModelScope.launch {
        val result = resultingActivityHandler.takePicturePreview()
        if (result != null) {
            state = state.copy(image = ComposeFileProvider.getPathFromBitmap(context, result))
            file = File(state.image)
        }
    }

    fun onNameInput(input: String) {
        state = state.copy(name = input)
    }

    fun onDescriptionInput(input: String) {
        state = state.copy(description = input)
    }

}