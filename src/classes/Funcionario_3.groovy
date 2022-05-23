package classes

import groovy.transform.Immutable

//Imutable eh um atributo que bloquea voce alterar o valor da instancia.
//Esse valor so sera informado na hora de construir a classe depois eh bloquaedo
@Immutable
class Funcionario_3 {
    String nome
    Integer idade
    Double salario
}
