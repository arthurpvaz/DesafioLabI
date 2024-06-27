public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public String toString() {
        return "Loja (Nome:  " + getNome() + "; Quantidade de funcionários: " + getQuantidadeFuncionarios() + "; Salário base funcionário: R$" + getSalarioBaseFuncionario() + "; Endereço: " + getEndereco().toString() + "; Data de fundação: " + getDataFundacao().toString() + "; Meta de vendas: " + metaVendas + ")";
    }
}