package com.example.jokempo

class Computer {
	fun chose(): Int{
		//Coloquei de 0 until 4 porque o until exclui o ultimo numero!!
		return (0 until 4).random()
	}
}