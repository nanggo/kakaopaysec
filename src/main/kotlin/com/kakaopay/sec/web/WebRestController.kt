package com.kakaopay.sec.web

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebRestController{
    @GetMapping("/hello")
    fun hello(): String{
        return "HelloWorld"
    }
}