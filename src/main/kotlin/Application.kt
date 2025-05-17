package com.Emi

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureAdministration()
    configureSerialization()
    configureDatabases()
    configureTemplating()
    configureSecurity()
    configureHTTP()
    configureRouting()
}
