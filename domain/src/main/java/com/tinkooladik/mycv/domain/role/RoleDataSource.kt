package com.tinkooladik.mycv.domain.role

import com.github.michaelbull.result.Result
import com.tinkooladik.mycv.domain.Completion
import kotlinx.coroutines.flow.Flow

interface RoleDataSource {

    fun observe(): Flow<List<Role>>

    suspend fun add(role: Role): Result<Role, Exception>

    suspend fun remove(roleId: Int): Completion<java.lang.Exception>
}