public class OperadorLogico {
    public static void main(String[] args) {


        /*  int idade = 71;
        boolean precisaVotar = idade >= 18 && idade < 70;
        System.out.println(precisaVotar);
        */

        /*  int nrAmarelo = 2;
        int nrVermelho = 1;
        boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;
        System.out.println(suspenso);
        */

        /*  int x = 9, y = 11;
        boolean teste = x == 9 ^ y > 10;
        System.out.println(teste);
        */

        int idade = 20;
        boolean maiorIdade = !(idade >=18);
        System.out.println(maiorIdade);
    }
}