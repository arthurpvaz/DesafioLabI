import java.util.Scanner;

public class ComplementoPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Produto produto = null;
        Loja loja = null;
        Shopping shopping = null;
        System.out.println("Dia de hoje");
        Data dataAtual = criaData();

        while(true) {
            System.out.println("\n(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) criar um shopping");
            System.out.println("(4) remover uma loja");
            System.out.println("(5) sair");

            System.out.print("\nDigite sua opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if(validaOpcao(opcao)) {
                if(opcao == 5) {
                    System.out.println("Saindo...");
                    break;
                } else {
                    if(opcao == 1) {
                        //criação de uma loja

                        System.out.println("Criando uma loja...");
                        loja = criaLoja();

                        System.out.println("\n" + loja.toString());
                        System.out.println("Tamanho da loja: " + loja.tamanhoDaLoja());

                        System.out.println("\n(1) Para inserir a loja ao Shopping e voltar ao menu");
                        System.out.println("(2) Para voltar ao menu");
                        System.out.print("Opção: ");
                        int op = sc.nextInt();
                        sc.nextLine();

                        if(op == 1) {
                            if(shopping != null) {
                                if(shopping.insereLoja(loja)){
                                    System.out.println("Loja inserida ao shopping com sucesso!");
                                } else {
                                    System.out.print("Loja não inserida por falta de espaço!");
                                }
                            } else {
                                System.out.print("Nenhum shopping foi criado anteriormente!");
                            }
                        }
                    } else if(opcao == 2){
                        //criação de um produto

                        System.out.println("Criando um produto...");
                        produto = criaProduto();

                        //teste de vencimento do produto

                        if(produto.estaVencido(dataAtual)) {
                            System.out.println("PRODUTO VENCIDO");
                        } else {
                            System.out.println("PRODUTO NÃO VENCIDO");
                        }

                        //insere produto a uma loja
                        System.out.println("\n(1) Para inserir o produto a uma loja e voltar ao menu");
                        System.out.println("(2) Para voltar ao menu");
                        System.out.print("Opção: ");
                        int op = sc.nextInt();
                        sc.nextLine();

                        if(op == 1 && shopping != null) {
                            System.out.print("Digite o nome da loja: ");
                            String nomeLoja = sc.nextLine();

                            for(int i = 0; i < shopping.getLojas().length; i++) {
                                if(shopping.getLojas()[i] != null && shopping.getLojas()[i].getNome().equalsIgnoreCase(nomeLoja)) {
                                    if(shopping.getLojas()[i].insereProduto(produto)){
                                        System.out.println("Produto inserido a loja com sucesso!");
                                        break;
                                    } else {
                                        System.out.print("Produto não inserido por falta de espaço!");
                                    }
                                } else {

                                }
                            }
                        } else {
                            System.out.print("Nenhuma loja foi criada anteriormente!");
                        }
                    } else if(opcao == 3){
                        //criação de um shopping

                        System.out.println("Criando um shopping...");
                        shopping = criaShopping();
                    } else if(opcao == 4){
                        if(shopping != null) {
                            System.out.println("Removendo uma loja...");
                            System.out.print("Digite o nome da loja: ");
                            if(shopping.removeLoja(sc.nextLine())){
                                System.out.println("Loja removida do shopping com sucesso!");
                            } else {
                                System.out.print("Loja não existe no shopping!");
                            }
                        } else {
                            System.out.print("Nenhum shopping foi criado anteriormente!");
                        }
                    }
                }
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }

    public static boolean validaOpcao(int opcao) {
        if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4 || opcao == 5) {
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

        Data dataDeFundacao = new Data(dia, mes, ano);

        return dataDeFundacao;
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

    public static Shopping criaShopping() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Endereço");
        Endereco endereco = criaEndereco();

        System.out.print("Quantidade de lojas: ");
        int quantidadeLojas = sc.nextInt();
        sc.nextLine();

        Shopping shopping = new Shopping(nome, endereco, quantidadeLojas);

        return shopping;
    }
}