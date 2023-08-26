public class CifraDeCesar {
    public static String decriptar(String mensagem, int deslocamento) {
        StringBuilder mensagemDecriptada = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char caractere = mensagem.charAt(i);

            if (Character.isLetter(caractere)) {
                int baseAlfabeto = Character.isUpperCase(caractere) ? 'A' : 'a';
                int offset = (caractere - baseAlfabeto - deslocamento + 26) % 26;
                char caractereDecriptado = (char) (baseAlfabeto + offset);
                mensagemDecriptada.append(caractereDecriptado);
            } else {
                mensagemDecriptada.append(caractere);
            }
        }    
        return mensagemDecriptada.toString();
    }
}
