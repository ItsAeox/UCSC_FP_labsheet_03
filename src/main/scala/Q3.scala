@main def Question_03: Unit = 
    val num1 = 21
    val num2 = 8
    val res = average(num1, num2)
    println(f"Average : $res%1.2f")

def average(a:Int, b:Int):Float= (a.toFloat + b.toFloat)/2
