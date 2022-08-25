fun main() {
    var number: Int
    println("Enter a Number: ")
    number = readln().toInt()
    var numberString: String = "x"
    when(number){
        0 -> numberString = "cero"
        1 -> numberString = "uno"
        2 -> numberString = "dos"
        3 -> numberString = "tres"
        4 -> numberString = "quatro"
        5 -> numberString = "cinco"
        6 -> numberString = "seis"
        7 -> numberString = "siete"
        8 -> numberString = "ocho"
        9 -> numberString = "nueve"
        10 -> numberString = "diez"
        !in 0..10 -> numberString = "Out of Bounds"
    }
    println(numberString)
}