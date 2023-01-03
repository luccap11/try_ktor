package com.example.models

import com.example.models.jpa.UserDto
import org.hibernate.cfg.Configuration

object H2DatabaseFactory {
    fun init() {
        val driverClassName = "org.h2.Driver"
        val jdbcURL = "jdbc:h2:file:./build/db"
        //val defaultUrl = "jdbc:h2:mem:syntree;MODE=MYSQL;DATABASE_TO_UPPER=FALSE"
        //val defaultUsername = "syntree"
        //val defaultPassword = "syntree"
        //val database = Database.connect(jdbcURL, driverClassName)

        val sessionFactory = Configuration()
            .addAnnotatedClass(UserDto::class.java)
            .buildSessionFactory()

        val session = sessionFactory.openSession()
        session.beginTransaction()

        val userDto = UserDto()
        userDto.username = "admin"
        userDto.password = "admin"
        session.persist(userDto)

        var listUser = session.createQuery("select u from UserDto u", UserDto::class.java)
            .list()

        System.err.println(listUser.size)

        session.transaction.commit()
    }
}