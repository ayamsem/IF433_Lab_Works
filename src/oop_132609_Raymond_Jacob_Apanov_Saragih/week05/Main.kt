package oop_132609_Raymond_Jacob_Apanov_Saragih.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
    }

    println("-----------------------------")

    println("=== PERHITUNGAN LUAS ===")

    val mathHelper = MathHelper()

    println("Luas persegi: ${mathHelper.hitungLuas(5)}")
    println("Luas persegi panjang: ${mathHelper.hitungLuas(10, 5)}")
    println("Luas lingkaran: ${mathHelper.hitungLuas(7.0)}")

    println("-----------------------------")

    println("=== TUGAS MANDIRI 2 ===")

    val eWallet = EWallet("Budi", 50000.0)
    val creditCard = CreditCard("Budi", 100000.0)

    val paymentMethods: List<PaymentMethod> = listOf(
        eWallet,
        creditCard
    )

    for (paymentMethod in paymentMethods) {
        paymentMethod.processPayment(75000.0)

        if (paymentMethod is EWallet) {
            paymentMethod.topUp(50000.0)
            paymentMethod.processPayment(75000.0)
        }
    }
}