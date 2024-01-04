import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        int idade;


        Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        System.out.println("Digite a idade: ");
        idade = sc.nextInt();

        if (idade >= 18 && idade < 70) {
            System.out.println("Maior idade");
        } else if (idade >= 70 && idade < 100) {
            System.out.println("Terceira idade");
        } else if (idade >= 100) {
            System.out.println("Centenária");
        }
        else {
            System.out.println("Menor idade");
        }

    }
}
