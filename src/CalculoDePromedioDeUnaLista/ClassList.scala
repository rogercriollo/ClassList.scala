package CalculoDePromedioDeUnaLista

object ClassList extends App {
  val lista: List[Int] = List(1, 2, 3, 4, 5)
  println(lista)

  println(lista.head)
  println(lista(0))
  println(lista ++ List(5, 6, 7))
  println(lista.sorted)
  // list de enteros
  val listEnteros: List[Int] = List(1, 2, 3, 4, 5)
  println(listEnteros)
  // list vacía
  val listaVacia: List[Null] = List()
  println(listaVacia)
  // Lista bidimensional
  val matriz: List[List[Int]] = List(List(1, 2, 0), List(8, 1, 3), List(9, 0, 1))
  println(matriz)

  // list de cadenas
  val listaString: List[String] = List(" whatsapp ", " instagran  ", " facebook ", "twiter", "messeger")
  println(listaString)

  val listaString4 = " instagram " :: (" facebook " :: (" whatsapp " :: (" instagram " :: Nil)))
  println(listaString4.head)
  println(listaString4.tail)
  println(listaString4.empty)
  var RedesSocialesMasUsadas: List[String] = List(" facebook , whatsapp , instagram ")
  var RedesSocialesMenosUsadas = " twiter " :: (" telegram " :: (" messeger " :: Nil))

  var Redes = RedesSocialesMasUsadas ::: RedesSocialesMasUsadas
  println(Redes)

  Redes = RedesSocialesMasUsadas.:::(RedesSocialesMenosUsadas)
  println(Redes)
  // llena las veces necesarias con el paràmetro enviado

  val listaString3: List[String] = List.fill(5)(" facebbok ")
  println(listaString3)

  val listaEntero3: List[Int] = List.fill(3)(4)
  println(listaEntero3)


  println ( " Creacion de  una lista Scala: " )
  println ( " List: " )


  object Test {
    def main(args: Array[String]) {
      val site = "facebbok" :: ("instagram" :: ("messeger" :: Nil))
      println ("sitio antes de la reversión:" + listEnteros)
      println ("Antes de la reversión del sitio:" + site.reverse)
  }
    // Promedio Lita

    def  proArrayScala ( intArray : List [ Int ]) =
    {
      val  suma  = intArray.sum
      val  promedio  = (suma) / intArray.length
      (promedio)
    }

    val  list  = List ( 1 , 4 , 8 )
    val  promFinal  = proArrayScala (list)
    println (promFinal)



  }
}