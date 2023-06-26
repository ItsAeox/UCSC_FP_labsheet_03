@main def Question_01: Unit =
    val inp_str = "!gnirts desrever eht si sihT"
    val rev_str = reverse_string(inp_str)
    println(rev_str)

def reverse_string(str:String): String = {
    if(!str.isEmpty){
        reverse_string(str.tail) + str.head
    }
    else{
      ""
    }
}