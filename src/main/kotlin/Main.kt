fun main() {
    var userAns = 0

    do {
        println("1.) Tea, Unsweetened ")
        println("2.) Tea, unsweetened, amd Cream")
        println("3.) Tea, Sweetened, and cream")
        println("4.) Tea, sweetened")
        println("5.) Exit")

        print("Enter Choice:")
        if (userAns > 5)
            println(" Invalid Choice please try again")
        userAns = readln().toInt()
        println("You have selected option: $userAns")
    }while (userAns != 5)


}