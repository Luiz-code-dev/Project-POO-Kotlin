package digitalBank.test
import digitalBank.Employee

class imprimeRelatorioEmployee {

    companion object {
        fun imprime(employee: Employee) {
            println(
                employee.toString()
            )
        }
    }
}