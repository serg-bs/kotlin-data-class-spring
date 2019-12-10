package com.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class FruitApplication

fun main(args: Array<String>) {
	runApplication<FruitApplication>(*args)
}
