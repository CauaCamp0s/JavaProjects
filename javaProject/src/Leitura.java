import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = leitura.nextLine();
        System.out.println("Qual o ano de lancamento?");
        int anoLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("Filme favorito: " + filmeFavorito);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);


    }
}
