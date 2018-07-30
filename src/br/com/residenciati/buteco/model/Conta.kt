package br.com.residenciati.buteco.model

class Conta(
        val garcon: Garcon? = null,
        val cliente: Cliente? = null,
        val mesa: Mesa? = null
) {

    var itens = mutableListOf<ItemConta>()

    override fun toString(): String {
        var listaItemConta: String = ""

        if (itens != null) {
            for (itemConta in itens!!) {
                listaItemConta += "\t$itemConta\n"
            }
        }

        return """
            Garcon: $garcon
            "Mesa: $mesa
            "Itens: $listaItemConta
        """.trimIndent()
    }

}
