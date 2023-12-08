/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */


public class Veiculos {
    private String modelo;
    private Double preco;

    public Veiculos(String modelo, Double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
        public double getKm() {
        return km;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void printDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: R$" + preco);
    }
}

