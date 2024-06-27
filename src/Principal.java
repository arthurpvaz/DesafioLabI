import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = null;
        Loja loja = null;

        while(true) {
            System.out.println("\n(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");

            System.out.print("\nDigite sua opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if(validaOpcao(opcao)) {
                if(opcao == 3) {
                    break;
                } else {
                    if(opcao == 1) {
                        //criação de uma loja

                        System.out.println("Criando uma loja...");
                        loja = criaLoja();

                        System.out.println(loja.toString());
                    } else {
                        //criação de um produto

                        System.out.println("Criando um produto...");
                        produto = criaProduto();

                        //teste de vencimento do produto

                        Data dataAtual = new Data(23, 10, 2023);

                        if(produto.estaVencido(dataAtual)) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }
                    }
                }
            } else {
                System.out.println("Opção inválida!");
            }

            if(produto != null && loja != null){
                break;
            }
        }
    }

    public static boolean validaOpcao(int opcao) {
        if(opcao == 1 || opcao == 2 || opcao == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static Data criaData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = sc.nextInt();
        sc.nextLine();

        System.out.print("Mês: ");
        int mes = sc.nextInt();
        sc.nextLine();

        System.out.print("Ano: ");
        int ano = sc.nextInt();
        sc.nextLine();

        Data data = new Data(dia, mes, ano);

        return data;
    }

    public static Endereco criaEndereco() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Rua: ");
        String nomeDaRua = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("País: ");
        String pais = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Complemento: ");
        String complemento = sc.nextLine();

        Endereco endereco = new Endereco( nomeDaRua,  cidade,  estado,  pais,  cep,  numero,  complemento);

        return endereco;
    }

    public static Loja criaLoja() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade de funcionários: ");
        int quantidadeFuncionarios = sc.nextInt();
        sc.nextLine();

        System.out.print("Salário base de funcionário: R$");
        double salarioBaseFuncionario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Endereço");
        Endereco endereco = criaEndereco();

        System.out.println("Data de fundação");
        Data dataDeFundacao = criaData();

        System.out.print("Quantidade máxima de produtos no estoque: ");
        int quantidadeProdutos = sc.nextInt();
        sc.nextLine();

        Loja loja = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);

        return loja;
    }

    public static Produto criaProduto() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: R$");
        double preco = sc.nextDouble();
        sc.nextLine();

        System.out.println("Data de validade ");
        Data dataDeValidade = criaData();

        Produto produto = new Produto(nome, preco, dataDeValidade);

        return produto;
    }
}