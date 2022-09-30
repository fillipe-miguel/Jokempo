package com.example.jokempo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jokempo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	private lateinit var binding: ActivityMainBinding
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		binding = ActivityMainBinding.inflate(layoutInflater)

		setContentView(binding.root)

		val newGame = Game()
		val computer = Computer()
		val player = Player()

		binding.btnPlay.setOnClickListener {

			player.chose(binding.rbChoise.checkedRadioButtonId)

			newGame.play(baseContext, player.chose, computer.chose())

		}
	}
}

