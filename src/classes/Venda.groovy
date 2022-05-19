package classes

class Venda {
    // O parametro padrão é 10
    double vender(double preco, int taxa = 10){
        double rs = preco * taxa / 100
    }
}
