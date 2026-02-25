//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    /** Должна быть написана одна функция calculate, не понятно что за три функции у тебя, нужно все передеать по заданию */
    //сорри тут все не очень красиво, я поправлю когда буду делать итерацию фикса замечаний
    fun calculateDevide(a: Double, b: Double, operator: String): Double? {
        return try {
            a / b
        } catch (e: ArithmeticException) {
            println("ErrorDevideByZero")
            null
        } finally {
            println("Doesn't Work") 
        }
    }

    fun wrongOperator(a: Double, b: Double, operator: String): Double? {
        if ((operator) == ":") throw ArithmeticException("WrongOperation")
        else {
            println("Success")
        }
        return null
    }

    fun calculateSum(a: Double, b: Double, operator: String): Double? {
        return try {
            a + b
        } catch (e: ArithmeticException) {
            println("Error")
            null
        } finally {
            println("Doesn't Work")
        }
    }


    //calculateDevide(10.0,0.0,"/")
    wrongOperator(32.0,23.0,"+")
    println(calculateSum(10.0,2.0,"+"))
}




