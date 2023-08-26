package com.aldeadavila.ecommercemvvm.domain.usecase.users

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.repository.UsersRepository

class UpdateUserUseCase constructor(val usersRepository: UsersRepository) {

    suspend operator fun invoke(id: String, user: User) = usersRepository.update(id, user)
}