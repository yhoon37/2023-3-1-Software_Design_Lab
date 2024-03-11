fun main() {
    val a = readLine()
    println("입력 받을 숫자: ${a!!}")

    for(i: Int in 1..a.toInt() step(2)){
        if(i%2 == 1){
            print("$i ")
        }
    }
}