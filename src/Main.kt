//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /** Должна быть написана одна функция calculate, не понятно что за три функции у тебя, нужно все передеать по заданию */
    //сорри тут все не очень красиво, я поправлю когда буду делать итерацию фикса замечаний
    try {
        println(calculate(10.0, 2.0, "+_+_+++_"))
    } catch (e: ArithmeticException) {
        println("Error: Deviding on zero is incorrect")
        null
    } finally {
        println("Finally block is complete")
    }
}
fun calculate(a: Double, b: Double, operator: String): Double {
    return when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> {
            if (b == 0.0) throw ArithmeticException("Don't devide on zero")
            a / b
        }
        else -> throw IllegalArgumentException("You chose the wrong operator")
    }
}







