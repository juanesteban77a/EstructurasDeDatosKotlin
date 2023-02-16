//Ejercicio con listas:
//Vamos a permitir ingresar datos de manera manual,
//y también recorrerlos para saber sus nuevos valores

//
fun main() {
    val oneToFiveList: List<Int> = listOf(1, 2, 3, 4, 5)
   
val num=readLIne("Ingrese un numero para agregar a la lista");
oneToFiveList.add(num);
//Aqui recorremos la lista para saber sus valores
    for (i in oneToFiveList) {
        println(i)
    }
}
}