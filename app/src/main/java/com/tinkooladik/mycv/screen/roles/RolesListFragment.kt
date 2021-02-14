package com.tinkooladik.mycv.screen.roles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.tinkooladik.mycv.base.BaseFragment
import com.tinkooladik.mycv.databinding.FragmentRolesBinding
import com.tinkooladik.mycv.domain.role.Role
import com.tinkooladik.mycv.extensions.addVerticalSpacingItemDecoration
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RolesListFragment : BaseFragment() {

    private lateinit var binding: FragmentRolesBinding

    private val viewModel: RolesListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRolesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = RolesListAdapter(::onRoleItemClicked)
        binding.recycler.adapter = adapter
        binding.recycler.addVerticalSpacingItemDecoration()

        observe(viewModel.roles) { roles ->
            adapter.submitList(roles)
        }
    }

    private fun onRoleItemClicked(role: Role) {
        Toast.makeText(requireContext(), role.title, Toast.LENGTH_SHORT).show()
    }

}