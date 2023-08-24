package com.aldeadavila.ecommercemvvm.ui.navigation.screen.roles

sealed class RolesScreen(val route: String) {
    object Roles: RolesScreen("roles")

}
