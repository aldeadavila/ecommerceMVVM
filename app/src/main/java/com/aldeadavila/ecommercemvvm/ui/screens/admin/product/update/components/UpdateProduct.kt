package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.components

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import com.aldeadavila.ecommercemvvm.ui.components.ProgressBar
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.create.AdminProductCreateViewModel
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.update.AdminProductUpdateViewModel

@Composable
fun UpdateProduct(vm: AdminProductUpdateViewModel = hiltViewModel()) {

    when(val response = vm.productResponse) {
        Resource.Loading -> {
            ProgressBar()
        }
        is Resource.Succes -> {
            /*Log.d("UpdateUser", "Data: ${response.data}")
            vm.categoryResponse(response.data)*/

            Toast.makeText(LocalContext.current, "El producto se ha actualizado correctamente", Toast.LENGTH_LONG).show()
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
