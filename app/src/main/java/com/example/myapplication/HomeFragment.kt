package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.Item_adapter
import com.example.myapplication.databinding.FragmentHomeBinding
import com.example.myapplication.module.Item

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding=FragmentHomeBinding.inflate(layoutInflater,container,false)
        var newsRV= mutableListOf<Item>()
        newsRV.add(Item(R.drawable.item_img,"Петербургдаги портлашда гумонланган аёл қўлга олинди. У Ўзбекистонга учиб кетмоқчи бўлган","20:56 / 03.04.2023"))
        newsRV.add(Item(R.drawable.img_1,"Петербургдаги портлаш. Владлен Татарский ўзи ким эди?","20:27 / 03.04.2023"))
        newsRV.add(Item(R.drawable.img_2,"Ўзбекистонликлар бойкот қилган «Жара» фестивали қолдирилди   ","18:08 / 03.04.2023"))
        newsRV.add(Item(R.drawable.img_3,"Z-артистларга қарши кампания, ойликлар ошиши ва пасаймаган тезлик — ҳафта дайжести","09:13 / 02.04.2023"))

        binding.rvHome.adapter=Item_adapter(newsRV)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = HomeFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_PARAM1, param1)
                putString(ARG_PARAM2, param2)
            }
        }
    }
}