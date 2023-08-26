package com.aldeadavila.ecommercemvvm.ui.screens.profile.update.mapper

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.ui.screens.profile.update.ProfileUpdateState

fun ProfileUpdateState.toUser(): User {
    return User(
        name = name,
        lastname = lastname,
        phone = phone,
        image = image
    )
}