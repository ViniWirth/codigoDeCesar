import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Você deseja (c)odificar ou (d)ecodificar a mensagem? ");
        String opcao = ler.nextLine().toLowerCase();

        System.out.print("Digite a mensagem: ");
        String texto = ler.nextLine();

        int deslocamento;
        if (opcao.equals("c")) {
            deslocamento = 3;
        } else if (opcao.equals("d")) {
            deslocamento = -3;
        } else {
            System.out.println("Opção inválida. Por favor, escolha 'c' para codificar ou 'd' para decodificar.");
            return;
        }

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char charAtual = texto.charAt(i);

            //LETRAS MAIUSCULAS
            if (charAtual >= 'A' && charAtual <= 'Z') {
                char codificado = (char) (((charAtual - 'A' + deslocamento) % 26 + 26) % 26 + 'A');
                resultado += codificado;
            }
            //LETRAS MINUSCULAS
            else if (charAtual >= 'a' && charAtual <= 'z') {
                char codificado = (char) (((charAtual - 'a' + deslocamento) % 26 + 26) % 26 + 'a');
                resultado += codificado;
            }
            //INALTERADOS
            else {
                resultado += charAtual;
            }
        }

        if (opcao.equals("c")) {
            System.out.println("Mensagem codificada: " + resultado);
        } else {
            System.out.println("Mensagem decodificada: " + resultado);
        }
    }
}
