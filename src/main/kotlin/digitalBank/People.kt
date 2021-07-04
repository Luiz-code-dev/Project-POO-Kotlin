package digitalBank

class People {

    var nome: String = "Luiz"

    var cpf: String = "123.456.789-10"
    private set

    constructor()

    fun pessoaInf() = "$nome e $cpf"


}

fun main() {

    val Luiz = People()
    println(Luiz.pessoaInf())
}