package br.com.alura.bytebank.modelo

var totalContas = 0
    private set //garante que essa variavel possa ser modificada apenas nesse arquivo onde ela é declarada

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}