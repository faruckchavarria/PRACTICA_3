/*class Persona{
    var nombre:String = ""
    var apellido:String = ""
    constructor(){
    }
    constructor(n:String, a:String):this()
    {
    nombre=n
    apellido=a
    }

   }*/
   class Persona(var nombre:String, var apellido:String)

   fun main(){
    var persona = Persona("Yesser","Miranda")
  //  var nueva = Persona()
   // nueva.nombre = "Juan"
   // nueva.apellido = "Lopez"
    println(persona.nombre)
   // println(nueva.nombre)
    //realizamos que se crea un constructor vacio y luego de eso atraves de la inicializacion del constructor, y se realiza el llamado de la clase para imprimir el nombre y el nuevo nombre

   }
   