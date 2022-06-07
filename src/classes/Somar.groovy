package classes

class Somar {
    // Criando um array
    def soma(double[] valores) {
        def rs = 0
        for (double v : valores) {
            rs += v
        }
        rs
    }
}
