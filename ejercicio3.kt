//Ejercicio con conjuntos:
//Ejercicio el cual le permita ingresar su nombre y su edad y le calcule
//si es mayor de edad o no, si es mayor de edad lo almacena en el conjunto
//si no le dirá intente cuando sea mayor
fun main() {
val conjuntoMezclado = setOf(nombre,edad)
val nombre to tring()=readLIne ("Ingrese su nombre");
val edad to int()=readLIne("Ingrese edad");
if(edad>=18){
println("Señor ${nombre} su edad es ${edad}")
conjuntoMezclado.add(nombre, edad)
}else{
println("Señor ${nombre}por favor intente cuando sea mayor ")
}
}