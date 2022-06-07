package classes

class Venda {
    // O parametro padrão é 10
    // O parametro padrao foi passado no construtor
    def vender(double preco, int taxa = 10){
        double rs = preco * taxa / 100
        //Nao esqueca do retorno
        rs
    }
}
