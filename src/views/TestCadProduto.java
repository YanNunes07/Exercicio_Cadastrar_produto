package views;

import model.CadastrarProduto;

import java.util.Scanner;

public class TestCadProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        CadastrarProduto p1 = new CadastrarProduto();

        System.out.println("Informe o código do Produto: ");
        p1.setCodigo(ler.nextInt());

        System.out.println("Informe o nome do Produto: ");
        ler.nextLine();
        p1.setNome(ler.nextLine());

        do {// faça validação da Quantidade
            System.out.println("\nInforme a quantidade: ");
            p1.setQuantidade(ler.nextInt());
            if (p1.getQuantidade() <= 0) {
                System.out.println("Por favor Digite a quantidade do Produto!☻");
            }
        } while (p1.getQuantidade() < 0);

        do { //faça validação do Valor Unitário
            System.out.println("Informe o valor do produto: ");
            p1.setValorUnitario(ler.nextDouble());
            if (p1.getValorUnitario() <= 0) {
                System.out.println("Por favor Digite o valor do Produto!☻");
            }
        } while (p1.getValorUnitario() < 0);

        do { // faça validação da Forma de Pgto
            System.out.println("Selecione uma Forma de Pagamento: ");
            System.out.println(" 1 - Cartão => 3% de Juros.");
            System.out.println(" 2 - Dinheiro => 10% de Desconto.");
            System.out.print("=>  ");
            p1.setFormaDePagto(ler.nextInt());
            if (p1.getFormaDePagto() < 1 || p1.getFormaDePagto() > 2) {
                System.out.println("Por Favor! Escolha uma das Opções abaixo: ☻");
            }
        } while (p1.getFormaDePagto() < 1 || p1.getFormaDePagto() > 2);

        do {
            System.out.println("Selecione um setor do Produto: ");
            System.out.println("1 - Padaria\n2 - Açougue\n3 - Mercearia\n4 - Bebidas\n" +
                    "5 - Laticínios\n6 - HortiFrutti\n7 - Limpeza ");
            p1.setSetor(ler.nextInt());
            if (p1.getSetor() < 1 || p1.getSetor() > 7) {
                System.out.println("Por Favor! Escolha uma das Opções de Setores abaixo: ☻");
            }
        } while (p1.getSetor() < 1 || p1.getSetor() > 7);

        int opcao;

        do {

            System.out.println("Digite sua opção: ");
            System.out.println(" 1 - Ver Dados:");
            System.out.println(" 2 - Ver SubTotal:");
            System.out.println(" 3 - Total da Compra:");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(p1);
                    break;
                case 2:
                    System.out.println("SubTotal: " + p1.calcularProduto());
                    break;
                case 3:
                    System.out.println("Total da Compra: " + p1.calcularTotalDaCompra());
                    break;
                case 0:
                    System.out.println("Encerrar Compra!!");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    System.exit(0);
                    break;
            }
        } while (opcao != 0);
    }
}
