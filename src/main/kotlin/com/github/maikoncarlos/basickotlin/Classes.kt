package com.github.maikoncarlos.basickotlin

class Classes // Classe mãe sem nenhum atributo

class Contact(           // Classe com dois atributos
    val id: Int,         //id sendo imutável
    var email: String)   //e email mutável

fun main() {

    val classe = Classes() // Instancia do Objeto Classe vazio, não precisa do new na frente

    val contact = Contact(1, "mary@gmail.com")  // instancia de Contact com propriedades

    println(contact.id)
    println(contact.email)
    contact.email = "jane@gmail.com"
    println(contact.email)
    println(classe)
}