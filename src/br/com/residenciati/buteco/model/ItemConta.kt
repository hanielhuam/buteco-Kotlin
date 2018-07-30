package br.com.residenciati.buteco.model

class ItemConta(var conta: Conta?, var item: Item?, var quantidade: Int) {

    val valor: Double

    init {
        this.valor = quantidade * item!!.valor
    }

    override fun toString(): String {
        return item.toString() + " - qtd: $quantidade"
    }

}
