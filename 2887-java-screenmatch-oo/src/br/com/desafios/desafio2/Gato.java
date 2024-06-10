package br.com.desafios.desafio2;

public class Gato extends Animal{
    public Gato(String name) {
        super(name);
    }

    @Override
    public void emitirSom() {
        System.out.println("MiAUUUUUU!");
    }
}
