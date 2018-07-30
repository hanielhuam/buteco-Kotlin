package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.controller.GarconController
import br.com.residenciati.buteco.repository.GarconRepository

class GarconView {
    var garconController: GarconController? = null

    var garconRepository: GarconRepository? = null

    init {
        garconRepository = GarconRepository()
        garconController = GarconController(garconRepository!!)
    }
}
