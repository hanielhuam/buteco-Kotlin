package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.ClienteController
import br.com.residenciati.buteco.repository.ClienteRepository

class ClienteView {
    var clienteController: ClienteController? = null

    var clienteRepository: ClienteRepository? = null

    init {
        clienteRepository = ClienteRepository()
        clienteController = ClienteController(clienteRepository!!)
    }
}
