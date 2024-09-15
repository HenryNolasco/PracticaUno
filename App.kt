fun main() {
    println("Ingrese el primer nuemero")
    val numeroUno = readLine()?.toDouble()

    println("Ingrese el segundo numero")
    val numeroDos = readLine()?.toDouble()

    println("Ingrese la operacion (+, -, *, /):")
    val operacion = readLine()

    calculate(numeroUno, numeroDos, operacion)
}

fun calculate(numeroUno: Double?, numeroDos: Double?, operacion: String?){
    if (numeroUno == null || numeroDos == null || operacion == null){
        println("Error: Ingrese numero validos y una operacion valida.")
        return
    }

    val resultado = when (operacion){
        "+" -> numeroUno + numeroDos
        "-" -> numeroUno - numeroDos
        "*" -> numeroUno * numeroDos
        "/" -> numeroUno / numeroDos
        else -> {
            println("Error: Operacion no valida.")
            return
        }
    }

    println("Resultado de la operacion $numeroUno $operacion $numeroDos = $resultado")
}