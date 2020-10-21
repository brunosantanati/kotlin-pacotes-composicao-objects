package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco()

    println()
    println(1)
    println(1.0)
    println(true)
    println("teste")
    println(endereco) //isso funciona porque o Kotlin implementou a função recebendo um objeto do tipo Any

    //sobregarca
    imprime()
    imprime(1)
    imprime(1.0)
    imprime(endereco) //criamos uma função que recebe um Endereco
}

fun imprime(){

}

fun imprime(valor: Int){

}

fun imprime(valor: Double){

}

fun imprime(endereco: Endereco){

}