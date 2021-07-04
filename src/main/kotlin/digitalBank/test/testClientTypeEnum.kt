package digitalBank.test
import digitalBank.ClientType

fun main(){

    ClientType.values().forEach {elemento ->
        println("${elemento.name} - $elemento")
    }

    val PESSOAFISICA = ClientType.PESSOAFISICA
    println("${PESSOAFISICA.name}  ")

}