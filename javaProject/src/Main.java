public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Sreen Match");
        System.out.println("Filme: Se beber nao case: 3");

        int anoDoLancamento = 2018;
        System.out.println("Ano de lançamento: " + anoDoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;

        double mediaDasnotas = (9.0 + 6.6 + 7.0) / 3;
        System.out.println(mediaDasnotas);
        String sinopse;
        sinopse = """
                O filme Se beber nao case: 3 é uma comedia!
                muito bom!!
                Ano de lançamento
                """ + anoDoLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (mediaDasnotas / 2);
        System.out.println("Classificação: " + classificacao);

    }
}