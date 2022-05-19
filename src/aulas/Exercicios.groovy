package aulas

import classes.Cliente
import classes.Produto
// Criando um Alias para o Test como T
import org.junit.jupiter.api.Test as T

class Exercicios {

    @T
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
}