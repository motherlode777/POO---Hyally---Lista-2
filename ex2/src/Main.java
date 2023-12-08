/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author brunoteodoro
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Veiculos> cadastro = new ArrayList<>();

        while (true) {
            System.out.println("Escolha o tipo de veículo (1 para Moto, 2 para Carro, 0 para sair): ");
            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            String modelo;
            Double preco;
            int ano;
            double km;

            System.out.println("Informe o modelo: ");
            scanner.nextLine(); // Consumir a quebra de linha pendente
            modelo = scanner.nextLine();

            System.out.println("Informe o preço: ");
            preco = scanner.nextDouble();

            if (escolha == 1) { // Moto
                System.out.println("Informe o ano: ");
                ano = scanner.nextInt();

                cadastro.add(new Moto(modelo, preco, ano));
            } else if (escolha == 2) { // Carro
                System.out.println("Informe o km: ");
                km = scanner.nextDouble();

                cadastro.add(new Carro(modelo, preco, km));
            }
        }

        System.out.println("Relatório:");

        double totalPrecoOriginal = 0.0;
        for (Veiculos veiculo : cadastro) {
            veiculo.printDados();
            totalPrecoOriginal += veiculo.getPreco();
        }

        // Levantamento de preços
        System.out.println("\nLevantamento de Preços:");
        System.out.println("Total de preços antes dos ajustes: R$" + totalPrecoOriginal);

        // Ajustes de preços
        for (Veiculos veiculo : cadastro) {
            if (veiculo instanceof Moto && ((Moto) veiculo).getAno() >= 2008) {
                veiculo.setPreco(veiculo.getPreco() * 1.1);
            } else if (veiculo instanceof Carro && ((Carro) veiculo).getKm() > 100000) {
                veiculo.setPreco(veiculo.getPreco() * 0.92); // Reduz em 8%
            }
        }

        // Levantamento de preços após ajustes
        double totalPrecoAjustado = 0.0;
        for (Veiculos veiculo : cadastro) {
            totalPrecoAjustado += veiculo.getPreco();
        }

        System.out.println("\nTotal de preços após os ajustes: R$" + totalPrecoAjustado);

        scanner.close();
    }
}


