@main def Question_02: Unit = 
    val str_list: List[String] = List("avd", "rdhsrvs", "qf", "sghewa", "j7ytglk", "wsese", "qwef", "hgrshh", "kghgrg", "qddgjkyh", "aabd")
    val list_out: List[String] = filter_str(str_list)
    println(list_out)

def filter_str(list: List[String]): List[String] = {
    list.filter(_.length > 5)
}
