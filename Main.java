import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digita a mensagem encriptada: ");
        String mensagemEncriptada = scanner.nextLine();

        System.out.println("Digite a palavra conhecida: ");
        String palavraConhecida = scanner.nextLine();

        String mensagemDecriptada = QuebradorDeCodigo.quebrarCodigo(mensagemEncriptada, palavraConhecida);

        System.out.println("Aqui esta a mensagem decriptada:");
        System.out.println(mensagemDecriptada);

        scanner.close();
    }
}