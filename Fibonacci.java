public class Fibonacci {
    public static void main(String[] args) {
        int x = 0, y = 1;
        int soma = 0;
        int numero = 10;

        if (numero > 0 && numero < 46) {

            System.out.printf("%d ", x);
            System.out.printf("---> %d", y);

            for (int i = 0; i < numero; i++) {

                soma = x + y;
                x = y;
                y = soma;
                System.out.printf("---> %d", soma);

            }

        }

    }
}