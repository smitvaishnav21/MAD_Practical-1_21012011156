fun main(){
    var no1= readLine()!!.toInt()
    var no2= readLine()!!.toInt()
    var no3= readLine()!!.toInt()

    fun add(no1:Int,no2:Int,no3:Int){
        var sum=no1+no2+no3
        println("Addition of $no1, $no2, $no3 is $sum",)
    }
    fun sub(no1:Int,no2:Int,no3:Int){
        var sub=no1-no2-no3
        println("Subtraction of $no1, $no2, $no3 is $sub",)
    }
    fun mul(no1:Int,no2:Int,no3:Int){
        var mul=no1*no2*no3
        println("Multiplication of $no1, $no2, $no3 is $mul",)
    }
    fun div(no1:Int,no2:Int,no3:Int){
        var div=no1/no2/no3
        println("Division of $no1, $no2, $no3 is $div",)
    }
    add(no1,no2,no3);
    sub(no1,no2,no3);
    mul(no1,no2,no3);
    div(no1,no2,no3);
}