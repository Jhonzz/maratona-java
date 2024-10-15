package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!

        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }
        //isAutorizadoComprarBebida == false
        if(!isAutorizadoComprarBebida){
            System.out.println(" Não autorizado a comprar bebida alcólica");
        }

        //Usar só em casos específicos

        boolean c = false;
        if (c == false){
            System.out.println("Dentro de algo qSue nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
