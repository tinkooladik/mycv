package com.tinkooladik.mycv.data

import com.tinkooladik.mycv.domain.company.Company
import com.tinkooladik.mycv.domain.company.CompanyType
import com.tinkooladik.mycv.domain.role.Role
import java.time.LocalDate
import java.time.Month

//TODO: mb move this info to some .json file, but right now I don't have time for this

val ROLES = listOf(
    Role(
        id = 0,
        title = "SSIS developer",
        company = Company(
            name = "Virtuace",
            type = CompanyType.OUTSOURCE,
            link = "http://www.virtuace.com/"
        ),
        description = "SSIS - SQL server integration services",
        startTime = LocalDate.of(2015, Month.OCTOBER, 1),
        endTime = LocalDate.of(2016, Month.JULY, 1),
        teamSize = 3
    ),
    Role(
        id = 1,
        title = "Android Developer",
        company = Company(
            name = "Floor12Apps",
            type = CompanyType.PRODUCT,
            link = "https://floor12apps.com/"
        ),
        description = "Apps for beauty salons, dental clinics, etc.",
        startTime = LocalDate.of(2016, Month.SEPTEMBER, 1),
        endTime = LocalDate.of(2017, Month.JULY, 1),
        teamSize = 6
    ),
    Role(
        id = 2,
        title = "Android Developer",
        company = Company(name = "Freelance", type = CompanyType.PRODUCT, link = ""),
        description = "Coloring games",
        startTime = LocalDate.of(2017, Month.JUNE, 1),
        endTime = LocalDate.of(2018, Month.SEPTEMBER, 1),
        teamSize = 1
    ),
    Role(
        id = 3,
        title = "Android Developer",
        company = Company(
            name = "Tachcard",
            type = CompanyType.PRODUCT,
            link = "https://tachcard.com/ua"
        ),
        description = "Ukrainian Fin-tech startup. A lot of different projects.",
        startTime = LocalDate.of(2017, Month.NOVEMBER, 1),
        endTime = LocalDate.of(2018, Month.DECEMBER, 1),
        teamSize = 3
    ),
    Role(
        id = 4,
        title = "Android Developer",
        company = Company(
            name = "Memority",
            type = CompanyType.PRODUCT,
            link = "https://memority.io/"
        ),
        description = "Part of Tachcard. Cryptocurrency wallet",
        startTime = LocalDate.of(2017, Month.NOVEMBER, 1),
        endTime = LocalDate.of(2018, Month.JUNE, 1),
        teamSize = 1
    ),
    Role(
        id = 5,
        title = "Android Developer",
        company = Company(
            name = "DataProm",
            type = CompanyType.PRODUCT,
            link = "http://dataprom.ai/"
        ),
        description = "Several projects: online shop for Azerbaijan, client for Bluetooth boxing trackers",
        startTime = LocalDate.of(2018, Month.DECEMBER, 1),
        endTime = LocalDate.of(2019, Month.OCTOBER, 1),
        teamSize = 1
    ),
    Role(
        id = 6,
        title = "Android Developer",
        company = Company(
            name = "CloudMade",
            type = CompanyType.PRODUCT,
            link = "http://cloudmade.com/"
        ),
        description = "App for car’s Automotive head unit",
        startTime = LocalDate.of(2019, Month.OCTOBER, 1),
        endTime = LocalDate.of(2020, Month.APRIL, 1),
        teamSize = 4
    ),
    Role(
        id = 7,
        title = "Android Developer",
        company = Company(
            name = "Tribu",
            type = CompanyType.PRODUCT,
            link = "https://www.we-tribu.com/"
        ),
        description = "Nice company, but project had closed before it started.",
        startTime = LocalDate.of(2020, Month.JULY, 1),
        endTime = LocalDate.of(2020, Month.JULY, 30),
        teamSize = 2
    ),
    Role(
        id = 8,
        title = "Android Developer",
        company = Company(
            name = "Transcenda",
            type = CompanyType.OUTSOURCE,
            link = "http://transcenda.com"
        ),
        description = "Home automation systems",
        startTime = LocalDate.of(2020, Month.AUGUST, 1),
        endTime = LocalDate.now(),
        teamSize = 8
    ),
)