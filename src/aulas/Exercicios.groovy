package aulas

import classes.Cliente
import classes.Cliente as Xu
import classes.Funcionario
import classes.Funcionario_2
import classes.Produto
import classes.Relatorio
import classes.Somar
import classes.Venda

// Criando um Alias para o Test como T
import org.junit.jupiter.api.Test as T
import org.junit.jupiter.api.Test

class Exercicios {

    @Test
    void exercicio1ponto1() {
        def nome = "Alexandre"
        def number = 18
        println nome.class
        println number.class.name

        println number.toString() + " " + 33
        println number + 18
    }

    @T
    void exercicio2() {
        Cliente cliente = new Cliente()
        cliente.setNome "Alexandre"
        println cliente.getNome()
        cliente.setData new Date()
        def matematica = cliente.somar 4, 5
        println matematica

        println cliente.getNome() + cliente.getData()
    }
    //Veja que na Classe Cliente não tem construtor na classe cliente
    //Aqui podemos construir mapeando o objeto

    @T
    void exercicio3() {
        Cliente c = new Cliente(nome: "Alexandre", data: new Date())
        println c.getNome() + " " + c.getData()
        Cliente d = new Cliente(nome: "Marcelo")
        Cliente f = new Cliente(data: new Date())

        d["nome"] = "Fernando"
        println d.getNome()
    }
    @T
    void exercicio4() {
        Produto p = new Produto("Vinho", 9.00)
        //Linha de baixo estou acessando o getNome mas pelo direct field
        println p.nome
        p.valor = 8.00
        println p.nome + " " + p.valor
    }
    @T
    void exercicio5() {
        Xu c = new Xu(nome: "Winderson")
        println c.getNome()
    }
    @T
    void exercicio6() {
        Venda v1 = new Venda()
        def compra1 = v1.vender(100.00, 20)
        println compra1
        def compra2 = v1.vender(100)
        println compra2
    }
    @T
    void exercicio7() {
        List<String> colecao = new ArrayList()
        colecao.add("Alexandre")
        colecao.add(null)
        colecao.add("Maria")
        colecao.add("Fernanda")

        println colecao

        colecao = colecao*.toUpperCase()
        println colecao
    }
    @Test
    void exercicio8(){
        Somar soma = new Somar()
        println soma.soma(10)
        println soma.soma(10,20)
        println soma.soma(10,20,30)

    }
    @Test
    void exercicio9(){
        URL url = new URL("http://www.google.com.br")
        println url
    }
    @T
    void exercicio10(){
        Funcionario f = new Funcionario(nome: "Alexandre", idade: 38, salario: 1500.59)
        println f
    }
    @T
    void exercicio11(){
        Funcionario_2 f1 = new Funcionario_2(nome: "Alex", idade: 15, salario: 10)
        Funcionario_2 f2 = new Funcionario_2(nome: "Alex", idade: 15, salario: 10)
        Funcionario_2 f3 = new Funcionario_2(nome: "Alexandre", idade: 25, salario: 10)
        println f1.equals(f2)
        println f2.equals(f1)
        println f1.equals(f3)
        println f2.equals(f3)
    }
    @T
    void exercicio12(){
        def funcionario = new Funcionario(nome: "Usando o Def", idade: 10, salario: 20)
        println funcionario
        funcionario = 10
        println funcionario
    }
    @T
    void exercicio13(){
        def colecao = new ArrayList<String>()
        colecao.add("Basilio")
        colecao.add("Alexandre")
        colecao.add("Ferreira")
        colecao.add(38)
        //For dinamico
        for (meuNome in colecao){
            println meuNome
        }
        // Passando um String para a colecao
        colecao = "Alexandre esta estudando"
        for (imprimir in colecao)
            println imprimir

    }
    @T
    void exercicio14(){
        // Closure eh um metodo dinamico, durante a criacao, voce abre e fecha a closure para
        // executar uma determinada funcao
        def metodo = {v1 , v2 -> v1 + v2}
        println metodo (30 , 50)
        println metodo(5.0, 10)
    }
//    public int metodo(v1, v2){
//        v1 + v2
//    }
    @T
    void exercicio15(){
        def imprimir = {v -> String temp = v.trim().replace("a","@")
            temp = temp.toUpperCase()
            temp
        }

        println imprimir("Aleatoriamente")
        println imprimir("Macarrao")
    }
    @T
    void exercicio16(){
        def matematicas = {v1, v2, v3 -> (v1+v2)* v3}
        println matematicas(10, 20, 4)
    }
    @T
    void exercicio17(){
        def limpandoTexto = {String t -> String tmp = t.trim().replace("Alexandre", "Alex")
        tmp = tmp.toUpperCase()
        //return
        tmp
        }
        println limpandoTexto("Alexandre")

        def voltandoMinuscula = { String y -> String t2 = y.trim().replace("a", "\nabobora")
        t2 = t2.toLowerCase()
        t2
        }
        println voltandoMinuscula("alexandre")

    }
    @Test
    void exercicio18(){
        def funcaoIndeterminada = {texto -> texto.trim().replace("a", "@").replace(" ", "")}
        Relatorio rel = new Relatorio()
        rel.emitir("A l e x a n d r e ", funcaoIndeterminada)

    }
}
