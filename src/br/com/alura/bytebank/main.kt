package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.novomodelo.Cliente as NovoCliente
import java.lang.String as StringJava

fun main() {
    val palavra: kotlin.String = ""
    val palavraJava: StringJava = StringJava("")

    val cliente = Cliente(nome = "Alex", cpf = "333.333.333-33", senha = 111222)
    //val clienteNovo = br.com.alura.bytebank.novomodelo.Cliente() //Quando tem duas classes com mesmo nome posso usar o fully qualified name
    val clienteNovo = NovoCliente() //ou utilizar um alias
}