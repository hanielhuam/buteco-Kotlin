package br.com.residenciati.buteco.controller

import br.com.residenciati.buteco.model.Garcon
import br.com.residenciati.buteco.repository.GarconRepository

class GarconController(val garconRepository: GarconRepository) {

    fun salvar(garcon: Garcon) {
        garconRepository.addGarcon(garcon)
    }

    fun remover(garcon: Garcon) {
        garconRepository.removeGarcon(garcon)
    }

    fun atualizar(garconOld: Garcon, garconNew: Garcon) {
        garconRepository.removeGarcon(garconOld)
        garconRepository.addGarcon(garconNew)
    }

    fun listar(): String {
        var lista = "Lista de garcons \n"
        for (i in 0 until garconRepository.garcons.size) {
            lista += i.toString() + " - " + garconRepository.garcons.get(i) + "\n"
        }
        return lista
    }

}
