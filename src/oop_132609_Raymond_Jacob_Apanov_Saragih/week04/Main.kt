package oop_132609_Raymond_Jacob_Apanov_Saragih.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car  ---")
    val electricCar = ElectricCar("Tesla", 4, 90)
    electricCar.accelerate()
    electricCar.honk()
    electricCar.openTrunk()

    println("\n--- Testing Employee Hierarchy ---")
    val manager = Manager(name = "Alice", baseSalary = 10000000)
    val developer = Developer(name = "Bob", baseSalary = 8000000, programmingLanguage = "Kotlin")

    manager.work()
    println("Bonus ${manager.name}: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus ${developer.name}: Rp ${developer.calculateBonus()}")git
}