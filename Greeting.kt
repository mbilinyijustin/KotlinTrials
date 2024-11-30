fun main(){
    val hour = 10
    if (hour < 12){
        println("Good Morning")
    }
    else{
        println("Good afternoon!")
    }

    val age = 20
    val status = if (age >= 18) "Adult" else "Minor"
    println("You are an $status.")
}
