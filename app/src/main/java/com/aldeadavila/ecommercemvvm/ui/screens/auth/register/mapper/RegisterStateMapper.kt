package com.aldeadavila.ecommercemvvm.ui.screens.auth.register.mapper

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.ui.screens.auth.register.RegisterState

fun RegisterState.toUser(): User {
    return User(
        name = name,
        lastname = lastname,
        email = email,
        phone = phone,
        password = password
    )
}