package proj_engsoft_so;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int heap, min, max, numReq = 0;
        float limRAM, idealRAM;

        System.out.println("Tamanho físico da heap: ");
        heap = entrada.nextInt();

        System.out.println("Tamanho minimo das variáveis: ");
        min = entrada.nextInt();

        System.out.println("Tamanho máximo das variáveis: ");
        max = entrada.nextInt();

        System.out.println("Limite de uso de memória (em porcentagem (0.xx)): ");
        limRAM = entrada.nextFloat();

        System.out.println("Limite ideal de uso de memória (em porcentagem (0.xx)): "); // valor abaixo do informado anteriormente
        idealRAM = entrada.nextFloat();

        System.out.println("Número de variáveis na heap: ");
        numReq = entrada.nextInt();


    }
}
