fun main()
{

    var list = mutableSetOf<String>("a","b","c","d")
    list.add("e")
    list.add("z")

    println(list)


    for(i in list)
    {
        println(i)
    }

}