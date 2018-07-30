package br.com.residenciati.buteco.view

import br.com.residenciati.buteco.model.*
import java.util.Scanner

import javax.swing.JOptionPane

object MainView {

    @JvmStatic
    fun main(args: Array<String>) {


        val itemView = ItemView()
        val clienteView = ClienteView()
        val contaView = ContaView()
        val garconView = GarconView()
        val mesaView = MesaView()

        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar")
            println("Selecione um garcon abaixo: ")
            println("1 - Item")
            println("2 - Cliente")
            println("3 - Conta")
            println("4 - Garcon")
            println("5 - Mesa")
            println("6 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            when (choice) {
                1 -> renderItemView(itemView)
                2 -> renderClienteMenu(clienteView)
                3 -> renderContaMenu(contaView, garconView, clienteView, mesaView, itemView)
                4 -> renderGarconMenu(garconView)
                5 -> renderMesaMenu(mesaView)
                6 -> keepMenu = false
                else -> {
                }
            }
        }


    }

    private fun renderItemView(itemView: ItemView) {
        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar - ITEM")
            System.out.println(itemView.itemController!!.listar())
            println("Selecione uma das opções: ")
            println("1 - Adicionar")
            println("2 - Alterar")
            println("3 - Remover")
            println("4 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            val descricao: String
            val marca: String
            val valor: Double
            val item: Item

            when (choice) {
                1 -> {
                    descricao = JOptionPane.showInputDialog("Descrição:")
                    marca = JOptionPane.showInputDialog("Marca:")
                    valor = (JOptionPane.showInputDialog("Valor:")).toDouble()

                    item = Item(descricao, marca, valor)

                    itemView.itemController!!.salvar(item)
                }
                2 -> {
                    println("Mesa De Bar - EDITAR ITEM")
                    System.out.println(itemView.itemController!!.listar())
                    println("Selecione um item para editar: ")

                    choice = scanner.nextInt()

                    descricao = JOptionPane.showInputDialog("Descrição:")
                    marca = JOptionPane.showInputDialog("Marca:")
                    valor = (JOptionPane.showInputDialog("Valor:")).toDouble()

                    item = Item(descricao, marca, valor)

                    itemView.itemController!!.atualizar(itemView.itemRepository!!.itens.get(choice), item)
                }
                3 -> {
                    println("Mesa De Bar - REMOVER ITEM")
                    System.out.println(itemView.itemController!!.listar())
                    println("Selecione um item para remover: ")

                    choice = scanner.nextInt()
                    itemView.itemController!!.remover(itemView.itemRepository!!.itens.get(choice))
                }
                4 -> keepMenu = false
                else -> {
                }
            }
        }

    }

    private fun renderMesaMenu(mesaView: MesaView) {
        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar - mesa")
            System.out.println(mesaView.mesaController!!.listar())
            println("Selecione uma das opções: ")
            println("1 - Adicionar")
            println("2 - Alterar")
            println("3 - Remover")
            println("4 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            val numero: Int
            val mesa: Mesa

            when (choice) {
                1 -> {
                    numero = (JOptionPane.showInputDialog("Numero:")).toInt()

                    mesa = Mesa(numero)

                    mesaView.mesaController!!.salvar(mesa)
                }
                2 -> {
                    println("Mesa De Bar - EDITAR MESA")
                    System.out.println(mesaView.mesaController!!.listar())
                    println("Selecione um mesa para editar: ")

                    choice = scanner.nextInt()

                    numero = (JOptionPane.showInputDialog("Numero:")).toInt()

                    mesa = Mesa(numero)

                    mesaView.mesaController!!.atualizar(mesaView.mesaRepository!!.mesas.get(choice), mesa)
                }
                3 -> {
                    println("Mesa De Bar - REMOVER MESA")
                    System.out.println(mesaView.mesaController!!.listar())
                    println("Selecione um mesa para remover: ")

                    choice = scanner.nextInt()
                    mesaView.mesaController!!.remover(mesaView.mesaRepository!!.mesas.get(choice))
                }
                4 -> keepMenu = false
                else -> {
                }
            }
        }
    }

    private fun renderGarconMenu(garconView: GarconView) {
        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar - GARCON")
            System.out.println(garconView.garconController!!.listar())
            println("Selecione uma das opções: ")
            println("1 - Adicionar")
            println("2 - Alterar")
            println("3 - Remover")
            println("4 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            val nome: String
            val matricula: String
            val garcon: Garcon

            when (choice) {
                1 -> {
                    nome = JOptionPane.showInputDialog("Nome:")
                    matricula = JOptionPane.showInputDialog("Matricula:")

                    garcon = Garcon(nome, matricula, "000.000.000-00")

                    garconView.garconController!!.salvar(garcon)
                }
                2 -> {
                    println("Mesa De Bar - EDITAR GARCON")
                    System.out.println(garconView.garconController!!.listar())
                    println("Selecione um garcon para editar: ")

                    choice = scanner.nextInt()

                    nome = JOptionPane.showInputDialog("Nome:")
                    matricula = JOptionPane.showInputDialog("Matricula:")

                    garcon = Garcon(nome, matricula,"000.000.000-00")

                    garconView.garconController!!.atualizar(garconView.garconRepository!!.garcons.get(choice), garcon)
                }
                3 -> {
                    println("Mesa De Bar - REMOVER GARCON")
                    System.out.println(garconView.garconController!!.listar())
                    println("Selecione um garcon para remover: ")

                    choice = scanner.nextInt()
                    garconView.garconController!!.remover(garconView.garconRepository!!.garcons.get(choice))
                }
                4 -> keepMenu = false
                else -> {
                }
            }
        }
    }

    private fun renderClienteMenu(clienteView: ClienteView) {
        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar - CLIENTE")
            System.out.println(clienteView.clienteController!!.listar())
            println("Selecione uma das opções: ")
            println("1 - Adicionar")
            println("2 - Alterar")
            println("3 - Remover")
            println("4 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            val nome: String
            val cpf: String
            val credito: Double?
            val cliente: Cliente

            when (choice) {
                1 -> {
                    nome = JOptionPane.showInputDialog("Nome:")
                    cpf = JOptionPane.showInputDialog("CPF:")
                    credito = java.lang.Double.parseDouble(JOptionPane.showInputDialog("Credito:"))

                    cliente = Cliente(nome, cpf, credito)

                    clienteView.clienteController!!.salvar(cliente)
                }
                2 -> {
                    println("Mesa De Bar - EDITAR CLIENTE")
                    System.out.println(clienteView.clienteController!!.listar())
                    println("Selecione um cliente para editar: ")

                    choice = scanner.nextInt()

                    nome = JOptionPane.showInputDialog("Nome:")
                    cpf = JOptionPane.showInputDialog("CPF:")
                    credito = (JOptionPane.showInputDialog("Credito:")).toDouble()

                    cliente = Cliente(nome, cpf, credito)

                    clienteView.clienteController!!.atualizar(clienteView.clienteRepository!!.clientes.get(choice), cliente)
                }
                3 -> {
                    println("Mesa De Bar - REMOVER CLIENTE")
                    System.out.println(clienteView.clienteController!!.listar())
                    println("Selecione um cliente para remover: ")

                    choice = scanner.nextInt()
                    clienteView.clienteController!!.remover(clienteView.clienteRepository!!.clientes.get(choice))
                }
                4 -> keepMenu = false
                else -> {
                }
            }
        }

    }

    private fun renderContaMenu(contaView: ContaView, garconView: GarconView, clienteView: ClienteView, mesaView: MesaView, itemView: ItemView) {
        var keepMenu = true
        var choice: Int

        while (keepMenu) {
            println("Mesa De Bar - CONTA")
            System.out.println(contaView.contaController!!.listar())
            println("Selecione uma das opções: ")
            println("1 - Adicionar Nova Conta")
            println("2 - Adicionar Itens a uma Conta")
            println("3 - Alterar")
            println("4 - Remover")
            println("5 - Sair")

            val scanner = Scanner(System.`in`)
            choice = scanner.nextInt()

            val garconSelecionado: Garcon
            val clienteSelecionado: Cliente
            val mesaSelecionada: Mesa
            val itemSelecionado: Item
            val conta: Conta
            val itemConta: ItemConta

            val garconsArray = garconView.garconRepository!!.garcons.toTypedArray()
            val clientesArray = clienteView.clienteRepository!!.clientes.toTypedArray()
            val mesasArray = mesaView.mesaRepository!!.mesas.toTypedArray()
            val itensArray = itemView.itemRepository!!.itens.toTypedArray()

            when (choice) {
                1 -> {
                    garconSelecionado = JOptionPane.showInputDialog(null, "Selecione um Garcon", "Lista de Garcons",
                            JOptionPane.QUESTION_MESSAGE, null, garconsArray, garconsArray[0]) as Garcon

                    clienteSelecionado = JOptionPane.showInputDialog(null, "Selecione um Cliente", "Lista de Clientes",
                            JOptionPane.QUESTION_MESSAGE, null, clientesArray, clientesArray[0]) as Cliente

                    mesaSelecionada = JOptionPane.showInputDialog(null, "Selecione uma Mesa", "Lista de Mesas",
                            JOptionPane.QUESTION_MESSAGE, null, mesasArray, mesasArray[0]) as Mesa

                    conta = Conta(garconSelecionado,
                            clienteSelecionado,
                            mesaSelecionada)

                    contaView.contaController!!.salvar(conta)
                }
                2 -> {
                    println("Mesa De Bar - ADICIONAR ITENS A CONTA")
                    System.out.println(contaView.contaController!!.listar())
                    println("Selecione uma conta para editar: ")

                    choice = scanner.nextInt()

                    itemSelecionado = JOptionPane.showInputDialog(null, "Selecione um Item", "Lista de Items",
                            JOptionPane.QUESTION_MESSAGE, null, itensArray, itensArray[0]) as Item

                    val quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"))

                    val contaAtual = contaView.contaRepository!!.contas.get(choice)
                    itemConta = ItemConta(contaAtual, itemSelecionado, quantidade)

                    contaAtual.itens.add(itemConta)
                    keepMenu = false
                }
                5 -> keepMenu = false
                else -> {
                }
            }
        }
    }
}



