package com.example.plugins

import com.example.models.Login
import com.google.gson.Gson
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        route("/login") {
            get {
                call.respondText("Siamo nella pagina login!!")
            }
            // di prova
            get("{id?}") {
                val id = call.parameters["id"] ?: return@get call.respondText(
                    "Missing id",
                    status = HttpStatusCode.BadRequest
                )
                call.respondText("Ciao utente $id")
            }
            post {
                val body = call.receive<String>()
                val login = Gson().fromJson(body, Login::class.java)
                System.err.println("Username: ${login.username} - password: ${login.password}")
                call.respondText("User logged correctly", status = HttpStatusCode.OK)
            }
        }
    }
}
