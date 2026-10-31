package oop_132609_Raymond_Jacob_Apanov_Saragih.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim Email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {

        if (user.email != null) {
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}