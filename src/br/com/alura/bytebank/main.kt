package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-000"
    )

    val enderecoNovo = Endereco(
        bairro = "Vila Mariana",
        numero = 1000,
        cep = "00000-000"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode()) //hashCode que Endereco herda de Any
    println(enderecoNovo.hashCode())

    println(endereco.toString()) //toString que Endereco herda de Any
    println(enderecoNovo.toString())

    //simulando um toString() padrão:
    println("${endereco.javaClass}@${java.lang.Integer.toHexString(endereco.hashCode())}")
}