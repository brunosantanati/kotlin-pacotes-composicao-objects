package br.com.alura.bytebank.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
    private val senha: Int
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Cliente(nome='$nome', cpf='$cpf', senha=$senha)"
    }

}