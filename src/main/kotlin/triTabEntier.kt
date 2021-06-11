//3) Sur base d'un tableau (Array) de 10 entier.
//Réaliser un algorithme qui permet de trier en ordre décroissant.
//NB: Ne pas utiliser les fonctions de trie du langage.

fun main(args: Array<String>) {
var tmp:Int?
val tab1 : Array<Int> = arrayOf(110,42,2,13,7,28,19,55,100,105,102,99)
for(i in tab1.indices){
    for (z in 0 until i){
        if (tab1.get(i)<tab1.get(z)){
            tmp = tab1.get(i)
            tab1.set(i,tab1.get(z))
            tab1.set(z,tmp)
            }
    }


}
    println(tab1.joinToString(">")) // renvoi tous les elements du tableau avec une ,
}