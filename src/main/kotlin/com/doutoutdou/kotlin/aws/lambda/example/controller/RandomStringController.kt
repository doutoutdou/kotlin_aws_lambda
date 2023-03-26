package com.doutoutdou.kotlin.aws.lambda.example.controller

import com.doutoutdou.kotlin.aws.lambda.example.service.RandomStringService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/random")
class RandomStringController(private val randomStringService: RandomStringService) {

    @GetMapping("/string")
    fun generateString() : String {
        return randomStringService.createRandomString();
    }
}