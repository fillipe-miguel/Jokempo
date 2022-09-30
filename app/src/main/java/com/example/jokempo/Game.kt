package com.example.jokempo

import android.content.Context
import android.widget.Toast

class Game {

	/*
			Pedra = 1
			Papel = 2
			Tesoura = 3

	*/

	private fun lose(baseContext: Context) {
		Toast.makeText(baseContext, R.string.txtLose, Toast.LENGTH_SHORT)
			.show()
	}

	private fun win(baseContext: Context) {
		Toast.makeText(baseContext, R.string.txtWin, Toast.LENGTH_SHORT)
			.show()
	}

	private fun draw(baseContext: Context) {
		Toast.makeText(baseContext, R.string.txtDraw, Toast.LENGTH_SHORT)
			.show()
	}

	fun play(baseContext: Context, userChose: Int, computerChose: Int) {
		when (userChose) {
			R.id.rbStone -> {
				when (computerChose) {
					1 -> draw(baseContext)
					2 -> lose(baseContext)
					else -> win(baseContext)
				}
			}

			R.id.rbPaper -> {
				when (computerChose) {
					1 -> win(baseContext)
					2 -> draw(baseContext)
					else -> lose(baseContext)
				}
			}

			R.id.rbScissor -> {
				when (computerChose) {
					1 -> lose(baseContext)
					2 -> win(baseContext)
					else -> draw(baseContext)
				}
			}
		}
	}

}