public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        if(dia == 29 && mes == 2) {
            if(verificaAnoBissexto(ano) == true) {
                this.dia = dia;
                this.mes = mes;
                this.ano = ano;
            } else {
                this.dia = 1;
                this.mes = 1;
                this.ano = 2000;
            }
        } else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia >= 1 && dia <= 31) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0);
    }

    public boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0);
    }
}