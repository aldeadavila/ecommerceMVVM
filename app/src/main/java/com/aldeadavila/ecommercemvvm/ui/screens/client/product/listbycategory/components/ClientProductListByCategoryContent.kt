package com.aldeadavila.ecommercemvvm.ui.screens.client.product.listbycategory.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.aldeadavila.ecommercemvvm.domain.model.Product


@Composable
fun ClientProductListByCategoryContent(navHostController: NavHostController, paddingValues: PaddingValues, products: List<Product>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        items(items = products) {
            ClientProductListByCategoryItem(navHostController = navHostController, product = it)
        }
    }
}