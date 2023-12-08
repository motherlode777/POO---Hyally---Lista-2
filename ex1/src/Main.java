/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */

public class Main {
    public static void main(String[] args) {

        CD cd = new CD();
        DVD dvd = new DVD();


        System.out.println("Inserindo dados para CD:");
        cd.inserirDados();
        cd.printDados();

        System.out.println("\nInserindo dados para DVD:");
        dvd.inserirDados();
        dvd.printDados();
    }
}

