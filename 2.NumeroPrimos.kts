/*
Escribe un programa en Kotlin que verifique si un número introducido por el usuario es .
Un número primo es aquel que solo es divisible por 1 y por sí mismo.
:Pide al usuario que introduzca un número entero.Comprueba si el número es primo.
Imprime un mensaje indicando si el número es primo o no.
*/

println("Indica un número")
//val numero = readLine()!!.toInt()//indican las exclamaciones que el valor no sera null sino slatara una excepcion
val numero = readLine()?.toInt()

if(numero!=null){
    var Es_primo = true
    var limite = (numero*0.5).toInt()+2

    for(i in 2 until limite){
        if(numero % i == 0){
            Es_primo=false
            break
        }
    }

    if (Es_primo){
        print("Es primo")
    }else{
        print("No es primo")
    }

}else{
    print("valor no válido")
}

