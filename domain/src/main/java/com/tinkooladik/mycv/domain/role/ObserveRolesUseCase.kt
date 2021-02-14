package com.tinkooladik.mycv.domain.role

import com.tinkooladik.mycv.domain.AppDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ObserveRolesUseCase @Inject constructor(
    private val source: RoleDataSource,
    private val dispatchers: AppDispatchers
) {

    fun observe(): Flow<List<Role>> = source.observe().flowOn(dispatchers.io)
}