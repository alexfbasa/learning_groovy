package aulas

import classes.Cliente
import org.testng.annotations.Test

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

    @Test
    void exercicio2() {
        Cliente cliente = new Cliente()
        cliente.setNome "Alexandre"
        println cliente.getNome()
        cliente.setData new Date()
        def matematica = cliente.somar 4, 5
        println matematica

        println cliente.getNome() + cliente.getData()
    }
    //Nao tem construtor na classe cliente
    //Aqui podemos construir mapeando o objeto
    @Test
    void exercicio3() {
        Cliente c = new Cliente(nome: "Alexandre", data: new Date())
        println c.getNome() + " " + c.getData()
        Cliente d = new Cliente(nome: "Marcelo")
        Cliente f = new Cliente(data: new Date())
    }
}
