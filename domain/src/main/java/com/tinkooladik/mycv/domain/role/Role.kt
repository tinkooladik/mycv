package com.tinkooladik.mycv.domain.role

import com.tinkooladik.mycv.domain.company.Company
import com.tinkooladik.mycv.domain.skill.Skill
import java.time.LocalDate
import java.time.temporal.ChronoUnit

data class Role(
    val id: Int,
    val title: String,
    val company: Company,
    val description: String,
    val startTime: LocalDate,
    val endTime: LocalDate,
    val teamSize: Int,
    val skills: Set<Skill>,
) {
    val duration: Int
        get() = ChronoUnit.DAYS.between(startTime, endTime).toInt()
}