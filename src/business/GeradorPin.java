package business;

public class GeradorPin extends GeradorSenha {

    @Override
    public String gerarSenha() {
        String pin;
        
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(sortearCaractere(NUMEROS));
            }
            pin = sb.toString();
            
        } while (isPinInvalido(pin));
        
        return pin;
    }

    private boolean isPinInvalido(String pin) {
        return todosDigitosIguais(pin) || isSequenciaCrescente(pin) || isSequenciaDecrescente(pin);
    }

    private boolean todosDigitosIguais(String pin) {
        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != pin.charAt(0)) {
                return false;
            }
        }
        return true;
    }

    private boolean isSequenciaCrescente(String pin) {
        return "0123456789".contains(pin);
    }

    private boolean isSequenciaDecrescente(String pin) {
        return "9876543210".contains(pin);
    }
}