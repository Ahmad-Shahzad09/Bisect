package com.example.git

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitApplication

fun main(args: Array<String>) {
	println("Hello World!")
	runApplication<GitApplication>(*args)
	println("Hello World!")
	this is just to introduce error
}
