package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Any){
        if(funcionario is Funcionario) { //smart cast: verifica e faz o cast
            this.total += funcionario.bonificacao
        }
    }

}