class Math {
    var result=0

    fun add(x:Int, y:Int):Int{
        return x+y
    }

    fun addNoReturn(x:Int,y:Int){
        result=x+y
        println(result)
    }
}
