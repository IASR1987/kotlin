/*
Escribe un programa en Kotlin que sume todos los números de una lista predefinida y muestre el resultado.
 */

val Lista = listOf(1,2,3,4,5)

var suma=0

for(i in 0 until Lista.size){
    suma += Lista[i]
}

print("la suma de los numeros de esta lista es $suma")