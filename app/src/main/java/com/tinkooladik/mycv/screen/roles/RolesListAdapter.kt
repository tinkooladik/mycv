package com.tinkooladik.mycv.screen.roles

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.tinkooladik.mycv.R
import com.tinkooladik.mycv.base.BaseAdapter
import com.tinkooladik.mycv.base.ListViewHolder
import com.tinkooladik.mycv.databinding.ItemRoleBinding
import com.tinkooladik.mycv.domain.role.Role
import com.tinkooladik.mycv.extensions.inflate

class RolesListAdapter(
    private val onItemClicked: (value: Role) -> Unit
) : BaseAdapter<Role>(diffUtilCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoleViewHolder {
        return RoleViewHolder(parent.inflate(R.layout.item_role))
    }

    inner class RoleViewHolder(itemView: View) : ListViewHolder<Role>(itemView) {

        private val binding = ItemRoleBinding.bind(itemView)

        override fun onBind(item: Role) {
            binding.root.setOnClickListener {
                onItemClicked(item)
            }

            binding.name.text = item.company.name
        }
    }

    companion object {
        val diffUtilCallback = object : DiffUtil.ItemCallback<Role>() {
            override fun areItemsTheSame(oldItem: Role, newItem: Role): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Role, newItem: Role): Boolean {
                return oldItem == newItem
            }

        }
    }
}