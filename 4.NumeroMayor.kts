import kotlin.math.max

/*
Escribe un programa en Kotlin que, dada una lista de números, encuentre el número mayor .
*/

var lista = mutableListOf(1,9,2,8,3,7,4,63,5)

println(lista)
var numero=0
val tamanoLista= lista.size

for(i in 0 until lista.size){//until excluye
    println(lista[i])
    if(numero<lista[i]){
        numero=lista[i]
    }
}

print("el número mayor es ")
print(numero)