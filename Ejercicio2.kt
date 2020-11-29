//creamos la clase que almacena el recinto qde la universidad y la direccion del mismo 
class Universidad(var recinto:String, var direccion:String)
//  utilizamos la clase persona que esta el los ejerciicos anteriores y usamamos open para hacerla compartida
open class Persona(var nombre:String, var apellido:String,var cedula:String,var edad:Int)
//creamos la clase profesores donde tendran los parametros para representarlos
class Profesores(nombre:String, apellido:String, cedula:String, edad:Int,var Area_academica:String, var N_de_asignaturas:Int) : Persona(nombre,apellido,cedula,edad) // en las proximas 3 lineas tendremos compartida la clase de persona
//creamo la clase de estudiante  con los parametros correspondientes
class Estudiante(nombre:String, apellido:String, cedula:String, edad:Int, var nivelE:String, var profesor:String) :  Persona(nombre,apellido,cedula,edad)
//de igual forma con la clase de administrativos
class Administrativos(nombre:String, apellido:String, cedula:String, edad:Int,var area:String, var superior:String) : Persona(nombre,apellido,cedula,edad)
// manetenemos compartida toda la clase de persona ya que todas las clases contienen personas ya sean los estuudiantes, administrativos y docentes
fun main(){

    
    var lista_de_recintos = ArrayList<Universidad>()
    var Recinto1 = Universidad("LAS MINAS","Barrio Lusi delgadillo");
    var Recinto2= Universidad("BILWI","Barrio wawa");
    var Recinto3 = Universidad("NUEVA GUINEA","19 de julio");

    lista_de_recintos.add(Recinto1)
    lista_de_recintos.add(Recinto2)
    lista_de_recintos.add(Recinto3)

    var lista_de_profesores = ArrayList<Profesores>()
    var profesor1 = Profesores("Yesser","Miranda","610-24124585-85456F",25,"Ingeniería",4)
    var profesor2 = Profesores("Elkis ","Ortega","001-247896-12555J",30,"Sistema",1)
    var profesor3 = Profesores("Judith","Amador","612-784512-12554P",34,"Licenciada",4)

    lista_de_profesores.add(profesor1)
    lista_de_profesores.add(profesor2)
    lista_de_profesores.add(profesor3)
    //ESTUDIANTES CLASE
    var lista_de_estudiantes = ArrayList<Estudiante>()
    var estudiante1 = Estudiante("Faruck","Chavarria","610-634587-1005E",20,"Tercero","Yesser Miranda")
    var estudiante2 = Estudiante("Anier","Flores","610-789632-1004E",22,"Tercero","Elkis ortega")
    var estudiante3 = Estudiante("Josue","Morales","610-586526-1003E",19,"Cuarto","Judith Amador")


    lista_de_estudiantes.add(estudiante1)
    lista_de_estudiantes.add(estudiante2)
    lista_de_estudiantes.add(estudiante3)

    //ADMINISTRATIVOS CLASE
    var lista_de_administrativos = ArrayList<Administrativos>()
    var administrador1 = Administrativos("Daylin","Torrez","610-78965234-5022L",30,"Administración","Leonor Ruiz")
    var administrador2 = Administrativos("hazel","America","610-746532-0000p",25,"Recursos Humanos","Leonor Ruiz")
    var administrador3 = Administrativos("Francisco","gutierrez","610-478568-2000E",32,"Coperacion Extrerna","Leonor Ruiz")

    lista_de_administrativos.add(administrador1)
    lista_de_administrativos.add(administrador2)
    lista_de_administrativos.add(administrador3)

            println("\nUNIVERSIDAD")

            for(i in 0..2){
                println("\nUniversidad : URACCAN \nRECINTO : ${lista_de_recintos[i].recinto} \n DIRECCION : ${lista_de_recintos[i].direccion}")
            }

            println("\nPROFESORES")

            for(i in 0..2){
                println("\n${i}  NOMBRE Y APELLIDO : ${lista_de_profesores[i].nombre}_${lista_de_profesores[i].apellido}\n CÉDULA : ${lista_de_profesores[i].cedula} \n EDAD : ${lista_de_profesores[i].edad} \n Area : ${lista_de_profesores[i].Area_academica} \n CANTIDAD ASIGNATURAS : ${lista_de_profesores[i].N_de_asignaturas}")
            }

            println("\nESTUDIANTES")

            for(i in 0..2){
                println("\n${i}  NOMBRE Y APELLIDO : ${lista_de_estudiantes[i].nombre}_${lista_de_estudiantes[i].apellido}\n CÉDULA : ${lista_de_estudiantes[i].cedula} \n EDAD : ${lista_de_estudiantes[i].edad} \n NIVEL EDUCATIVO : ${lista_de_estudiantes[i].nivelE} \n PROFESOR REPRESENTANTE : ${lista_de_estudiantes[i].profesor}")
            } 

            println("\nADMINISTRATIVOS")

            for(i in 0..2){
                println("\n${i}  NOMBRE Y APELLIDO : ${lista_de_administrativos[i].nombre}_${lista_de_administrativos[i].apellido}\n CÉDULA : ${lista_de_administrativos[i].cedula} \n EDAD : ${lista_de_administrativos[i].edad} \nÁREA : ${lista_de_administrativos[i].area} \n Superior : ${lista_de_administrativos[i].superior}")
            }

}