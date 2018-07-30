package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.Item
import java.util.ArrayList

class ItemRepository {

    var itens = mutableListOf<Item>()

    init {

        val i1 = Item("Cerveja", "Heineken", 5.0)
        val i2 = Item("Cerveja", "Skol", 4.0)
        val i3 = Item("Dose de Cachaca", "Samanau", 5.0)

        itens.add(i1)
        itens.add(i2)
        itens.add(i3)
    }

    fun addItem(item: Item) {
        itens.add(item)
    }

    fun removeItem(item: Item) {
        itens.remove(item)
    }
}
