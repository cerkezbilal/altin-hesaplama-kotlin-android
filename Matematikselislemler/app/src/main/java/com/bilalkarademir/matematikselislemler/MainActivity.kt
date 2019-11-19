package com.bilalkarademir.matematikselislemler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.roundToLong

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(cbGram.isChecked){
            cbCeyrek.isChecked=false
            cbYarim.isChecked = false
        }
        if(cbYarim.isChecked){
            cbCeyrek.isChecked=false
            cbGram.isChecked = false

        }
        if(cbCeyrek.isChecked){

            cbGram.isChecked=false
            cbYarim.isChecked = false

        }






    }

    fun altinHesapla(view:View){



    var param = etPara.text

        if(param != null){

            var sonuc = param.toString().toInt()





//
            //
            //!cbGram.isChecked && !cbYarim.isChecked &&



            if(cbGram.isChecked && !cbYarim.isChecked && !cbCeyrek.isChecked){



                tvAltin.text="Altın Sayısı: "+gramAltin(sonuc).toString()

                tvPara.text = "Para Üstü: "+gramParaUstun(sonuc).toString()+" TL"

            }

            else if(!cbGram.isChecked && cbYarim.isChecked && !cbCeyrek.isChecked){



                tvAltin.text="Altın Sayısı: "+yarimAltin(sonuc).toString()

                tvPara.text = "Para Üstü: "+yarimParaUstun(sonuc).toString()+" TL"


            }
           else if(cbCeyrek.isChecked&& !cbYarim.isChecked && !cbGram.isChecked){


                tvAltin.text="Altın Sayısı: "+ceyrekAltin(sonuc).toString()

                tvPara.text = "Para Üstü: "+ceyrekParaUstun(sonuc).toString()+" TL"

            }else{
                Toast.makeText(this,"Tek alan seçiniz",Toast.LENGTH_LONG).show()
            }




        }else{
            Toast.makeText(this,"Para Alanını boş bırakmayınız",Toast.LENGTH_LONG).show()

        }




    }

    fun gramParaUstun(para: Int):Int{

        return para%275
    }
    fun ceyrekParaUstun(para: Int):Int{

        return para%450
    }

    fun yarimParaUstun(para: Int):Int{

        return para%901
    }

    fun gramAltin(para:Int):Int{

        return para/275
    }

    fun ceyrekAltin(para: Int):Int{

        return para/450
    }

    fun yarimAltin(para: Int):Int{

        return para/901
    }


    fun Double.formatla(kacRakam: Int)=java.lang.String.format("%.${kacRakam}",this)




}
