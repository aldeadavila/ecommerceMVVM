package com.aldeadavila.ecommercemvvm.ui.navigation.screen

sealed class RolesScreen(val route: String) {
    object Roles: RolesScreen("roles")

}
