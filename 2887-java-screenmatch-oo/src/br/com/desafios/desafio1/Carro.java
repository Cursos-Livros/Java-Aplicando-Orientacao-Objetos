package br.com.desafios.desafio1;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public Carro(String nomeModelo, double precoAno1, double precoAno2, double precoAno3) {
        this.nomeModelo = nomeModelo;
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getPrecoAno1() {
        return precoAno1;
    }

    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }

    public double getPrecoAno2() {
        return precoAno2;
    }

    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }

    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }


    public double maiorPrecoAno() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    public double menorPrecoAno() {
        double menorPreco = precoAno1;

        if(precoAno2 < menorPreco){
           menorPreco =  precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    public void showReport(){
        System.out.println("Name: " + nomeModelo);
        System.out.println("Small Price: " + menorPrecoAno());
        System.out.println("Large Price: " + maiorPrecoAno());
    }
}
