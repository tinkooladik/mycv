package com.tinkooladik.mycv.domain

import kotlinx.coroutines.CoroutineDispatcher

class AppDispatchers(
    val io: CoroutineDispatcher,
    val computation: CoroutineDispatcher,
    val main: CoroutineDispatcher
)