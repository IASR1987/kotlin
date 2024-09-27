/*
Escribe un programa en Kotlin que convierta una temperatura de grados a .
:Pide al usuario que ingrese una temperatura en grados Celsius.Realiza la conversión a Fahrenheit.
Imprime el resultado.
*/
fun main() {
    print("Introduce una temperatura en grados Celsius:\n")

    val Celsius = readLine()!!.toInt() // Lee la entrada y convierte a Int

    val Fahrenheit = 32 + (Celsius * 9 / 5) // Convierte Celsius a Fahrenheit

    println("$Celsius grados Celsius son $Fahrenheit grados Fahrenheit") // Usa interpolación de cadenas
}

main()