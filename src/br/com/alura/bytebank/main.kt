package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.teste.testaContasDiferentes

fun main() {
    var totalContas = 0
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    ContaPoupanca(titular = alex, numero = 1000)
    totalContas++

    testaContasDiferentes()

    println("Total de contas: $totalContas")
}