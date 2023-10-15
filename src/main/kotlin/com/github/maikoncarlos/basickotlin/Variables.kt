package com.github.maikoncarlos.basickotlin

class VARIABLES

fun main() {

    //QUANDO DECLARAMOS COM VAR ELE PODERA SE ALTERADO(MUTABLE)
    var a: String = "initial" //VARIAVEL DECLARADA IMPLICITAMENTE
    var aS = "initial" //KOTLIN INFERE O TIPO POR DE TRAZ DOS PANOS PARA NÓS
    println(a)
    println(aS)
    a = "final"
    val b: Int = 1 //DECLARADA DE FORMA IMPLICITA E NÃO PODE TER O SEU VALOR MUDADO(IMUTAVEL)
    //b = 1 //Val não pode ser reatribuído(Val cannot be reassigned)
    val c = 3
    println(a)
    println(b)
    println(c)
}

//    var e: Int //Variable 'e' must be initialized
//    print(e) //PRECISA SER INICIALIZADA PARA PODER USALA EM QUALQUER EXECUÇÃO


val d: Int  // 1

if (someCondition()) {
    d = 1   // 2
} else {
    d = 2   // 2
}

println(d) // 3

}

