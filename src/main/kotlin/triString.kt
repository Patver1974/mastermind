//4) Sur base d'une liste de 10 valeurs de type String.
//      Réaliser un algorithme qui permet de trier en ordre croissant.
//    (Pour cet exercice, mettre en place un autre algorithme de trie)
//  NB: Ne pas utiliser les fonctions de trie du langage.
fun main(args: Array<String>) {
    var tmp:String?
    var sortir:Boolean=false
    val myList : MutableList<String> = mutableListOf("Pierre","Paul","Jacques","Marie","amin","aurelien","aurelien2")

    println(myList.joinToString(">"))

    for(i in myList.indices){
        for (z in 0 until i){
            var icount:Int =  myList[i].count()
            var zcount:Int =  myList[z].count()
            var nbrCharTest : Int = if (icount>zcount) {zcount} else {icount}
            var indice:Int=0
            do{

                var vali : String =myList[i]
                var valchari:Int= vali[indice].code.toByte().toInt()
                var valz : String =myList[z]
                var valcharz:Int= valz[indice].code.toByte().toInt()
                if (valchari>valcharz) {
                    tmp = myList[i]
                    myList[i] = myList[z]
                    myList[z] = tmp
                    sortir = true
                }else{sortir=true}

            }while (!sortir)
        }


    }

    println(myList.joinToString(">"))
}