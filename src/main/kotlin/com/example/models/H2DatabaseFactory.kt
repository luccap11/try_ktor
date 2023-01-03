package com.example.models

import com.example.models.jpa.UserDto
import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.hibernate.cfg.Configuration

object H2DatabaseFactory {
    fun init() {
        val sessionFactory = Configuration()
            .addAnnotatedClass(UserDto::class.java)
            .buildSessionFactory()

        val session = sessionFactory.openSession()
        session.beginTransaction()

        val userDto = UserDto()
        userDto.username = "admin"
        userDto.password = "admin"
        session.persist(userDto)

        val listUser = session.createQuery("select u from UserDto u", UserDto::class.java)
            .list()

        System.err.println(listUser.size)

        session.transaction.commit()
    }

    private fun createHikariDataSource(
        url: String,
        driver: String
    ) = HikariDataSource(HikariConfig().apply {
        driverClassName = driver
        jdbcUrl = url
        maximumPoolSize = 3
        isAutoCommit = false
        transactionIsolation = "TRANSACTION_REPEATABLE_READ"
        validate()
    })
}