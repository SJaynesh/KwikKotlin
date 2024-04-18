// Implement a function to check if a given number is a prime number.

fun checkPrimeNumber(n: Int): Int {
    var prime: Int = 0
    for (i in 2..n / 2) {
        if (n % i == 0) {
            prime = 1
            break
        }
    }
    return prime
}

fun main() {
    var n: Int = 13

    var ans = checkPrimeNumber(n)

    if (ans == 0) {
        println("$n is prime number")
    } else {
        println("$n is not prime number")
    }
}
