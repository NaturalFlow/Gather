package com.l2b.computador.gather

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_group_detail.*
import kotlinx.android.synthetic.main.content_group_detail.*

class GroupDetail : AppCompatActivity() {
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_detail)
        setSupportActionBar(toolbar)

        val position :Int = intent.extras.getInt("position")

        val groupIcon = imagesOfGroups.get(position)
        val currentNameOfGroup = namesOfGroups.get(position)
        val university = namesOfUniversities.get(position)
        val currentGroupDescription = descriptionsOfGroups.get(position)

        detail_groupIcon.setImageResource(groupIcon)
        detail_groupName.text = currentNameOfGroup
        detail_description.text = currentGroupDescription
        detail_university.text = university


        /*
        val groupIcon = intent.extras.get("groupIcon") as Int
        val currentNameOfGroup = intent.extras.get("currentNameOfGroup")
        val university = intent.extras.get("university")
        val currentGroupDescription = intent.extras.get("currentGroupDescription")

        detail_groupIcon.setImageResource(groupIcon)
        detail_groupName.text = currentNameOfGroup.toString()
        detail_description.text = currentGroupDescription.toString()
        detail_university.text = university.toString()

        */
        /*
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        */
    }


}
