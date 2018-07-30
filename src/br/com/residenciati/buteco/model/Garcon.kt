package br.com.residenciati.buteco.model

data class Garcon(
        val matricula: String,
        override val nome: String,
        override val cpf: String
    ) : Pessoa(nome, cpf) {

    override fun toString(): String {
        return "$nome (matricula = $matricula )"
    }

}