import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Digite o primeiro número: ");
int numeroInicial = scanner.nextInt();
System.out.println("Digite o segundo número: ");
int numeroFinal = scanner.nextInt();
for (int i = numeroInicial; i <= numeroFinal; i++) {
System.out.println("Imprimindo o número " + i);
}
        try {
            if (args.length != 2) {
                throw new ParametrosInvalidosException("Número incorreto de parâmetros. São necessários exatamente 2 parâmetros.");
            }

           

            if (numeroInicial >= numeroFinal) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = numeroInicial; i <= numeroFinal; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os parâmetros devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}





