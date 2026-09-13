package view;
// Alunos:
// Igor Friedrich
// Caroline Sanches

import business.GeradorSenhaForte;
import business.GeradorPin; 
import business.IGeradorSenha;

public class Principal {

    public static void main(String[] args) {

        IGeradorSenha gerador;

        // TODO:
        // Gerar duas senhas fortes (Feito pelo Igor)
        gerador = new GeradorSenhaForte(12);
        System.out.println("Senha forte 1: " + gerador.gerarSenha());
        
        gerador = new GeradorSenhaForte(16);
        System.out.println("Senha forte 2: " + gerador.gerarSenha());
        
        
        // TODO:
        // Gerar dois PINs
        // Utilizar a variável "gerador" para demonstrar polimorfismo (Feito por Carol)
        
        System.out.println("\n--- Gerando PINs ---");
        gerador = new GeradorPin(); 
        
        System.out.println("PIN 1: " + gerador.gerarSenha());
        System.out.println("PIN 2: " + gerador.gerarSenha());

    }
}