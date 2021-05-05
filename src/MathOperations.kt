class MathOperations {

    fun greatestCommonDivisor(a: Int, b: Int): Int {
        return if (b == 0) a else greatestCommonDivisor(b, a % b)

    }

    fun lowestCommonMultiple(a: Int, b: Int): Int {

        return a * b / greatestCommonDivisor(a,b)
    }



    fun ifContain(value: String) {

         if (value.contains("$")){
             println("შეიცავს'$'სიმბოლოს")
        }
        else println("არ შეიცავს'$'სიმბოლოს")

    }

    fun sumEven(num1: Int, num2: Int): Int {
        return if (num1 > num2) 0 else
            num1 + sumEven(num1 + 2, num2)

    }

    fun reversedNumber (number: Int):Int{
        var reverse = 0

        var n = number

        while (n > 0) {
            reverse = reverse * 10 + n % 10

            n /= 10
        }

        return reverse


    }

    fun palindromeWords(word: String){
        if (word.reversed() == word)
            println("სტრინგი $word არის პალინდრომი")

        else
            println("სტრინგი $word არ არის პალინდრომი")


    }


}