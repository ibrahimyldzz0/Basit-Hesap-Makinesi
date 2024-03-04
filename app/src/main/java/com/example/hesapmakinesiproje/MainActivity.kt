package com.example.hesapmakinesiproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main() {
            println("Basit Hesap Makinesi")
            println("İşlem seçin: \n1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme")
            print("Seçiminiz: ")
            val secim = readLine()
            print("Sayı 1: ")
            val sayi1 = readLine()?.toDoubleOrNull()
            print("Sayı 2: ")
            val sayi2 = readLine()?.toDoubleOrNull()

            if (sayi1 == null || sayi2 == null) {
                println("Geçersiz giriş. Lütfen sayıları kontrol edin.")
                return
            }

            val sonuc = when (secim) {
                "1" -> sayi1 + sayi2
                "2" -> sayi1 - sayi2
                "3" -> sayi1 * sayi2
                "4" -> {
                    if (sayi2 == 0.0) {
                        println("Bir sayıyı sıfıra bölemezsiniz.")
                        return
                    }
                    sayi1 / sayi2
                }
                else -> {
                    println("Geçersiz işlem seçimi.")
                    return
                }
            }

            println("Sonuç: $sonuc")
        }
    }
}