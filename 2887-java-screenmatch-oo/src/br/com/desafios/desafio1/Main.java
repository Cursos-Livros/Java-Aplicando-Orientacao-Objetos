package br.com.desafios.desafio1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter with the model of the car:");
        String nameModelo = input.nextLine();

        System.out.println("Enter the first year price:");
        double firstYearPrice = input.nextDouble();

        System.out.println("Enter the second year price:");
        double secondYearPrice = input.nextDouble();

        System.out.println("Enter the third year price:");
        double thirdYearPrice = input.nextDouble();

        Carro carro = new ModeloCarro(nameModelo, firstYearPrice, secondYearPrice, thirdYearPrice);

        carro.showReport();
    }
}
