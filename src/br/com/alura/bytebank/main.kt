package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {
    val endereco = Endereco()
    val enderecoNovo = Endereco()
    val enderecoNovo2 = endereco

    println(endereco.equals(endereco)) //equals que Endereco herda de Any
    println(endereco.equals(enderecoNovo))
    println(endereco.equals(enderecoNovo2))

    println(endereco.hashCode()) //hashCode que Endereco herda de Any
    println(enderecoNovo.hashCode())

    println(endereco.toString()) //toString que Endereco herda de Any
    println(enderecoNovo.toString())

    //simulando um toString() padrão:
    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")
}