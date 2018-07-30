package br.com.residenciati.buteco.model

data class Item(val descricao: String,
           val marca: String,
           val valor: Double) {

    override fun toString(): String {
        return "$descricao - $marca - $valor"
    }

}
