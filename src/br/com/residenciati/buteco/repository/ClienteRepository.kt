package br.com.residenciati.buteco.repository

import br.com.residenciati.buteco.model.Cliente

class ClienteRepository {

    var clientes = mutableListOf<Cliente>()

    init {

        val c1 = Cliente("Igor", "082.863.864-00", 15.0)
        val c2 = Cliente("Flavio", "084.861.004-97", 0.0)
        val c3 = Cliente("Janine", "455.294.444-71", 6.0)
        val c4 = Cliente("Haniel", "065.894.456-01", 70.0)
        val c5 = Cliente("Brandão", "066.354.6674-53", 98.0)
        val c6 = Cliente("Yargo", "981.569.212-40", -3.0)
        val c7 = Cliente("Igor", "050.501.334-90", -3.0)

        this.clientes.add(c1)
        this.clientes.add(c2)
        this.clientes.add(c3)
        this.clientes.add(c4)
        this.clientes.add(c5)
        this.clientes.add(c6)
        this.clientes.add(c7)
    }

    fun addCliente(cliente: Cliente) {
        clientes.add(cliente)
    }

    fun removeCliente(cliente: Cliente) {
        clientes.remove(cliente)
    }

}
