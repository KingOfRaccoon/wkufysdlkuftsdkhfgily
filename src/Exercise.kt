package com.example.myapplication

//import android.content.Context
//import android.content.Intent
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.core.content.ContextCompat.startActivity
//import androidx.recyclerview.widget.RecyclerView
import javax.naming.Context

class Excercise(val name: String?, var muscleGroup: Array<Muscle>,var imbDownLimit: Float? = null , var imbLimit: Float? = null) {
    //var defaultRest: Double = 30.0
    //var podxod: Int? = null
    //var povtor: Int? = null
    //var imbLimit: Float? = null
    var trainingWeight: Double = 1.0 // здесь стандартный начальный вес для упражнения
    /*fun restPlus() {
    println("Достаточно ли времени на отдых: Y-YES, N-NOW")
    var o: String = readLine()!!
    when (o) {
        "Y", "YES", "y", "yes" -> return
        else -> defaultRest = defaultRest + defaultRest * 0.2
    }
}*/

    /*fun havearest() {
        println("Отдохни $defaultRest секунд")
    }*/
    var diseases: Array<Disease> = arrayOf()
    var muscles = muscleGroup

    fun checkDiseases(disease: Disease) = diseases.find { it ==  disease } == null

    fun checkChoose(muscle: Muscle) = muscles.find { it != muscle } != null

    override fun toString(): String {
        return "$name"
    }

}
//class ExerciseAdapter(): RecyclerView.Adapter<ExerciseAdapter.Companion.ExerciseHolder>(){
//    var excercises : MutableList<Excercise> = mutableListOf()
//    lateinit var c : Context
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseHolder {
//        var eee = LayoutInflater.from(parent.context).inflate(R.layout.exercise_view, parent, false)
//        return ExerciseHolder(eee)
//    }
//
//    override fun getItemCount(): Int = excercises.size
//
//    override fun onBindViewHolder(holder: ExerciseHolder, position: Int) {
//        holder.n.setOnClickListener { v ->
//            var next: Intent = Intent(c, Desc::class.java)
//            c.startActivity(next)
//        }
//        holder.bind(excercises[position])
//    }
//    companion object{
//        class ExerciseHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
//            var n : TextView = itemView.findViewById(R.id.name_ex)
//
//            fun bind(excercise: Excercise){
//                n.setText(excercise.name)
//            }
//        }
//    }
//
//}