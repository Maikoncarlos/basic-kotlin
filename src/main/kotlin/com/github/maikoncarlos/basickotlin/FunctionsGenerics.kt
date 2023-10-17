package com.github.maikoncarlos.basickotlin

class FunctionsGenerics {

    class MutableStack<E>(vararg items: E) {              // Class Generic

        private val elements = items.toMutableList()

        fun push(element: E) = elements.add(element)

        fun peek(): E = elements.last()

        fun pop(): E = elements.removeAt(elements.size - 1)

        fun isEmpty() = elements.isEmpty()

        fun size() = elements.size

        override fun toString() = "MutableStack(${elements.joinToString()})"
    }
}


    fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements) //funcao com retorno Generic recebendo com vararg como elemento
                                                                            //lembrando sempre de colocar o * antes do elemento para fazer referencia ao vararg e não um Array()

    fun main() {
        val stack = mutableStackOf(0.62, 3.14, 2.7)
        println(stack)
    }
