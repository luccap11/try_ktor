package com.example

import com.example.models.H2DatabaseFactory
import io.ktor.server.application.*
import com.example.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.tomcat.EngineMain.main(args)

fun Application.module() {
    H2DatabaseFactory.init()
    configureSecurity()
    configureHTTP()
    configureMonitoring()
    configureRouting()
}
