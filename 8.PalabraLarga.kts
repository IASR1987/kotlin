/*Escribe un programa en Kotlin que encuentre la en una lista de cadenas.*/

val ListaPalabras = listOf("Ismael","Ángel","Soria","Riveros")

var palabraLargaTamano=0
var palabraLarga=""

for(i in 0 until ListaPalabras.size){
    if(ListaPalabras[i].length>palabraLargaTamano){
        palabraLargaTamano=ListaPalabras[i].length
        palabraLarga=ListaPalabras[i]
    }
}

print("la palabra más larga es $palabraLarga")