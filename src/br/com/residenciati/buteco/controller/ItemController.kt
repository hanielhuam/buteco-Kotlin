package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.Item
import br.com.residenciati.buteco.repository.ItemRepository

class ItemController(val itemRepository: ItemRepository) {

    fun salvar(item: Item) {
        itemRepository.addItem(item)
    }

    fun remover(item: Item) {
        itemRepository.removeItem(item)
    }

    fun atualizar(itemOld: Item, itemNew: Item) {
        itemRepository.removeItem(itemOld)
        itemRepository.addItem(itemNew)
    }

    fun listar(): String {
        var lista = "Lista de itens: \n"
        for (i in 0 until itemRepository.itens.size) {
            lista += i.toString() + " - " + itemRepository.itens.get(i) + "\n"
        }
        return lista
    }
}
