package edu.matheus.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Matheus";
        String segundoNome = "de Queiroz";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metódo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
