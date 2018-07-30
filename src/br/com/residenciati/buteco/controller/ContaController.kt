package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.Conta
import br.com.residenciati.buteco.model.ItemConta
import br.com.residenciati.buteco.repository.ContaRepository

class ContaController(val contaRepository: ContaRepository) {

    fun salvar(conta: Conta) {
        contaRepository.addConta(conta)
    }

    fun remover(conta: Conta) {
        contaRepository.removeConta(conta)
    }

    fun atualizar(contaOld: Conta, contaNew: Conta) {
        contaRepository.removeConta(contaOld)
        contaRepository.addConta(contaNew)
    }

    fun adicionarItenConta(itemConta: ItemConta, conta: Conta) {
        conta.itens!!.add(itemConta)
    }

    fun removerItenConta(itemConta: ItemConta, conta: Conta) {
        conta.itens!!.add(itemConta)
    }

    fun listar(): String {
        var lista = "Lista de contas \n"

        for (i in 0 until contaRepository.contas.size) {
            lista += i.toString() + " - " + contaRepository.contas.get(i) + "\n"
        }
        return lista
    }

}
