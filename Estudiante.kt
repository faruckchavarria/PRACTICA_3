class Estudiante(nombre:String, apellido:String,
var asignatura:String,
 var profesor:String):
 Persona(nombre,apellido)

 open class Persona(var nombre:String, var apellido:String)

 fun main()
 {

    // var Est =Estudiante ("Victor","20","contabilidad","Luisdelgadillo")
    var estudiante = Estudiante("Yesser","Miranda","hola","que hace")
    println("Asignatura: ${estudiante.asignatura} con ${estudiante.nombre}")

 }