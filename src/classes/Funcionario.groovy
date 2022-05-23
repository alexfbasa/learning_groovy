package classes

import groovy.transform.ToString

//Fazendo o ToString metodo Groovy
@ToString(excludes=["idade"],includeNames = true)
//So colocar ele na classe que eh criado automaticamente
class Funcionario {
    String nome
    Integer idade
    Double salario

    //Fazendo o ToString metodo Java
//    public String toString(){
//        return ("Nome= " + nome + "\nIdade= " + idade + "\nSalario= " + salario)
//    }

}
