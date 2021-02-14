package com.tinkooladik.mycv.data.roles

import com.github.michaelbull.result.Ok
import com.github.michaelbull.result.Result
import com.tinkooladik.mycv.data.ROLES
import com.tinkooladik.mycv.domain.Completion
import com.tinkooladik.mycv.domain.role.Role
import com.tinkooladik.mycv.domain.role.RoleDataSource
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RolesRepository @Inject constructor() : RoleDataSource {

    private val data: MutableStateFlow<List<Role>> = MutableStateFlow(ROLES)

    override fun observe(): Flow<List<Role>> = data

    override suspend fun add(role: Role): Result<Role, Exception> {
        delay(200)
        data.value += role
        return Ok(role)
    }

    override suspend fun remove(roleId: Int): Completion<Exception> {
        delay(200)
        data.value = data.value.filterNot { it.id == roleId }
        return Ok(Unit)
    }
}