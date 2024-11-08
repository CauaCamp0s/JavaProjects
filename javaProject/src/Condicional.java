public class Condicional {
    public static <string> void main(String[] args) {
        int anoDoLancamento = 1980;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;
        String tipoPlano = "normal";

        if (anoDoLancamento >= 2022){
            System.out.println("Lancamento que os clientes estão curtindo!");
        }else {
            System.out.println("Filme retro que vale a pena assistir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme incluso no plano!");
        }else{
            System.out.println("Filme não incluso no plano!, Deve pagar a locação!");
        }
    }
}
