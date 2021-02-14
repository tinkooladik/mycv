package com.tinkooladik.mycv.screen.roles

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.tinkooladik.mycv.base.BaseViewModel
import com.tinkooladik.mycv.domain.role.ObserveRolesUseCase
import com.tinkooladik.mycv.domain.role.Role
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class RolesListViewModel @Inject constructor(
    private val observeRolesUseCase: ObserveRolesUseCase
) : BaseViewModel() {

    val roles: LiveData<List<Role>>
        get() = _roles

    private val _roles: MutableLiveData<List<Role>> = MutableLiveData()

    init {
        loadRoles()
    }

    private fun loadRoles() {
        observeRolesUseCase.observe()
            .catch { error ->
                Timber.e(error, "Failed to load roles")
            }.onEach { roles ->
                Timber.e("roles: $roles")
                _roles.postValue(roles)
            }.launchIn(viewModelScope)
    }
}