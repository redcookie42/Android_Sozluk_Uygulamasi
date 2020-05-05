package com.example.turkcesozluk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_ceviri.*

class CeviriActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ceviri)

        btnGeri.setOnClickListener(this)

        val sozcukler = listOf<String>("Abacılık","Babalanmak","Cabadan",
        "Dadaizm","Ebedi","Fabrika","Gabarileme","Habanera","Iğralama",
            "İadeli","Jakoben","Kababurun","Laborant","Maalesef",
            "Naaş","Obezite","Öbeklenmek","Pabuççu","Rabıtasızlık",
            "Saatçi","Şabanlaşmak","Taaccüp","Ucuzlamak","Üçboyutluluk",
            "Vadesiz","Yabancı","Zabitan")

        val aciklama:EditText = findViewById(R.id.sozcuk_aciklamasi)




        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, sozcukler)
        list_view.adapter = adapter

        list_view.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val secilenSozcuk = parent.getItemAtPosition(position) as String

            if (secilenSozcuk == "Abacılık"){
                aciklama.setText("Kelime Anlamı: Abadan giyecek şeyler yapma işi.")
            }else if (secilenSozcuk == "Babalanmak"){
                aciklama.setText("Kelime Anlamı: Babaları tutmak, öfkelenmek.\nKelime Anlamı: Diklenmek, kabadayıca davranmak.")
            }else if (secilenSozcuk == "Cabadan"){
                aciklama.setText("Kelime Anlamı: Bedava olarak, fazladan.")
            }else if (secilenSozcuk == "Dadaizm"){
                aciklama.setText("Kelime Anlamı: Dadacılık.")
            }else if (secilenSozcuk == "Ebedi"){
                aciklama.setText("Kelime Anlamı: Sonsuz, ölümsüz")
            }else if (secilenSozcuk == "Fabrika"){
                aciklama.setText("Kelime Anlamı: İşlenmemiş ya da yarı işlenmiş maddelerin makine, araç ve benzeriyle işlenerek tüketime hazır duruma getirildiği sanayi kuruluşu, üretimlik.")
            }else if (secilenSozcuk == "Gabarileme"){
                aciklama.setText("Kelime Anlamı: Gemi çatkısında kullanılacak çeşitli parçaların ve sacların kalıbını alma, kalıplama.")
            }else if (secilenSozcuk == "Habanera"){
                aciklama.setText("Kelime Anlamı: Çok kıvrak bir Küba dansı.")
            }else if (secilenSozcuk == "Iğralama"){
                aciklama.setText("Kelime Anlamı: Iğralamak eylemi.")
            }else if (secilenSozcuk == "İadeli"){
                aciklama.setText("Kelime Anlamı: Posta hizmetlerinde kendisine ulaştırılan kimseden, gönderene iletmek için imza alınan:  İadeli taahhütlü mektup.")
            }else if (secilenSozcuk == "Jakoben"){
                aciklama.setText("Kelime Anlamı: Fransa’da Aziz Dominicus’a bağlı dindarlara verilen ad, Dominikenler.")
            }else if (secilenSozcuk == "Kababurun"){
                aciklama.setText("Kelime Anlamı: Sazangillerden, eti kılçıklı küçük bir balık (Chondrostoma nasus).")
            }else if (secilenSozcuk == "Laborant"){
                aciklama.setText("Kelime Anlamı: Araştırmalarda, laboratuvar deneylerinde yardımcı olarak çalıştırılan kimse.")
            }else if (secilenSozcuk == "Maalesef"){
                aciklama.setText("Kelime Anlamı: “Üzülerek söylüyorum ki, ne yazık ki...” anlamında kullanılır:  Maalesef size yardım edemeyeceğim.")
            }else if (secilenSozcuk == "Naaş"){
                aciklama.setText("Kelime Anlamı: Ölen kimsenin vücudu, ceset.")
            }else if (secilenSozcuk == "Obezite"){
                aciklama.setText("Kelime Anlamı: Şişmanlık, aşırı şişman olma durumu.")
            }else if (secilenSozcuk == "Öbeklenmek"){
                aciklama.setText("Kelime Anlamı: Öbek oluşturmak, öbekleşmek.")
            }else if (secilenSozcuk == "Pabuççu"){
                aciklama.setText("Kelime Anlamı: Ayakkabı yapan ya da satan kimse, ayakkabıcı.")
            }else if (secilenSozcuk == "Rabıtasızlık"){
                aciklama.setText("Kelime Anlamı: Rabıtasız olma durumu.")
            }else if (secilenSozcuk == "Saatçi"){
                aciklama.setText("Kelime Anlamı: Saat yapan, onaran ya da satan kimse.")
            }else if (secilenSozcuk == "Şabanlaşmak"){
                aciklama.setText("Kelime Anlamı: Aptal, şaşkın duruma gelmek, aptallaşmak")
            }else if (secilenSozcuk == "Taaccüp"){
                aciklama.setText("Kelime Anlamı: Şaşma.")
            }else if (secilenSozcuk == "Ucuzlamak"){
                aciklama.setText("Kelime Anlamı: Ederi inmek.")
            }else if (secilenSozcuk == "Üçboyutluluk"){
                aciklama.setText("Kelime Anlamı: Üçboyutlu olma durumu.")
            }else if (secilenSozcuk == "Vadesiz"){
                aciklama.setText("Kelime Anlamı: Süresi sınırlanmamış.")
            }else if (secilenSozcuk == "Yabancı"){
                aciklama.setText("Kelime Anlamı: Başka bir ulustan olan, başka bir ulusla ilgili olan (kimse).")
            }else if (secilenSozcuk == "Zabitan"){
                Toast.makeText(this, "Kelime Anlamı: Subaylar.", Toast.LENGTH_LONG).show()
                aciklama.setText("Kelime Anlamı: Subaylar.")
            }




        }


    }

    override fun onClick(v: View?) {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }



}








