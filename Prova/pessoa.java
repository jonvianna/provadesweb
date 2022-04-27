public class pessoa{
    private String nome;
    private int idade;
    private char genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

    @Override
    public String toString() {
        return "pessoa [genero=" + genero + ", gostaBalada=" + gostaBalada + ", gostaCinema=" + gostaCinema
                + ", gostaCozinhar=" + gostaCozinhar + ", gostaFicarEmCasa=" + gostaFicarEmCasa + ", gostaViajar=" + gostaViajar + ", idade=" + idade + ", nome=" + nome + "]";
    }

    public pessoa(String nome, int idade, char genero, int gostaViajar, int gostaCozinhar, int gostaCinema,
            int gostaBalada, int gostaFicarEmCasa) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.gostaViajar = gostaViajar;
        this.gostaCozinhar = gostaCozinhar;
        this.gostaCinema = gostaCinema;
        this.gostaBalada = gostaBalada;
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public int getGostaViajar() {
        return gostaViajar;
    }
    public void setGostaViajar(int gostaViajar) {
        this.gostaViajar = gostaViajar;
    }
    public int getGostaCozinhar() {
        return gostaCozinhar;
    }
    public void setGostaCozinhar(int gostaCozinhar) {
        this.gostaCozinhar = gostaCozinhar;
    }
    public int getGostaCinema() {
        return gostaCinema;
    }
    public void setGostaCinema(int gostaCinema) {
        this.gostaCinema = gostaCinema;
    }
    public int getGostaBalada() {
        return gostaBalada;
    }
    public void setGostaBalada(int gostaBalada) {
        this.gostaBalada = gostaBalada;
    }
    public int getGostaFicarEmCasa() {
        return gostaFicarEmCasa;
    }
    public void setGostaFicarEmCasa(int gostaFicarEmCasa) {
        this.gostaFicarEmCasa = gostaFicarEmCasa;
    }
    
}