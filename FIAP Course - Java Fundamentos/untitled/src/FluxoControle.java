public class FluxoControle {
    public static void main(String[] args) {

        int idade = 171;

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
