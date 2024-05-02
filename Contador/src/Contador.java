import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro Parâmentro:");
        int paramentro1 = terminal.nextInt();

        System.out.println("Digite o segundo Parâmetro:");
        int paramentro2 = terminal.nextInt();

        try {
            contar( paramentro1, paramentro2);
        }catch (ParametrosInvalidadosException e) {
            System.out.println(e.getMessage());
        }
    }

    static void contar (int paramentro1, int paramentro2 ) throws ParametrosInvalidadosException {
        if (paramentro1 >= paramentro2) {
            throw new ParametrosInvalidadosException("O parâmetro 2 deve ser maior do que o parâmetro 1");
        } 

        int contagem = paramentro1 - paramentro2;

        for(int i = 1; i <= contagem; i++){
            System.out.println( "Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidadosException extends Exception {
    public ParametrosInvalidadosException(String message) {
        super(message);
    }
}
