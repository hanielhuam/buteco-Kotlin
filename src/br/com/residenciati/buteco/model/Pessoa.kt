package br.com.residenciati.buteco.model


open class Pessoa(nome: String, cpf: String) {

    open val nome: String? = nome

    open val cpf: String? = cpf

    var endereco: String? = null

    var telefone: String? = null

    override fun equals(obj: Any?): Boolean {
        if (this === obj) {
            return true
        }
        if (obj == null) {
            return false
        }
        if (javaClass != obj.javaClass) {
            return false
        }
        val other = obj as Pessoa?
        return this.cpf == other!!.cpf
    }

    override fun toString(): String {
        return "Pessoa{nome = $nome, CPF = $cpf}"
    }

}
