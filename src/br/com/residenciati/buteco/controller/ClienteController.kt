package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.Cliente
import br.com.residenciati.buteco.repository.ClienteRepository

class ClienteController(val clienteRepository: ClienteRepository) {

    fun salvar(cliente: Cliente) {
        clienteRepository.addCliente(cliente)
    }

    fun remover(cliente: Cliente) {
        clienteRepository.removeCliente(cliente)
    }

    fun atualizar(clienteOld: Cliente, clienteNew: Cliente) {
        clienteRepository.removeCliente(clienteOld)
        clienteRepository.addCliente(clienteNew)
    }

    fun listar(): String {
        var lista = "Lista de clientes \n"
        for (i in 0 until clienteRepository.clientes.size) {
            lista += i.toString() + " - " + clienteRepository.clientes.get(i) + "\n"
        }
        return lista
    }

}
