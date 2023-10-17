package com.github.maikoncarlos.basickotlin

class GenericsClass

    class MutableStack<E>(vararg items: E) {              //Define uma classe genérica MutableStack<E> onde E é chamado de parâmetro de tipo genérico. No projeto de uso, ele é atribuído a um tipo específico, como Int, declarando um MutableStack<Int>.

        private val elements = items.toMutableList()

        fun push(element: E) = elements.add(element)        // adiciona o campo na Lista

        fun peek(): E = elements.last()                     //pega o ultimo da Lista

        fun pop(): E = elements.removeAt(elements.size - 1) //remove o ultimo da Lista

        fun isEmpty() = elements.isEmpty()

        fun size() = elements.size

        override fun toString() = "MutableStack(${elements.joinToString()})"
    }


    fun main() {
        val stack = MutableStack(0.62, 3.14, 2.7) //aqui como usamos o Generics, podemos colocar qq tipo, assim
        // a linguagem reconhece esse tipo e muda o tipo de uso no projeto Exemplo: val stack = MutableStack("A", "B", "C") reconheceria como String
        stack.push(9.87)
        println(stack)

        println("peek(): ${stack.peek()}")
        println("peek(): " + stack.peek())
        println(stack)

        for (i in 1..stack.size()) {
            println("pop(): ${stack.pop()}")
            println(stack)
        }

        println(stack.isEmpty())
        println(stack.size())
    }