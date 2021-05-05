
fun main(){
    val result = MathOperations()

    // უმაღლესი საერთო გამყოფი
    println(result.greatestCommonDivisor(36,44))

    // უმცირესი საერთო ჯერადი
    println(result.lowestCommonMultiple(36,24))

    // შეიცავს თუ არა $ სიმბოლოს
    println(result.ifContain("word@#$"))

    // 100 - ის ჩათვლით ყველა ლუწი რიცცხვის ჯამი
    println(result.sumEven(2,100))

    // შებრუნებული რიცხვი
    println(result.reversedNumber(1234))

    // სტრინგი არის თუ არა პალინდრომი
    println(result.palindromeWords("racecar"))


}

