import com.example.learnkotlinexample.Book
import com.example.learnkotlinexample.parent.MyChildClass

fun main() {
/*    println("test")

    var car = Car()

    car.brand = "minh"
    car.model = "fpt"
    car.year = "2002"


    // nhiều đối tượng

    var car2 = Car()

    car2.brand = "minh"
    car2.model = "fpt"
    car2.year = "2002"

    println(car.brand)
    println(car.model)
    println(car.year)*/

    var book1 = Book("minh", "fpt", 2002)
    val c1 = Book("Ford", "Mustang", 1969)
    val c2 = Book("BMW", "X5", 1999)
    val c3 = Book("Tesla", "Model S", 2020)

    c1.read()
    c1.countPages(2022)

    val myObj = MyChildClass()
    myObj.myFunction()

    println(book1.model)
    println(book1.brand)
    println(book1.year)
}