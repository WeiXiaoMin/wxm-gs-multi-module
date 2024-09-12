package com.example.multimodule.application

import com.example.multimodule.service.MyService
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication(scanBasePackages = ["com.example.multimodule"])
@RestController
class DemoApplication(private val myService: MyService) {
    @GetMapping("/")
    fun home(): String? {
        return myService.message()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(DemoApplication::class.java, *args)
        }
    }
}
