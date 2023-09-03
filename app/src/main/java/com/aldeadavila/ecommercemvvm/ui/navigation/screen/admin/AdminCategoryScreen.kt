package com.aldeadavila.ecommercemvvm.ui.navigation.screen.admin

sealed class AdminCategoryScreen(val route: String) {
    object CategoryCreate: AdminCategoryScreen("admin/category/create")
    object CategoryUpdate: AdminCategoryScreen("admin/category/update/{category}") {
        fun passCategory(category: String) = "admin/category/update/$category"
    }
    object ProductList: AdminCategoryScreen("admin/category/products/list/{category}") {
        fun passCategory(category: String) = "admin/category/products/list/$category"
    }

    object ProductCreate: AdminCategoryScreen("admin/category/products/create/{category}") {
        fun passCategory(category: String) = "admin/category/products/create/$category"
    }

}
