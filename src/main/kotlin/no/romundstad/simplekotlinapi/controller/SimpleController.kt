package no.romundstad.simplekotlinapi.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/cars")
    fun getCars() : List<String> {
        return listOf("pagani", "bmw")
    }
}