fun main(args: Array<String>) {

/*

    var premier: Boolean = true
    println("Entrez un chiffre ")
    var nb1 = readLine()!!.toInt()
    for (i in 1..nb1){
        if (i!=1 && i!=nb1){
            if ((nb1%i)==0) {premier = false}

        }

*/
    var premier: Boolean = true
    println("Entrez un chiffre ")
    var nb1 = readLine()!!.toInt()
    for (i in 2..(nb1-1)){
            if ((nb1%i)==0) {premier = false}
        }
if (premier==true) {println("nombre premier")} else {println("nombre pas premier")}
}




