fun main(args: Array<String>) {

    var nbaleatoire:Int = (1..10).random()
    var illimite:Boolean = false
    var trouve:Boolean = false
    var nbrTentative:Int=0
    var Tentative:String?
    Tentative= null

    while (Tentative!="D" && Tentative!="N" && Tentative!="F") {
        println(
            """F Facile    Tentative illimitee 
            N Normal        30 tentatives 
            D Difficile     10 tentative """"
        )
        Tentative = readLine()!!.toString()
    }
    var count: Int =when (Tentative){

        "N" -> 30
        "D" -> 10
        else -> {illimite=true
            0}

    }


    while ((count>0) || (illimite==true)) {
        nbrTentative+=1
        println("""Entrer un nombre entre 1 et 10
              Tentative numéro : $nbrTentative"""".trimMargin())
        var Nbr:Int = readLine()!!.toInt()
        if(Nbr==nbaleatoire){count=0
            illimite=false
            trouve=true} else {count -=1}

    }
    if (trouve==true) {
        println("Bravo tu es un champion tu as fait cela en $nbrTentative tentatives")}
    else
    {println("Va voir une voyante pendant que tu joues")}

}