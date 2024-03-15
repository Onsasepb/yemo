fun main() {
    //Break statement
    for (number in 34 .. 39) {
        if (number == 36) {
            break

        }
        println(number)
    }


    for (character in 'd'..'i'){
        if (character =='f'){
            continue
        }
        println("Character is $character")
    }
}