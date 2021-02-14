package com.tinkooladik.mycv.screen.roles

import android.annotation.SuppressLint
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.google.android.material.chip.Chip
import com.tinkooladik.mycv.R
import com.tinkooladik.mycv.base.BaseAdapter
import com.tinkooladik.mycv.base.ListViewHolder
import com.tinkooladik.mycv.databinding.ItemRoleBinding
import com.tinkooladik.mycv.domain.role.Role
import com.tinkooladik.mycv.domain.skill.Skill
import com.tinkooladik.mycv.extensions.inflate
import java.time.LocalDate
import java.time.format.DateTimeFormatter


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

            binding.company.text = item.company.name
            binding.role.text = item.title
            binding.description.text = item.description
            binding.period.text = getPeriod(item.startTime, item.endTime)

            setupSkills(item.skills)
        }

        private fun getPeriod(start: LocalDate, end: LocalDate): String {
            val endDate = if (end == LocalDate.now()) R.string.now else dateFormat.format(end)
            return itemView.context.getString(
                R.string.period,
                dateFormat.format(start),
                endDate
            )
        }

        private fun setupSkills(skills: Set<Skill>) {
            binding.skills.removeAllViews()
            skills.forEach { skill ->
                Chip(itemView.context).apply {
                    text = skill.name
                    binding.skills.addView(this)
                }
            }
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

        @SuppressLint("SimpleDateFormat")
        val dateFormat: DateTimeFormatter = DateTimeFormatter.ofPattern("MMM yyyy")
    }
}