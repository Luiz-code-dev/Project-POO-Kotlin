package digitalBank



abstract class Employee(
    nome: String,
    cpf: String,
    val salario: Double
)   : People(nome, cpf) {
    abstract fun calculoAuxilio(): Double

    override fun toString(): String = """ 
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()


}