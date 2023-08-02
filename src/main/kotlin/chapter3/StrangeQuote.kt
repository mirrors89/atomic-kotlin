package chapter3

import test.eq

// this는 String 수신객체 타입에 속하는 객체를 가르킨다.
fun String.strangeQuote() = this.singleQuote().singleQuote()
// 최초로 doubleQuote 함수를 호출할 때 this를 생략한다.
fun String.tooManyQuotes() = doubleQuote().doubleQuote()

fun main() {
    "Hi".strangeQuote() eq "''Hi''"
    "Hi".tooManyQuotes() eq "\"\"Hi\"\""
}