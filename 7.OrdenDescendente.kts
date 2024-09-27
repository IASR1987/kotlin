/*
Escribe un programa en Kotlin que ordene una
lista de números en utilizando una función predefinida.
*/

var lista = mutableListOf(1,9,28,5,3,488,5,60,7,8,9)

var Nuevalista=lista.sorted()

print(Nuevalista)

Nuevalista= lista.sortedDescending()

print(Nuevalista)