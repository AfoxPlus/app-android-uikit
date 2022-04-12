package com.afoxplus.uikit.views.status

interface ListState<E>

class ListLoading<E> : ListState<E>
class ListEmptyData<E> : ListState<E>
class ListError<E>(val er: Exception) : ListState<E>
class ListSuccess<E>(val data: List<E> = listOf()) : ListState<E>