package com.doutoutdou.kotlin.aws.lambda.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*
import java.util.function.Function

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

@Bean
fun uppercase(value: String): String {
	return value.uppercase(Locale.getDefault())
}
