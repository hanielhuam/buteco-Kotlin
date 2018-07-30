package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.ItemController
import br.com.residenciati.buteco.repository.ItemRepository

class ItemView {

    var itemController: ItemController? = null

    var itemRepository: ItemRepository? = null

    init {
        itemRepository = ItemRepository()
        itemController = ItemController(itemRepository!!)
    }

}
