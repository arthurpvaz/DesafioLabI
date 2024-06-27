import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataDeFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = - 1.0;
        this.endereco = endereco;
        this.dataDeFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeProdutos];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataDeFundacao;
    }

    public void setDataFundacao(Data dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto produto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                break;
            }
            if(i == estoqueProdutos.length - 1) {
                System.out.print("Estoque cheio!");
            }
        }
    }

    public String toString() {
        return "Nome:  " + nome + "\nQuantidade de funcionários: " + quantidadeFuncionarios + "\nSalário base funcionário: R$" + salarioBaseFuncionario + "\nEndereço: " + endereco.toString() + "\nData de fundação: " + dataDeFundacao.toString() + "\nEstoque de produtos: " + Arrays.toString(estoqueProdutos);
    }

    public double gastosComSalario() {
        if(salarioBaseFuncionario == - 1.0) {
            return (- 1.0);
        } else {
            return (salarioBaseFuncionario * quantidadeFuncionarios);
        }
    }

    public char tamanhoDaLoja() {
        if(quantidadeFuncionarios < 10) {
            return 'P';
        } else if(quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos() {
        System.out.println("Estoque de produtos");
        for(int i = 0; i < estoqueProdutos.length; i++) {
            System.out.println(i + 1 + ". " + estoqueProdutos[i]);
        }
    }

    public boolean insereProduto(Produto produto) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nome) {
        for(int i = 0; i < estoqueProdutos.length; i++) {
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)) {
                this.estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}