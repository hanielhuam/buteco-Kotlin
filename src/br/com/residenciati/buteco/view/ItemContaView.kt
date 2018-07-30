package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.ItemContaController
import br.com.residenciati.buteco.repository.ItemContaRepository

class ItemContaView {
    var itemContaController: ItemContaController? = null

    var itemContaRepository: ItemContaRepository? = null

    init {
        itemContaRepository = ItemContaRepository()
        itemContaController = ItemContaController(itemContaRepository!!)
    }
}
