import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            Contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){

            System.out.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void Contar(int parametroUm, int parametroDois)
        throws ParametrosInvalidosException {
            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException(" o segundo parametro deve ser maior que o primeiro");
                
            }

            int contagem = parametroDois - parametroUm;

            for (int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número" + i);
            }
        }
}
