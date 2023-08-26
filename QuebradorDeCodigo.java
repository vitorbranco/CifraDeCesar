public class QuebradorDeCodigo {
    public static String quebrarCodigo(String mensagemEncriptada, String palavraConhecida) {
        for (int deslocamento = 1; deslocamento <= 26; deslocamento++) {
            String mensagemDecriptada = CifraDeCesar.decriptar(mensagemEncriptada, deslocamento);

            if (mensagemDecriptada.contains(palavraConhecida)) {
                return mensagemDecriptada;
            }
        }

        return "Não foi possível decriptar a mensagem.";
    }
}
