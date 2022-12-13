package challenge

// "REP" || "REC" || "APR"

fun rep(teste1:Double):String{

    if( (teste1 < 5.0) === true) return "REP"

    return ""
} // end function rep

fun rec(teste1:Double):String{
    var remainder:Int = ( teste1 % 5 ).toInt()
    var remainder7:Int = teste1.rem(7).toInt()

    var result:String = ""

    if( (teste1 == 5.0  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.1  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.2  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.3  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.4  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.5  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.6  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.7  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.8  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 5.9  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.0  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.1  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.2  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.3  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.1  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.2  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.3  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.4  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.4 ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.4  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.5  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.6  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.7  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.8  ) == true)
    {
        result = "REC"

        return result

    }
    else if( (teste1 == 6.9  ) == true)
    {
        result = "REC"

        return result

    }

    return ""
} // end function rec

fun apr(teste1:Double):String{

    if(teste1 > 7.0) return "APR"

    return ""
} // end function apr

fun main() {

    try{

        var line:String? = "9"// readLine()

        for (i in line!!.indices) {

            var teste1:Double = line[i].toString().trim(' ').toDouble()
            // print(teste1)
            println(rep(teste1))
            println(rec(teste1))
            println(apr(teste1))

        } // end for loop

    }
    catch(e: ArithmeticException){
        e.printStackTrace();
    }
    catch(e: RuntimeException){

    }
    catch(e:NullPointerException){

    }
    catch(e: NumberFormatException){


    }
    finally{

    }


}