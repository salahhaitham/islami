package com.example.islami_app.quran

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.islami_app.constants
import com.example.islami_app.databinding.FragmentQuranFragBinding


class quran_frag : Fragment() {
    lateinit var viewbinding:FragmentQuranFragBinding
var names= listOf("الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
    ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
    ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
    ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
    ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
    ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
    ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
    ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
    ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
    "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewbinding=FragmentQuranFragBinding.inflate(layoutInflater,container,false)
        return viewbinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            initrecyclerview()
    }
lateinit var adapter: suras_adapter
    private fun initrecyclerview() {
        adapter= suras_adapter(names)

      adapter.onitemclick=object : suras_adapter.onitemclcicklistner{

          override fun onclick(position: Int, name: String) {
              start_suraActivity(position,name)
          }

      }

        viewbinding.recycler1.adapter=adapter


    }

    private fun start_suraActivity(position: Int, name: String) {
        val intent=Intent(context, Sura_detailsActivity::class.java)
        intent.putExtra(constants.EXTRA_NAME,name)
        intent.putExtra(constants.EXTRA_INDEX,position+1)
        startActivity(intent)

    }


}