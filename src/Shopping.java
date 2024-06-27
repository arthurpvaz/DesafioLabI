import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeLojas];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco.toString() + "\nLojas: " + Arrays.toString(lojas);
    }

    public boolean insereLoja(Loja loja) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        int qtd = 0;

        for(int i = 0; i < lojas.length; i++) {
            if((tipoLoja.equalsIgnoreCase("informatica") || tipoLoja.equalsIgnoreCase("informática")) && lojas[i] instanceof Informatica) {
                qtd++;
            } else if((tipoLoja.equalsIgnoreCase("cosmetico") || tipoLoja.equalsIgnoreCase("cosmético")) && lojas[i] instanceof Cosmetico) {
                qtd++;
            } else if((tipoLoja.equalsIgnoreCase("vestuario") || tipoLoja.equalsIgnoreCase("vestuário")) && lojas[i] instanceof Vestuario) {
                qtd++;
            } else if(tipoLoja.equalsIgnoreCase("bijuteria") && lojas[i] instanceof Bijuteria) {
                qtd++;
            } else if((tipoLoja.equalsIgnoreCase("alimentaçao") || tipoLoja.equalsIgnoreCase("alimentacao") || tipoLoja.equalsIgnoreCase("alimentacão") || tipoLoja.equalsIgnoreCase("alimentação")) && lojas[i] instanceof Bijuteria) {
                qtd++;
            } else if(i == lojas.length - 1) {
                qtd = -1;
            }
        }
        return qtd;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica seguroMaisAlto = null;

        for(int i = 0; i < lojas.length; i++) {
            if(lojas[i] instanceof Informatica) {
                if(seguroMaisAlto == null) {
                    seguroMaisAlto = (Informatica)lojas[i];
                } else if(seguroMaisAlto.getSeguroEletronicos() < ((Informatica) lojas[i]).getSeguroEletronicos()) {
                    seguroMaisAlto = (Informatica)lojas[i];
                }
            }
        }
        return seguroMaisAlto;
    }
}