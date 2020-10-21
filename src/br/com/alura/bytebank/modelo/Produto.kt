package br.com.alura.bytebank.modelo

//doc "Compile-Time Constants": https://kotlinlang.org/docs/reference/properties.html#compile-time-constants

//Exemplo de como e quando usar constante em tempo de compilação ou companion object:

const val taxaAdicional = 0.1

class Produto(
    private val nome: String,
    private val valor: Double
) {

    val preco: Double get() = valor + (valor * taxaAdicional)

//    companion object {
//        const val taxaAdicional = 0.1
//    }

}