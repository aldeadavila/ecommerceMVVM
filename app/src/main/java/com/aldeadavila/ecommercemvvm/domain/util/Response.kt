package com.aldeadavila.ecommercemvvm.domain.util

sealed class Response<out T> {

    object Loading: Response<Nothing>()
    data class Succes<out T>(val data: T): Response<T>()
    data class Failure<out T>(val exception: Exception): Response<T>()

}
