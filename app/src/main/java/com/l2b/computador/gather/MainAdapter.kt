package com.l2b.computador.gather

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.group_row.view.*

/**
 * Created by Computador on 22/05/2018.
 */
class GroupVerticalAdapter: RecyclerView.Adapter<CustomViewHolder>() {
    val namesOfGroups = listOf<String>("Computaçao Cognitiva","Computaçao Forense","Biorobotica","Neurociencia","Pesquisa de Farmacos","Filosofos","Geografia do Cerrado")
    val namesOfUniversities = listOf<String>("PUC","UFRJ","UnB","ITA" ,"UFG","IFG","UEG")
    val descriptionsOfGroups = listOf<String>("O objetivo da computação cognitiva é o de simular os processos do pensamento humano em um modelo computadorizado",
            "A Computação Forense consiste, basicamente, no uso de métodos científicos para preservação, coleta, validação, identificação, análise, interpretação, documentação e apresentação de evidência digital com validade probatória em juízo",
            "A biorrobótica é um termo que cobre os campos da cibernética, biônica e a engenharia genética como um estudo coletivo",
            "Neurociência consiste no estudo sobre o sistema nervoso e suas funcionalidades, além de estruturas, processos de desenvolvimento e alguma alteração que possa surgir no decorrer da vida. É uma análise minuciosa sobre o que manda e desmanda em nossa vida.",
            "Na terminologia farmacêutica, fármaco designa uma substância química conhecida e de estrutura química definida dotada de propriedade farmacológica. Em termos correntes, a palavra fármaco designa todas as substâncias utilizadas em Farmácia e com acção farmacológica",
            "Filosofia é o estudo das questões gerais e fundamentais relacionadas com a natureza da existência humana; do conhecimento; da verdade; dos valores morais e estéticos; da mente; da linguagem, bem como do universo em sua totalidade",
            "Cerrado é uma área fito- e biogeográfica do Brasil, caracterizada especialmente pelo bioma savana, mas também por floresta estacional e campo.")
    val imagesOfGroups = listOf(R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7)

    // number of rows
    override fun getItemCount(): Int {
        return namesOfGroups.size
    }
    //create a cell based in a layout
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int):CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.group_row, parent, false)
        return CustomViewHolder(cellForRow)
    }
    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val groupIcon = imagesOfGroups.get(position)
        val currentNameOfGroup = namesOfGroups.get(position)
        val university = namesOfUniversities.get(position)
        val currentGroupDescription = descriptionsOfGroups.get(position)

        holder?.view?.cardView_groupRow?.textView_groupName?.text = currentNameOfGroup
        holder?.view?.cardView_groupRow?.textView_universityName?.text = university
        holder?.view?.cardView_groupRow?.imageView_groupIcon?.setImageResource(groupIcon)
        holder?.view?.cardView_groupRow?.descriptionGroupMain?.text = currentGroupDescription

        holder?.view?.cardView_groupRow?.setOnClickListener{
            val intent = Intent(holder?.view?.context, GroupDetail::class.java)
            intent.putExtra("position", position)
            /*
            intent.putExtra("groupIcon",groupIcon)
            intent.putExtra("currentNameOfGroup",currentNameOfGroup)
            intent.putExtra("university",university)
            intent.putExtra("currentGroupDescripition",currentGroupDescription)
            */
            holder?.view?.context.startActivity(intent)
        }
    }

}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {

}