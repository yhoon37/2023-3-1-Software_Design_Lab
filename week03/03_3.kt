package com.example.week03

fun change(a:String): String {
    var islower: Boolean = true
    var notlower = ""
    try{
        for(i:Char in a){
            if(i < 'a' || 'z' < i){
                notlower += i
                islower = false
            }
        }
        if(!islower){
            throw Exception("error with ${notlower}")
        }
    }catch(e: Exception){
        return e.message.toString()
    }
    return a.toUpperCase()
}

fun main() {
    var a = "abcd"
    println(change(a))

    var b = "EfgH"
    println(change(b))

    var c = "!@%$"
    println(change(c))
}