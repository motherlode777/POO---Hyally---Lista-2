/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */


public class Moto extends Veiculos {

    private int ano;

    public Moto(String modelo, Double preco, int ano) {
        super(modelo, preco); 
        this.ano = ano;
    }


    @Override
    public Double getPreco() {

        return super.getPreco() * 1.1; 
    }
    
        public int getAno() {
        return ano;
    }


    public void setAno(int ano) {
        this.ano = ano;
    }


    public void inserirDados(String modelo, Double preco, int ano) {
        setModelo(modelo); 
        setPreco(preco);  
        this.ano = ano;     
    }

    public static void main(String[] args) {

        Moto minhaMoto = new Moto("Moto Modelo Y", 30000.0, 2022);
        minhaMoto.printDados(); 
        System.out.println("Ano: " + minhaMoto.ano);

        Moto outraMoto = new Moto("", 0.0, 0);
        outraMoto.inserirDados("Moto Modelo Z", 25000.0, 2021);
        outraMoto.printDados();
        System.out.println("Ano: " + outraMoto.ano);
    }
}

