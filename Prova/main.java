import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        pessoa pessoas[] = new pessoa[6];

        pessoas[0] = new pessoa("Felipe", 57, "M", 90, 100, 80, 30, 70);
        pessoas[1] = new pessoa("Maria", 45, "F", 50, 70, 100, 50, 90);
        pessoas[2] = new pessoa("Cristina", 30, "F", 50, 20, 30, 70, 30);
        pessoas[3] = new pessoa("Leonardo", 32, "M", 80, 10, 60, 80, 50);
        pessoas[4] = new pessoa("João", 27, "M", 100, 30, 50, 100, 10);
        pessoas[5] = new pessoa("Jéssica", 45, "F", 85, 60, 70, 50, 60);

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Nome: ");
        String nome = teclado.next();
        System.out.printf("Idade: ");
        int idade = teclado.nextInt();
        System.out.printf("Gênero: ");
        String genero = teclado.next();
        System.out.printf("Gosta de Viajar: ");
        int gostaViajar = teclado.nextInt();
        System.out.printf("Gosta de Cozinhar: ");
        int gostaCozinhar = teclado.nextInt();
        System.out.printf("Gosta de Cinema: ");
        int gostaCinema = teclado.nextInt();
        System.out.printf("Gosta de Balada: ");
        int gostaBalada = teclado.nextInt();
        System.out.printf("Gosta de Ficar em Casa: ");
        int gostaFicarEmCasa = teclado.nextInt();

        pessoa jon = new pessoa(nome, idade, genero, gostaViajar, gostaCozinhar, gostaCinema, gostaBalada, gostaFicarEmCasa);


        if (idade >= 18 && genero.equals("M") || genero.equals("F") && gostaViajar > 0 && gostaViajar < 100 && gostaCozinhar > 0 && gostaCozinhar < 100 && gostaCinema > 0 && gostaCinema < 100 && gostaBalada > 0 && gostaBalada < 100 && gostaFicarEmCasa > 0 && gostaFicarEmCasa < 100) {

            double calculo1 = jon.calcularCompatibilidade(pessoas[0]);

            double calculo2 = jon.calcularCompatibilidade(pessoas[1]);

            double calculo3 = jon.calcularCompatibilidade(pessoas[2]);

            double calculo4 = jon.calcularCompatibilidade(pessoas[3]);

            double calculo5 = jon.calcularCompatibilidade(pessoas[4]);

            double calculo6 = jon.calcularCompatibilidade(pessoas[5]);

        teclado.close();
        }
    }
}
