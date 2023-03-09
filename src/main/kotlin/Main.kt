import java.awt.Color

fun main() {
    var car = Car("mitsubishi","Shogun","Blue",70)
    car.carry(60)
    car.carry(80)

    //1b
  println(car.identity("red","mitsubishi","shogun"))

    //1c
    var parking =car.calculateParkingFees(5)
    println(parking)

    var bus = Bus("mercedes","box","green",140)
    println(bus.maxTripFare(34.0))
    println(bus.calculateParkingFees(15))
}
 open class Car(var make: String,var model: String,var color: String,var capacity: Int){

    fun carry(people: Int){
        var x =people - capacity
       if (people <=capacity){
           println("Carrying $people passengers")
       }else{
           println("Over capacity by $x people")
       }
    }
     fun identity( color: String, make: String, model: String){
        println(" i am a $color $make $model ")
     }
    open fun calculateParkingFees(hours: Int): Int{
        return hours*20
    }


}
//2
class Bus(make: String,model: String,color: String,capacity: Int): Car(make,model,color,capacity){
    fun maxTripFare(fare: Double): Double{
        return fare * capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours * capacity

    }
}