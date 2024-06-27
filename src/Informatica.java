public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, int quantidadeProdutos, double seguroEletronicos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return "Loja (Nome:  " + getNome() + "; Quantidade de funcionários: " + getQuantidadeFuncionarios() + "; Salário base funcionário: R$" + getSalarioBaseFuncionario() + "; Endereço: " + getEndereco().toString() + "; Data de fundação: " + getDataFundacao().toString() + "; Seguro para eletrônicos: " + seguroEletronicos + ")";
    }
}
