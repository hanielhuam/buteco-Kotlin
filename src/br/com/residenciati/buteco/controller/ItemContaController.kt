package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.ItemConta
import br.com.residenciati.buteco.repository.ItemContaRepository

class ItemContaController(val itemContaRepository: ItemContaRepository) {

    fun salvar(itemConta: ItemConta) {
        itemContaRepository.addItemConta(itemConta)
    }

    fun remover(itemConta: ItemConta) {
        itemContaRepository.removeItemConta(itemConta)
    }

    fun atualizar(itemContaOld: ItemConta, itemContaNew: ItemConta) {
        itemContaRepository.removeItemConta(itemContaOld)
        itemContaRepository.addItemConta(itemContaNew)
    }

    fun listar(): String {
        var lista = "Lista de clientes \n"
        for (i in 0 until itemContaRepository.itens.size) {
            lista += i.toString() + " - " + itemContaRepository.itens.get(i) + "\n"
        }
        return lista
    }

}
