package br.com.heranca;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setLocomove("Todo animal se locomove") ;
        animal.setAlimenta("Todo animal se alimenta");

        Cachorro cachorro = new Cachorro();
        cachorro.setLocomove("cachorro se locomove")   ;
        cachorro.setAlimenta("cachorro se alimenta de ração");
        cachorro.setLatido("Cachorro latiu 4 vezes");


        Animal poodle = new Cachorro();
        poodle.setAlimenta("Poodle come ração de cachorro");
        poodle.setLocomove("Poodle usa 4 patas para se locomover");

    }


}
