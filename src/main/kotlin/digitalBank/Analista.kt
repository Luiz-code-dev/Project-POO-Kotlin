package digitalBank


class Analista(nome:String, cpf: String, salario: Double) : Employee(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1
}