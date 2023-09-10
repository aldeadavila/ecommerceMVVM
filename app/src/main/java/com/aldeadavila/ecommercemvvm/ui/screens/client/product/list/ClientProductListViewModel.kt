package com.aldeadavila.ecommercemvvm.ui.screens.client.product.list

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.domain.usecase.products.ProductsUseCase
import com.aldeadavila.ecommercemvvm.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClientProductListViewModel @Inject constructor(private val productsUseCase: ProductsUseCase)  :ViewModel() {

    var productsResponse by mutableStateOf<Resource<List<Product>>?>(null)
        private set

    init {
        getProducts()
    }
    fun getProducts() = viewModelScope.launch {
        productsResponse = Resource.Loading
        productsUseCase.findAll().collect() {
            Log.d("ClientProductListViewModel", "Data: $it")
            productsResponse = it
        }
    }

}
