public class Alimentacao extends Loja{
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataDeFundacao, Data dataAlvara, int quantidadeProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao, quantidadeProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        return "Loja (Nome:  " + getNome() + "; Quantidade de funcionários: " + getQuantidadeFuncionarios() + "; Salário base funcionário: R$" + getSalarioBaseFuncionario() + "; Endereço: " + getEndereco().toString() + "; Data de fundação: " + getDataFundacao().toString() + "; Data alvará: " + dataAlvara.toString() + ")";
    }
}
