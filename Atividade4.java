import java.util.Random;

public class Atividade4 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int soma = 0;
        int aux = 0;
        int x = 0, y = 0;

        System.out.println("Digite a quantidade de valores que serão inseridos:");
        int tam = 20;

        int[] vetor = new int[tam]; // cria vetor com tamanho desejado acima [tam].

        System.out.printf("Desta lista quantos numeros vc quer analisar ?\n");
        x = 10;

        //esse while cria valores aleatorios entre o menor numero perfeito (6) e o valor 500.
        while (aux < tam) {
            int numero = aleatorio.nextInt(500);

            if (numero >= 6) {
                vetor[aux] = numero; //adiciona ao vetor
                aux++;

            }

        }

        y = tam - x; //como são os ultimos numeros que serão analisados, y será a posição inicial do vetor. 

        for (int i = y; i < vetor.length; i++) {
            soma = 0; //soma precisa ser zerada quando i for incrementado para n misturar com a passada.

            for (int j = 1; j < vetor[i]; j++) {   
                if (vetor[i] % j == 0) { //se o valor for divisivel soma, não incluindo ele mesmo
                    soma += j;
                }

            }
            if (soma != vetor[i]) { //se a soma for diferente é um numero imperfeito.
                System.out.printf("%d : Numero imperfeito\n", vetor[i]);
            } else {
                System.out.printf("%d : Perfeito\n", vetor[i]); //numero perfeito
            }

        }

    }

}
