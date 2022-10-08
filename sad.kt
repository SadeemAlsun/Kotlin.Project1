package com.example.firsttry

fun main() {
    val Todo = Todo()
val person1=Info(43243,"Sadeem","add", false)
    val person2=Info(56767,"norah","remove", true)
    val person3=Info(97877,"jouri","print", true)
    val person4=Info(45765,"lara","change", true)
    val person5=Info(47564,"ruoof","add", false)
    Todo.addInfo(person1)
    Todo.removeInfo(person2)
    Todo.printInfo(person3)
    Todo.changeInfo(person4)
    Todo.addInfo(person5)


}
data class Info(  val ID: Long,
                  val name:String,
                  val task: String,
                  val isCompleted: Boolean
)
class Todo{
    val personInfo=arrayListOf<Info>()
            fun addInfo(Info:Info){
                personInfo.add(Info)
            }
    fun removeInfo(Info:Info){
        personInfo.remove(Info)

    }
    fun changeInfo(Info:Info){

      personInfo.remove(Info)
        val person5=Info(98475,"dora","add", true)
        personInfo.add(person5)
    }
    fun printInfo(Info:Info){
        for(Info in personInfo){
            println("ID: ${Info.ID}, Name: ${Info.name} , Task: ${Info.task} , isCompleted: ${Info.isCompleted}")
        }
    }

}



