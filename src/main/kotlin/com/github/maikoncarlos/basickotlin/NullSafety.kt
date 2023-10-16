package com.github.maikoncarlos.basickotlin

class NullSafety

//DECLARANDO O TIPO DA VARIAVEL DESTA FORMA EU NÃO POSSO RECEBER VALORES NULOS
var neverNull: String = "This can't be null"
//neverNull = null //COMO AQUI, ERRO DE COMPILAÇÃO

//DESTA FORMA, COLOCANDO O ? DEPOIS DO TIPO EU DIGO QUE ACEITO, POSSO RECEBER NULO POR ALGUM MOTIVO
//var nullable: String? = "You can keep a null here"
 var nullable = null

//ASSIM COMO SABEMOS ELE ATRIBUI POR INFERENCIA DE TIPO STRING E ASSIM NÃO PODEMOS RECEBER VALORES NULOS
var inferredNonNull = "The compiler assumes non-null"
//inferredNonNull = null

//fun strLength(str: String): Int {
//    return str.length
//}
fun strLength(str: String) = str.length //FUNCAO PODE TER ESSE FORMATO REDUZIDO

fun strLengthWithNull(nul: String?): Int {
    return nul?.length ?: 0
}

//ESTA FUNÇÃO PROTEGE TE TERMOS NULIDADE POIS FAZEMOS O TRATAMENTO CASO RECEBA UM NULO
//COMO O KOTLIN OBRIGA FAZER PARA NÃO ESTOURAR UM NULLPOINTEREXCEPTION COMO EM OUTRAS LINGUAGENS
//ERRO EM TEMPO DE COMPILAÇÃO
fun describeString(maybeString: String?): String {
    return if (!maybeString.isNullOrEmpty()) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}

fun main() {
    println( strLength(neverNull))
//    strLength(nullable) //A FUNCÇAO NÃO ESTÁ PREPARADA PARA RECEBER VALORES NULOS, ERRO DE COMPILAÇÃO
    println(strLengthWithNull(nullable))
    println(describeString("String"))
    println(describeString(null))
}