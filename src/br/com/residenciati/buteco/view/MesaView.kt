package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.MesaController
import br.com.residenciati.buteco.repository.MesaRepository

class MesaView {

    var mesaController: MesaController? = null

    var mesaRepository: MesaRepository? = null

    init {
        mesaRepository = MesaRepository()
        mesaController = MesaController(mesaRepository!!)
    }

}
