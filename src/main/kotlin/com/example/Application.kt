package com.example

import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*



/*fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureRouting()


}*/
fun main(){
    val arrayOfNumbers = arrayOf(2,4,6,8,10,12,14)
    println(arrayOfNumbers)
    arrayOfNumbers.forEach { number -> println(number) }
}


