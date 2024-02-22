fun main(){
    printName("Hello", "Hawa")
    modulus(10, 3)

    add(9, 5, 3, 2)

    printName("I","love", "travelling" )
}

fun printName(Firstname: String, Lastname: String){
    var fullName = Firstname + " " + Lastname
    println(fullName)

}
fun modulus(num1: Int, num2: Int){
    var result = num1 / num2
    println(result)


}
fun add(num1: Int , num2: Int, num3: Int, num4: Int){
    var sum = num1 + num2 + num3 + num4
    println(sum)


}
fun printName(firstWord: String, secondWord: String, thirdWord: String){
    var fullSentence = firstWord + " " + secondWord + " " + thirdWord
    println(fullSentence)
}


