/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */

public class Carro extends Veiculos {

    private double km;


    public Carro(String modelo, Double preco, double km) {
        super(modelo, preco); // Chama o construtor da classe base (Veiculo)
        this.km = km;
    }


    @Override
    public Double getPreco() {

        return super.getPreco() * 1.2; 
    }

    public void setKM(double km) {
        this.km = km;
    }


    public void inserirDados(String modelo, Double preco, double km) {
        setModelo(modelo); 
        setPreco(preco);   
        this.km = km;      
    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Carro Modelo A", 40000.0, 50000.0);
        meuCarro.printDados(); // Utiliza o método printDados da classe base
        System.out.println("KM: " + meuCarro.km);


        Carro outroCarro = new Carro("", 0.0, 0.0);
        outroCarro.inserirDados("Carro Modelo B", 35000.0, 30000.0);
        outroCarro.printDados();
        System.out.println("KM: " + outroCarro.km);
    }
}

