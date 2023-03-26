package com.doutoutdou.kotlin.aws.lambda.example.function

import com.doutoutdou.kotlin.aws.lambda.example.service.RandomStringService
import org.springframework.stereotype.Component
import java.util.function.Function

@Component
class RandomStringFunction(private val randomStringService: RandomStringService) : Function<String, String>  {
    override fun apply(p0: String): String {
        return randomStringService.createRandomString()
    }
}