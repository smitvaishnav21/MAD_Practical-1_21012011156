fun main(){
    println("enter month number: ")
    var num = readLine()!!.toInt()
    when(num){
        1->print("January")
        2->print("Febuary")
        3->print("March")
        4->print("April")
        5->print("May")
        6->print("June")
        7->print("July")
        8->print("August")
        9->print("September")
        10->print("October")
        11->print("November")
        12->print("December")
        else-> print("enter valid month number")

    }

}