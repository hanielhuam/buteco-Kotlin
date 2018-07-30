package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.ContaController
import br.com.residenciati.buteco.repository.ContaRepository


class ContaView {
    var contaController: ContaController? = null

    var contaRepository: ContaRepository? = null

    init {
        contaRepository = ContaRepository()
        contaController = ContaController(contaRepository!!)
    }
}
