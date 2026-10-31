package oop_132609_Raymond_Jacob_Apanov_Saragih.week08

class City(val name: String)
class Address(val city: City?)
class DeliveryDetails(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)