// QUESTÃO 1

public class pessoa{
    private String nome;
    private int idade;
    private String genero;
    private int gostaViajar;
    private int gostaCozinhar;
    private int gostaCinema;
    private int gostaBalada;
    private int gostaFicarEmCasa;

    // QUESTÃO 2
    public pessoa(String nome, int idade, String genero, int gostaViajar, int gostaCozinhar, int gostaCinema,
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
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

    // QUESTAO 3
    @Override
    public String toString() {
        return "Nome: " + nome + "\n idade: " + idade + "\n Genero: " + genero + "\n gostaViajar: " + gostaViajar + "\n gostaCozinhar: " + gostaCozinhar + "\n gostaCinema: " + gostaCinema + "\n gostaBalada: " + gostaBalada + "\n gostaFicarEmCasa: " + gostaFicarEmCasa;
    }

    // QUESTÃO 4
    public double calcularCompatibilidade(pessoa pessoa) {
        return Math.sqrt(Math.pow(this.gostaViajar - pessoa.gostaViajar, 2) + Math.pow(this.gostaCozinhar - pessoa.gostaCozinhar, 2) + Math.pow(this.gostaCinema - pessoa.gostaCinema, 2) + Math.pow(this.gostaBalada - pessoa.gostaBalada, 2) + Math.pow(this.gostaFicarEmCasa - pessoa.gostaFicarEmCasa, 2));
        
    }
    
}