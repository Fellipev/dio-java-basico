import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // TODO: Estanciar a classe Scanner.
        // Exibir as mensagens para o usuario.
        // Oter valores pelo Scanner.
        // Exibir a mensagem de conta criada.

        Scanner sc = new Scanner(System.in);

        while (true) {

            String escolha = criarConta(sc);

            if (escolha.equalsIgnoreCase("SIM")) {
                System.out.println("Conta criada!");
                break;
            } else if (escolha.equalsIgnoreCase("NAO")) {
                System.out.println("Ate a proxima!");
                System.exit(0);
            } else {
                System.out.println("Opcao invalida!");
            }
        }

        //No construtor do objeto ele faz a verificacao se o saldo é maior ou igual ao valor solicitado. se for ele grava no atributo o valor de saldo menos valor solicitado.
        //Se não for, ele solta uma Exception personalizada.
        ContaBancaria conta = new ContaBancaria(25, 18);
        System.out.println(conta);

        ContaBancaria conta2 = new ContaBancaria(15, 22);
        System.out.println(conta2);

    }

    public static String criarConta(Scanner sc) {

        System.out.println("Deseja criar uma conta bancaria? (SIM/NAO)");
        String escolha = sc.next();
        return escolha;
    }
}
