package com.tinkooladik.mycv.domain.company

data class Company(
    val name: String,
    val type: CompanyType,
    val link: String,
)

enum class CompanyType { PRODUCT, OUTSOURCE }