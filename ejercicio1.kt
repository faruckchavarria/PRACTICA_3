class ejercicio1( var nombre:String, var apellido:String)

fun main ()

{

var lista = ArrayList<ejercicio1>()

var persona1 =ejercicio1("Faruck", "Chavarria")
var persona2 =ejercicio1("otro nombre", "otro apellido")
var persona3 =ejercicio1("jose", "martinez")

lista.add(persona1)
lista.add(persona2)
lista.add(persona3)

for (i in 0..2) {
    
    println("Nombre:${lista[i].nombre} ${lista[i].apellido}")
}

}