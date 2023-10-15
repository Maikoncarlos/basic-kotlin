package com.github.maikoncarlos.basickotlin

class Functions

// QUANDO NÃO QUEREMOS EXPLICITAR UM RETORNO COLOCAMOS COMO UNIT(SEM VALOR DE RETORNO)!
// SE NÃO COLOCAMOS NENHUM VALOR COMO RETORNO ELE POR DEFAULT É UNIT
fun printMessage(message: String): Unit {
    println(message)
}

//NESTE CASO NÃO DEFINIMOS O TIPO DE RETORNO, ENTÃO ELE É UM UNIT
// E COMO DEFINIMOS O ATRIBUTO PREFIX = "Info" CASO ELE NÃO SEJA ENVIADO ELE POR DEFAULT SEMPRE TERÁ ESSE VALOR!
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

//JÁ NESTE CASO ESTAMOS EXPLICITANDO QUE O RETORNO TEM QUE SER UM INT
fun sum(x: Int, y: Int): Int {
    return x + y
}

//UMA FUNÇÃO DE EXRESSÃO UNICA QUE RETORNA UM INT POIS O RESULTADO DE DOIS INT SERÁ SEMPRE UM INT
fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")

    //SEGUE A ORDEM DE PASSAGEM DOS ATRIBUTOS CONFORME CONSTRUTOR
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")

    //PODEMOS USAR OS NOMES DO ATRIBUTOS PARA PASSAGEM DOS VALORES, ASSIM
    //ELES NÃO PRECISAM ESTAR NA ORDEM NECESSARIAMENTE DO CONSTRUTOR
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    println(sum(1, 2))
    println(multiply(2, 4))
}