package business;

public class GeradorSenhaForte extends GeradorSenha {

    private int tamanho;

    public GeradorSenhaForte(int tamanho) {
        // TODO validar tamanho mínimo
        if (tamanho < 12) {
            throw new IllegalArgumentException("A senha deve ter no mínimo 12 caracteres.");
    }
        this.tamanho = tamanho;
    }

    @Override
    public String gerarSenha() {
        // TODO implementar
          StringBuilder senha = new StringBuilder();

        senha.append(sortearCaractere(MAIUSCULAS));
        senha.append(sortearCaractere(MINUSCULAS));
        senha.append(sortearCaractere(NUMEROS));
        senha.append(sortearCaractere(ESPECIAIS));

        String todosCaracteres = MAIUSCULAS + MINUSCULAS + NUMEROS + ESPECIAIS;

        while (senha.length() < tamanho) {
            senha.append(sortearCaractere(todosCaracteres));
        }
        return embaralhar(senha.toString());
    }
    
}
