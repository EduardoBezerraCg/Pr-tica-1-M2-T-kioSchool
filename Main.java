import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double numero1 = in.nextInt();

        System.out.println("Digite a nota 2");
        double numero2 = in.nextInt();

        System.out.println("Digite a nota 3");
        double numero3 = in.nextInt();

        System.out.println("Digite a nota 4");
        double numero4 = in.nextInt();

        System.out.println("Digite a nota 5");
        double numero5 = in.nextInt();

        System.out.println("Digite a nota 6");
        double numero6 = in.nextInt();

        Double media = (numero1 + numero2 + numero3 + numero4 + numero5 + numero6) / 6;
        System.out.println("A media do aluno é: " + media);
    }
}



