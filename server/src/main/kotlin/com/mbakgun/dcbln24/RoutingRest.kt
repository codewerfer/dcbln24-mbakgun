package com.mbakgun.dcbln24

import Greeting
import data.source.remote.model.MessageResponse
import io.ktor.server.response.respond
import io.ktor.server.response.respondText
import io.ktor.server.routing.*
import io.ktor.server.routing.get

fun Route.routingREST() {
    get("/") {
        call.respondText("KMP Ktor: ${Greeting().greet()}")
    }

    get("/message") {
        call.respond(MessageResponse("Hello from KMP Ktor REST API!"))
    }
}
