package com.doutoutdou.kotlin.aws.lambda.example.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RandomStringServiceTest {

    @Test
    fun verifyRandomStringWithDefaultSize() {
        val randomStringService = RandomStringService()
        Assertions.assertEquals(10, randomStringService.createRandomString().length)
    }

    @Test
    fun verifyRandomStringWithCustomSize() {
        val randomStringService = RandomStringService()
        Assertions.assertEquals(20, randomStringService.createRandomString(20).length)
    }
}