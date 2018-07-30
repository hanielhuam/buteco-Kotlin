package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.Mesa
import java.util.ArrayList

class MesaRepository {

    var mesas = mutableListOf<Mesa>()

    init {

        val m1 = Mesa(1)
        val m2 = Mesa(2)
        val m3 = Mesa(3)
        val m4 = Mesa(4)
        val m5 = Mesa(5)

        mesas.add(m1)
        mesas.add(m2)
        mesas.add(m3)
        mesas.add(m4)
        mesas.add(m5)
    }

    fun addMesa(mesa: Mesa) {
        mesas.add(mesa)
    }

    fun removeMesa(mesa: Mesa) {
        mesas.remove(mesa)
    }

}
