package newpackage;

import java.util.Scanner;

public class vetor {

    public static void main(String[] args) {
        int numero[] = new int[10];
        int aux = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.println("Digite um numero:");
            numero[i] = entrada.nextInt();
        }
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                int maior = 0, menor = 0;
                if (numero[i] > numero[i + 1]) {
                    maior = numero[i];
                    menor = numero[i + 1];
                    numero[i] = menor;
                    numero[i + 1] = maior;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            System.out.print(i + " " + numero[i] + "\n");
        }
    }
}
