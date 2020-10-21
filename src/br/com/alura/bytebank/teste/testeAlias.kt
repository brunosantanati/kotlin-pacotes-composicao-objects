package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.novomodelo.Cliente as NovoCliente
import java.lang.String as StringJava

fun testeAlias(){
    val palavra: kotlin.String = "String Kotlin"
    val palavraJava: StringJava = StringJava("String Java")

    println(palavra)
    println(palavraJava)

    val cliente = Cliente(nome = "Alex", cpf = "333.333.333-33", senha = 111222)
    //val clienteNovo = br.com.alura.bytebank.novomodelo.Cliente() //Quando tem duas classes com mesmo nome posso usar o fully qualified name
    val clienteNovo = NovoCliente(nome = "Bruno") //ou utilizar um alias

    println(cliente)
    println(clienteNovo)
}