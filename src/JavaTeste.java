import java.util.Scanner;

public class JavaTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite dois numeros para verifificação:");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        parOuImpar(n1, n2);
    }

    private static void parOuImpar(int n1, int n2) {

        int totpar = 0;

        for (n1 = n1; n1 <= n2; n1++) {
            if (n1 % 2 == 0) {
                System.out.println("O numero " + n1 + " é par");
                totpar += 1;
            } else {
                System.out.println("O numero " + n1 + " é ímpar");
            }
        }
        System.out.print("O total de numeros pares é de " + totpar);
    }
}

