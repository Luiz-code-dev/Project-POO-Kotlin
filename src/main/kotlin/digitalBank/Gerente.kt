package digitalBank

class Gerente(
    nome:String,
    cpf: String,
    salario: Double,
    val senha: String
    ) : Employee(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
}