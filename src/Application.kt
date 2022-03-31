package com.example

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun initDB() {
    val user = "root"
    val pass = "root"
    val url = "jdbc:mysql://localhost:8889/ExposedSample?useSSL=false"
    val driver = "com.mysql.jdbc.Driver"
    Database.connect(url = url, driver = driver, user = user, password = pass)
}

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        routing {
            get("/") {
                call.respondText("Hello, world!", ContentType.Text.Html)
            }
        }
    }
}

