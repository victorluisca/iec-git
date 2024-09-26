package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
<<<<<<< HEAD
            call.respondText("IEC 1!")
=======
            call.respondText("IEC! 2")
>>>>>>> 0658992cb1a6f5115ad926f4254643770378d3f0
        }
    }
}
