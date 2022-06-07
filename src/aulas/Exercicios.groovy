package aulas

import classes.Cliente
import classes.Cliente as Xu
import classes.Funcionario
import classes.Funcionario_2
import classes.Produto
import classes.Relatorio
import classes.Somar
import classes.Venda
import groovy.transform.ToString

// Criando um Alias para o Test como T
import org.junit.jupiter.api.Test as T
import org.junit.jupiter.api.Test

class Exercicios {


    // Nao existe objeto primitivo ( int, float...) por isso conseguimos usar numer.OPCOES
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

        println(cliente.somar(9, 10))
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

        // Subscript Operator
        // Vai procurar um atributo que tenha nome
        d["nome"] = "Fernando"
        println d.getNome()
        f["data"] = new Date()
        println f.getData()
    }

    @T
    void exercicio4() {
        Produto p = new Produto(nome: "Vinho", valor: 9.00)
        //Linha de baixo estou acessando o getNome mas pelo direct field
        println p.getNome()
        println p.getNome() + " " + p.getValor()
    }

    //Crie um alias na importacao da classe {import class nome as...}
    @T
    void exercicio5() {
        Xu c = new Xu(nome: "Winderson")
        println c.getNome()
    }

    @T
    void exercicio6() {
        Venda v1 = new Venda()
        // O metodo foi reinscrito aqui
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
        // Para rearmazenar a variavel
        colecao = colecao*.toUpperCase()
        /*
        No Java seria
        for(String nomes: colecao)
            if(nomes != null)
            nomes += nomes.toUpperCase()
         */
        println colecao
    }

    @Test
    void exercicio8() {
        // Criando um array que veio do metodo
        Somar soma = new Somar()
        println soma.soma(10)
        println soma.soma(10, 20)
        println soma.soma(10, 20, 30)

    }

    // Safe Navegator Operator - Evita o NullPointerException
    @Test
    void exercicio9() {
        URL url = new URL("http://www.google.com.br")
        println url
    }

    @T
    void exercicio10() {
        Funcionario f = new Funcionario(nome: "Alexandre", idade: 38, salario: 1500.59)
        println f
    }

    @T
    void exercicio11() {
        Funcionario_2 f1 = new Funcionario_2(nome: "Alex", idade: 15, salario: 10)
        Funcionario_2 f2 = new Funcionario_2(nome: "Alex", idade: 15, salario: 10)
        Funcionario_2 f3 = new Funcionario_2(nome: "Alexandre", idade: 25, salario: 10)
        println f1.equals(f2)
        println f2.equals(f1)
        println f1.equals(f3)
        println f2.equals(f3)
    }

    // METODO DEF

    @T
    void exercicio12() {
        def funcionario = new Funcionario(nome: "Usando o Def", idade: 10, salario: 20)
        //Instanciei um funcionario
        println funcionario
        // Transformei o funcionario num Integer
        funcionario = 10
        println funcionario.getClass() //class java.lang.Integer
    }

    @T
    void exercicio13() {
        // Afirmar que eh String pq o def eh generico

        def colecao = new ArrayList<String>()
        colecao.add("Basilio")
        colecao.add("Alexandre")
        colecao.add("Ferreira")
        colecao.add(38)
        // No Java seria - detalhe que tem que definir qual sera o tipo da colection String
         for(String nome: colecao) {
             println nome
         }
        //For dinamico - tira o Tipo e coloca o IN
        for (meuNome in colecao) {
            println meuNome
        }
        // Passando uma String para a colecao
        colecao = "Alexandre esta estudando"
        for (imprimir in colecao)
            println imprimir

    }

    @T
    void exercicio14() {
        // Closure eh um metodo dinamico, durante a criacao, voce abre e fecha a closure para
        // executar uma determinada funcao
        def metodo = { v1, v2 -> v1 + v2 }
        def metodoX = { v1, v2 -> v1 * v2 }
        println metodo(30, 50)
        println metodoX(5.0, 10)
    }
//    public int metodo(int v1, int v2){
//        v1 + v2
//    }
    @T
    void exercicio15() {
        // Nome funcao - Imprimir
        // { parametro - Crie um variavel V
        // faca -> Crie um variavel temp que tera o valor v.trim sem espaco e replace a por @
        // Salve tudo o que foi feio em temp em temp para nao se perder
        // Retorne temp }
        def imprimir = { v -> def temp = v.trim().replace("a", "@")
            temp = temp.toUpperCase()
            temp
        }

        println imprimir("  Aleato  riamente  ")
        println imprimir("  Macarrao  ")
    }

    @T
    void exercicio16() {
        def matematicas = { v1, v2, v3 -> (v1 + v2) * v3 }
        println matematicas(10, 20, 4)
        matematicas = { v1, v2, v3 -> v1 / v2 * v3}
        println matematicas(10 , 20 , 30)
        matematicas = { v1, v2 -> v1 + v2}
        def nome = matematicas("Alex", "xandre")
        println nome
    }

    @T
    void exercicio17() {
        def limpandoTexto = { String t ->
            String tmp = t.trim().replace("Alexandre", "Alex")
            tmp = tmp.toUpperCase()
            //return
            tmp
        }
        println limpandoTexto("Alexandre")

        def voltandoMinuscula = { def y ->
            def t2 = y.trim().replace("a", "\nabobora")
            t2 = t2.toLowerCase()
            t2
        }
        println voltandoMinuscula("alexandre")

    }

    @Test
    void exercicio18() {
        def funcaoIndeterminada = { texto -> texto.trim().replace("a", "@").replace(" ", "") }
        Relatorio rel = new Relatorio()
        rel.emitir("A l e x a n d r e ", funcaoIndeterminada)

    }
}
