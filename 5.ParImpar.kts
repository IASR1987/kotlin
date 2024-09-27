/*
Escribe un programa en Kotlin que verifique si un número dado es o .
El número estará definido en el código.
* */

println("introduce tu número")
val numero = readLine()?.toInt()


if(numero != null && numero % 2 == 0){
    println("es Par")
}else{
    println("es Impar")
}