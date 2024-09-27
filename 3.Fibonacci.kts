/*
Escribe un programa en Kotlin que imprima los primeros 10 números de la lista de Fibonacci .
En esta serie, cada número es la suma de los dos anteriores, comenzando con 0 y 1.
*/

println("Los diez primeros dígitos de la lista Fibonacci ")
var a=0
var b=1
var c= 0

for(i in 3..10){
   if(i==3){
       println("1. "+a)
       println("2. "+b)
   }
    c=a+b
    a=b
    b=c

    println("$i. $c")
}