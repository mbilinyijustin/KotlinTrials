fun main(){
//    Looping Through a Range:
    for (i in 1..5){
        println("Number: $i")
    }
//Looping Through a Collection
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (fruit in fruits){
        println(fruit)
    }
//    while loop
    var counter = 1
    while(counter <= 5){
        println("counter: $counter")
        counter++
    }
//do-while loop
    var counter1 = 1
    do {
        println("counter: $counter1")
        counter1++
    }
        while (counter1 <= 3)
//        break and continue in loops

        for (i in 1..10){
            if (i == 5){
                break //exit the loop when i equals 5
            }
            println(i)
            }
//        using continue to skip an iteration
    for (i in 1..5){
        if (i == 3){
            continue //skip the rest of code of this iteration

        }
        println(i)
    }

//    Nested loop
    for (i in 1..3){
        for (j in 1..3 ){
            print("$i$j") //combine i and j
        }
        println() //New line after each inner loop
    }

//   ForEach loop

val numbers = listOf(1, 2, 3, 4)
numbers.forEach {
    number ->
    println("Number: $number")
}
}
