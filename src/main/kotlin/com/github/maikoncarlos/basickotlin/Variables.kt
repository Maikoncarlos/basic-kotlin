package com.github.maikoncarlos.basickotlin

class Variables {

    fun main() {

        //QUANDO DECLARAMOS COM VAR ELE PODERA SE ALTERADO(MUTABLE)
        var a: String = "initial" //VARIAVEL DECLARADA IMPLICITAMENTE, COM TIPO
        var aS = "initial" //KOTLIN INFERE O TIPO POR DE TRAZ DOS PANOS PARA NÓS
        println(a)
        println(aS)
        a = "final"
        val b: Int = 1 //DECLARADA DE FORMA IMPLICITA E NÃO PODE TER O SEU VALOR MUDADO(IMUTAVEL)
        //b = 1 //Val não pode ser reatribuído(Val cannot be reassigned) ERRO DE COMPILAÇÃO
        val c = 3
        println(a)
        println(b)
        println(c)

//    var e: Int //Variable 'e' must be initialized
//    print(e) //PRECISA SER INICIALIZADA PARA PODER USALA EM QUALQUER EXECUÇÃO

        fun someCondition() = true //USAMOS O METODO AQUI COMO fun

//        var d: Int = 0 //PODERÁ SER CRIADA UMA VARIAVEL TIPADA E INICIALIZADA OU ELA VIR DA CLASSE COM VALOR E INICIALIZADA
        val d: Int //CRIANDO UM VARIAVEL COM TIPAGEM, PORÉM SEM INICIALIZAR
//        val dSemTipagem //CRIANDO UMA VARIAVEL SEM TIPO E SEM INICIALIZAR. ERRO DE COMPILAÇÃO

        if (someCondition()) { //NESTE CASO A VARAIAVEL VAL QUE RECERÁ O VALOR PODE SER TIPADA ANTES,
                                //PORÉM NÃO INICIALIZADA
            d = 1   //RECEBERÁ ESTE VALOR
            //
        } else {
            d = 2   //OU ESTE!
        }

        println(d)

    }
}