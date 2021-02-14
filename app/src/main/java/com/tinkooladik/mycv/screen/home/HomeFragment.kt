package com.tinkooladik.mycv.screen.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.tinkooladik.mycv.base.BaseFragment
import com.tinkooladik.mycv.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeFragment : BaseFragment() {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.roles.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToRolesListFragment())
        }

        //TODO: move these links to some data source or constants
        binding.instagram.setOnClickListener {
            openLink("https://www.instagram.com/tinkooladik/")
        }

        binding.linkedin.setOnClickListener {
            openLink("https://www.linkedin.com/in/oleksandra-tkachenko-b46518128/")
        }
    }

    private fun openLink(link: String) {
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse(link)
            )
        )
    }
}