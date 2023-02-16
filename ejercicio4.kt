//Ejercicio con mapas:
//Ingrese al sistema el nit y nombre de usuario el cual inicie sesión
//y si su nit es mayor o igual a 45 es administrador y si no es cliente normal

fun main() {
    val clientes: Map<Int, String> =mapOf()
    val nit= readLine("Ingrese su nit")
    val nombre= to string() readLine("Ingrese su noombre")
    if(nit>=45){
    println("Señor ${nombre} su nit es ${nit} y usted es usuario administrador" )
    clientes.put(key: nit, value: "nombre"):
    }else if(nit<45){
    println("Señor ${nombre} su nit es ${nit} y usted es usuario normal" ))
    }
    }