fun main() {
    //     sumar(5, 10);
    // 		mayorEdad(18);
    // 		println(mes(11))
            val diaSemana = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo");
            println(diaSemana[1])
    }
    fun sumar(valor1:Int, valor2:Int){
        val numero1 = valor1;
        val numero2 = valor2;
        val resultado = numero1 + numero2;
        println("Su resutado es "+resultado);
    }
    fun mayorEdad(edad:Int){
        if(edad>=18){
            println("Usted es mayor de edad");
        }else{
            println("Usted es menor de edad");
        }
    }
    fun mes(numeroMes:Int):String{
        return when(numeroMes){
            1->"Enero"
            2->"Febrero"
            3->"Marzo"
            4->"Abril"
            5->"Mayo"
            6->"Junio"
            7->"Julio"
            8->"Agosto"
            9->"Septiembre"
            10->"Octubre"
            11->"Noviembre"
            12->"Diciembre"
            else ->"No es un mes valido"
        }
    }
    fun numeroTrimestre(numeroTrimestre:Int):String{
        return when(numeroTrimestre){
            1,2,3->"Primer Trimestre";
            4,5,6->"Segundo Trimestre";
            7,8,9->"Tercer Trimestre";
            else ->"El número de timestre no está registrado"
        }
    }
    fun numeroSemestre(numeroSemestre:Int):String{
       return when(numeroSemestre){
            in 1..6->"Primer semestre";
            in 7..12->"Segundo semestre";
    
            !in 1..12 ->"El número de semestre no está registrado";
           else->""
        }
    }