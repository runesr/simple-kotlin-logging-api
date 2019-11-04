package no.romundstad.simplekotlinapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleKotlinApi {
    fun main(args: Array<String>) {
        runApplication<SimpleKotlinApi>(*args)
    }
}