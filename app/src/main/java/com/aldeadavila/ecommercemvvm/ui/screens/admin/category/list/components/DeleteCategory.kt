package com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.components

import android.widget.Toast
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.components.ProgressBar
import com.aldeadavila.ecommercemvvm.ui.screens.admin.category.list.AdminCategoryListViewModel

@Composable
fun DeleteCategory( vm: AdminCategoryListViewModel = hiltViewModel()) {

    when(val response = vm.deleteCategoryResponse) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Succes -> {

            Toast.makeText(LocalContext.current, "La categoría se eliminó correctamente", Toast.LENGTH_LONG).show()

        }

        is Resource.Failure -> {
            Toast.makeText(LocalContext.current, response.message, Toast.LENGTH_LONG).show()
        }

        else -> {
            if(response != null) {
                Toast.makeText(LocalContext.current, "Hubo un error desconocido", Toast.LENGTH_LONG).show()
            }
        }
    }

}