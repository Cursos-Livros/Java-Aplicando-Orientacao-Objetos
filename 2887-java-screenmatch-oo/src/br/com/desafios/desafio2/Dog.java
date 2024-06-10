package br.com.desafios.desafio2;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");;
    }
}
