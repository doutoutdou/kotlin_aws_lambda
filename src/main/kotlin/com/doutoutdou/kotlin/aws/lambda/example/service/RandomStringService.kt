package com.doutoutdou.kotlin.aws.lambda.example.service

import com.doutoutdou.kotlin.aws.lambda.example.utils.LEFT_LIMIT
import com.doutoutdou.kotlin.aws.lambda.example.utils.RIGHT_LIMIT
import org.springframework.stereotype.Service
import java.util.*

@Service
class RandomStringService() {

    fun createRandomString(length: Int? = 10): String {

        val targetStringLength = length!!;
        val random = Random();

        return random.ints(LEFT_LIMIT, RIGHT_LIMIT + 1)
            .limit(targetStringLength.toLong())
            .collect(
                { StringBuilder() },
                { obj: StringBuilder, codePoint: Int -> obj.appendCodePoint(codePoint) }
            ) { obj: StringBuilder, s: StringBuilder? -> obj.append(s) }
            .toString()

    }

}