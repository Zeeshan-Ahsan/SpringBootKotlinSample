package com.sample.springbootweb

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@SpringBootApplication
class SpringbootwebApplication {
    @Bean
    fun saveData(repo: JournalRepository) = CommandLineRunner {
        val string = "2017-07-25"
        val date: LocalDate? = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)

        repo.save(Journal("Get to know Spring Boot", "Today I will learn Spring Boot", date))
        repo.save(Journal("Simple Spring Boot Project", "I will do my first Spring Boot Project", date))
        repo.save(Journal("Spring Boot Reading", "Read more about Spring Boot", date))
        repo.save(Journal("Spring Boot in the Cloud", "Spring Boot using Cloud Foundry", date))
        repo.save(Journal("Kotlin in Action", "Learn Kotlin", date))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringbootwebApplication::class.java, *args)
}