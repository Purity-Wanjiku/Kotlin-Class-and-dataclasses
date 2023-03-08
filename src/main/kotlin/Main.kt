fun main() {
details("it's possible")
    info()
    unchanged()
number(8)
   numbers(arrayOf(12,45,68,0))
    classes()

    var persona1 = Human("Phelisia","female","chocolate",6,62)
    persona1.rest()
    persona1.identity()

    var book1 = Book("Trevor Noah","Born a crime",300,2016)
    book1.nyj()
}
fun details (text:String){
    println(text.get(4))   // how to use get to extract character in acertain index
    for(x in text)  //    loop characters of string
        println(x)
    println(text.length)  //how to get the number of characters in a string
    println(text.indexOf("o"))  //to get index of a character in a string
}
fun info (){
    var text1 = "Anita"
    println(text1[3])
}
fun unchanged (){
    val text2 = "Kenyan"
println(text2)

}
fun number (num:Int) {
    if (num == 7) {
        print("neutral")
    } else if (num <= 7) {
        println("base")
    }
else{
    println("acidic")
}
}
fun numbers (nums: Array<Int>){
    println(nums.max())
}
fun classes(){
    var names = arrayOf("anitab","adalab","hopperlab","rwanda","kenya")
    println(names.sortedArray().contentToString())
}
class Human (var name:String,var gender:String,var color:String,var height:Int,var weight:Int) {

    fun rest() {
        println("sleep eight hours")
    }
    fun identity() {
        println("Am $gender and my name is $name")
    }
}
data class Book(var author:String,var title:String,var pages:Int,var publishedYear:Int){
     fun nyj(){
         println("The book $title, is published in year $publishedYear")
     }
}
//NEW SERIES

