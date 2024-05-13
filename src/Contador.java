import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm;
        int parametroDois;

        System.out.println("Digite o primeiro parâmetro: ");
        parametroUm = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroDois<parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        int i;

        for (i=0;i<contagem;i++){
            System.out.println("Imprimindo o número " + (i+1));
        }
    }


}
