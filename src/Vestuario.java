public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, boolean produtosImportados, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    public String toString() {
        return "Loja (Nome:  " + getNome() + "; Quantidade de funcionários: " + getQuantidadeFuncionarios() + "; Salário base funcionário: R$" + getSalarioBaseFuncionario() + "; Endereço: " + getEndereco().toString() + "; Data de fundação: " + getDataFundacao().toString() + "; Vende produtos importados: " + produtosImportados + ")";
    }
}
