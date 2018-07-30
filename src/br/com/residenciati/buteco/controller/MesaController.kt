package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.Mesa
import br.com.residenciati.buteco.repository.MesaRepository

class MesaController(private val mesaRepository: MesaRepository) {

    fun salvar(mesa: Mesa) {
        mesaRepository.addMesa(mesa)
    }

    fun remover(mesa: Mesa) {
        mesaRepository.removeMesa(mesa)
    }

    fun atualizar(mesaOld: Mesa, mesaNew: Mesa) {
        mesaRepository.removeMesa(mesaOld)
        mesaRepository.addMesa(mesaNew)
    }

    fun listar(): String {
        var lista = "Lista de mesas: \n"
        for (i in 0 until mesaRepository.mesas.size) {
            lista += i.toString() + " - Mesa: " + mesaRepository.mesas.get(i) + "\n"
        }
        return lista
    }
}
