package academy.devdojo.maratonajava.javacore.Kenum.domain;

public enum TipoPagamento {
    //crtl + O
    DEBITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double CalcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double CalcularDesconto(double valor);
}