#!/usr/bin/env kotlin


import kotlin.math.absoluteValue

fun main() {
    var running = true
    while (running == true){
        print("Enter First Number: ")
        var number1 = readln().toFloat()
        print("Enter operation(+,-,*,/): ")
        var opp = readln()
        print("Enter Second Number: ")
        var number2 = readln().toFloat()


        print("$number1 $opp $number2 = ${calc(opp, number1, number2)}\n\nTo end the program type end to continue press ENTER")
        var checkstate = readln()
        if(checkstate == "End"||checkstate == "end"||checkstate == "END"){
            running = false
        }
    }

}
fun calc(opp: String,number1: Float, number2: Float): String{
    if(opp == "*"){
        return((number1 * number2).toString())
    }else if(opp == "/"){
        return((number1 / number2).toString())
    }else if(opp == "+"){
        return((number1 + number2).toString())
    }else if(opp == "-"){
        return((number1 - number2).toString())
    }else{
        return("----------------\n ERROR: Operation not recognised \n----------------")
    }
}