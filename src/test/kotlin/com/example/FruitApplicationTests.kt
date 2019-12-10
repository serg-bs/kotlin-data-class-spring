package com.example

import com.example.models.Fruit
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.junit.Test

class FruitApplicationTests {

	@Test
	fun contextLoads() {
		val jsonAsString ="{\"name\":\"a\",\"description\":\"description\"}";
		val objectMapper = ObjectMapper();
		objectMapper.registerModule(ParameterNamesModule())
		val readValue = objectMapper.readValue(jsonAsString, Fruit::class.java)
		print("Cool parsing done. name =${readValue.name}")
	}
}
