package com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.model.Product
import com.aldeadavila.ecommercemvvm.ui.screens.admin.product.list.AdminProductListViewModel


@Composable
fun AdminProductListContent(navHostController: NavHostController, paddingValues: PaddingValues, products: List<Product>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        items(items = products) {
            AdminProductListItem(navHostController = navHostController, product = it)
        }
    }
}