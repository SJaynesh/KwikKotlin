// Implement a function to calculate the factorial of a given number using recursion.

fun fact(n: Int): Int {
    if (n <= 1) {
        return 1
    } else {
        return n * fact(n - 1)
    }
}

fun main() {
    var n: Int = 5

    print("FACTORIAL NUMEBR : ${fact(n)}")
}
