public class Produto {
    private String nome;
    private double preco;
    private Data dataDeValidade;

    public Produto(String nome, double preco, Data dataDeValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataDeValidade;
    }

    public void setDataValidade(Data dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    public String toSrtring() {
        return "Produto (Nome: " + nome + "; Preço: R$" + preco + "; Validade: " + dataDeValidade.toString() + ")";
    }

    public boolean estaVencido(Data data) {
        if (data.getAno() > dataDeValidade.getAno()) {
            return true;
        } else if (data.getAno() == dataDeValidade.getAno()) {
            if (data.getMes() > dataDeValidade.getMes()) {
                return true;
            } else if (data.getMes() == dataDeValidade.getMes()) {
                if (data.getDia() >= dataDeValidade.getDia()) {
                    return true;
                }
            }
        }
        return false;
    }
}