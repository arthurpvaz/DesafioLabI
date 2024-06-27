public class Cosmetico extends Loja{
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        return "Loja (Nome:  " + getNome() + "; Quantidade de funcionários: " + getQuantidadeFuncionarios() + "; Salário base funcionário: R$" + getSalarioBaseFuncionario() + "; Endereço: " + getEndereco().toString() + "; Data de fundação: " + getDataFundacao().toString() + "; Taxa de comercialização: " + taxaComercializacao + ")";
    }
}
