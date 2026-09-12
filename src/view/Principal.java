package view;
// Alunos:
// Igor Friedrich
// Caroline Sanches

import business.GeradorSenhaForte;
import business.IGeradorSenha;

public class Principal {

    public static void main(String[] args) {

        IGeradorSenha gerador;

        // TODO:
        // Gerar duas senhas fortes
        gerador = new GeradorSenhaForte(12);
        System.out.println("Senha forte 1: " + gerador.gerarSenha());
        
        gerador = new GeradorSenhaForte(16);
        System.out.println("Senha forte 2: " + gerador.gerarSenha());
        // TODO:
        // Gerar dois PINs
        // Utilizar a variável "gerador" para demonstrar polimorfismo

    }
}
