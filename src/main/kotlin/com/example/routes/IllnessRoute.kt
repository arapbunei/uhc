package com.example.routes

import com.example.models.*
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.listIllnessRoute() {
    get("/illness") {
        if (illnessStorage.isNotEmpty()) {
            call.respond(illnessStorage)
        }
    }
}



