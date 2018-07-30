package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.Garcon
import java.util.ArrayList

class GarconRepository {

    var garcons = mutableListOf<Garcon>()

    init {

        val g1 = Garcon("157671", "Joao", "217.694.567-32")
        val g2 = Garcon("157672", "Carlos", "457.674.850-23")
        val g3 = Garcon("157673", "Victor", "561.905.567-54")
        val g4 = Garcon("157674", "Silvio", "564.634.672-65")

        garcons.add(g1)
        garcons.add(g2)
        garcons.add(g3)
        garcons.add(g4)
    }

    fun addGarcon(garcon: Garcon) {
        garcons.add(garcon)
    }

    fun removeGarcon(garcon: Garcon) {
        garcons.remove(garcon)
    }

}
