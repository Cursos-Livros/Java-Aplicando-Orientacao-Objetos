package br.com.desafios.desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of animal (cat):");
        String nameCat = input.nextLine();

        System.out.println("Enter the name of animal (dog):");
        String nameDog = input.nextLine();

        Animal cat = new Gato(nameCat);
        Animal dog = new Dog(nameDog);

        cat.emitirSom();
        dog.emitirSom();
    }
}
