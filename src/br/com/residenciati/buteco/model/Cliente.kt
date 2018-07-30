package br.com.residenciati.buteco.model

data class Cliente(
        override val nome: String,
        override val cpf: String,
        val credito: Double?
    )    : Pessoa(nome, cpf) {

    override fun toString(): String {
        return "$nome - $cpf (Credito: ${credito!!} )"
    }

}
