fun main(){
    var num = readLine()!!.toInt();
    fun fact(num:Int){
        if(num==0 || num ==1){
            return 1;
        }
        else
            return num*fact(num-1)

    }
}