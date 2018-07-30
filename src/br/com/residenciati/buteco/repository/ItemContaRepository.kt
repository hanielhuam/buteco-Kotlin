package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.ItemConta
import java.util.ArrayList

class ItemContaRepository {

    var itens = mutableListOf<ItemConta>()

    fun addItemConta(itemConta: ItemConta) {
        itens.add(itemConta)
    }

    fun removeItemConta(itemConta: ItemConta) {
        itens.remove(itemConta)
    }

}
