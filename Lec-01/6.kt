// Write a program to find the largest element in a list of integers.

fun main() {
    var myArray = listOf(5, 8, 60, 42, 15)

    var large: Int = 0

    for (i in myArray) {
        if (i > large) {
            large = i
        }
    }

    println("Large Element: $large")
}
