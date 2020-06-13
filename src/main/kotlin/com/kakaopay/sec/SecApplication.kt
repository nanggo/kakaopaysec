package com.kakaopay.sec

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SecApplication

fun main(args: Array<String>) {
    runApplication<SecApplication>(*args)
}
