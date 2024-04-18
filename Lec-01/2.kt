import kotlin.io.print // Use a loop to generate and print the first 10 Fibonacci numbers.

fun main() {
    var a: Int = 0
    var b: Int = 1
    var c: Int

    print("$a\t$b\t")
    for (i in 1 ..< 11) {
        c = a + b
        print("$c\t")
        a = b
        b = c
    }
}
