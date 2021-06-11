import com.sun.org.apache.xpath.internal.functions.FuncFalse

//2) Réaliser un programme qui permet de détecter si un texte est un palindrome.
//NB: L'algorithme doit se baser sur l'utilisation de boucle et de collection.
fun main(args: Array<String>) {
    var valeurs: MutableList<String> = mutableListOf()
    var nbTentative: Int = 0
    var IsnotFind: Boolean = true
    var check: Boolean = true
    val SolutionList: MutableList<String> = mutableListOf()
    var nbaleatoire: Int = (1..10).random()
    var nbrPion: Int = 5

    while ((nbrPion > 9) || (nbrPion < 0)) {
        println(
            """Entre le numéro de pions à choisir"""
        )
        nbrPion = readLine()!!.toInt()
    }
    for (i in 1..nbrPion) {
        SolutionList.add((0..9).random().toString())
    }
    while (IsnotFind) {
        nbTentative += 1
        println(
            """Entre $nbrPion valeurs"""
        )
        var essai: String = readLine()!!.toString()
        //valeurs= essai.split(",") as MutableList<String>


        IsnotFind = Controle(essai, SolutionList)


    }



    println("tu as gagne en $nbTentative")


}

fun Controle(valeurS: String, Solution: MutableList<String>): Boolean {
    var nbrBienPlace: Int = 0
    var nbrMalPlace: Int = 0
    var copySolution : MutableList<String>  = mutableListOf()
    copySolution = Solution.toMutableList()
    var pasgagne: Boolean?
    var IndiceAEviter: MutableList<Int> = mutableListOf()
    var reponse: MutableList<String> = mutableListOf()
    reponse = valeurS.split(",") as MutableList<String>
    for (i in reponse.indices) {
        if (reponse[i] == copySolution[i]) {
            nbrBienPlace += 1
            copySolution[i]="x"
            IndiceAEviter.add(i)
        }
    }
    for (i in reponse.indices) {
        if (i !in IndiceAEviter){
        if (reponse[i] in copySolution && (reponse[i] != copySolution[i]) && i !in IndiceAEviter ) {


                nbrMalPlace += 1
            copySolution[i]="x"

        }}
    }
    println(
        """
Nombre bien placé = $nbrBienPlace
Nombre mal placé = $nbrMalPlace
"""
    )

    println("Solution " + Solution.joinToString("-")+ " ")
    println("reponse " + reponse.joinToString("-")+ " ")
    pasgagne = nbrBienPlace != Solution.size

    return pasgagne
}

























