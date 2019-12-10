package com.example.controller

import com.example.models.Fruit
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class FruitController() {

	@PostMapping("/fruits")
    fun createJournal(@Valid @RequestBody request : Fruit) {
		print(request)
	}
}