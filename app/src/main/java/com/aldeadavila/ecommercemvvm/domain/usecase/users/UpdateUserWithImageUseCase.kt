package com.aldeadavila.ecommercemvvm.domain.usecase.users

import com.aldeadavila.ecommercemvvm.domain.model.User
import com.aldeadavila.ecommercemvvm.domain.repository.UsersRepository
import java.io.File

class UpdateUserWithImageUseCase constructor(val usersRepository: UsersRepository) {

    suspend operator fun invoke(id: String, user: User, file: File) = usersRepository.updateWithImage(id, user, file)
}