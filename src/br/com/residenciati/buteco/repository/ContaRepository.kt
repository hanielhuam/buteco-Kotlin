package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.Conta

class ContaRepository {

    val contas = mutableListOf<Conta>()

    init {

        val clienteRepository = ClienteRepository()
        val garconRepository = GarconRepository()
        val mesaRepository = MesaRepository()

        val c1 = Conta(garconRepository.garcons[0],
                clienteRepository.clientes[0],
                mesaRepository.mesas[2])

        val c2 = Conta(garconRepository.garcons[1],
                clienteRepository.clientes[1],
                mesaRepository.mesas[1])

        val c3 = Conta(garconRepository.garcons[1],
                clienteRepository.clientes[0],
                mesaRepository.mesas[2])

        contas.add(c1)
        contas.add(c2)
        contas.add(c3)
    }

    fun addConta(conta: Conta) {
        contas.add(conta)
    }

    fun removeConta(conta: Conta) {
        contas.remove(conta)
    }

}
