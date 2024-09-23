import java.util.Scanner;

public class Beecrowd1043 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        float A, B, C;
        String sequencia;
        String[] partes;

        //ler a sequência
        sequencia = leitor.nextLine();
        partes = sequencia.split(" ");

        //atribuir valores às variáveis
        A = Float.parseFloat(partes[0]);
        B = Float.parseFloat(partes[1]);
        C = Float.parseFloat(partes[2]);

        //verificar se é possivel formar um triãngulo e mostrar resultado no console
        if (B + C > A && C + A > B && A + B > C) {
            System.out.printf("Perimetro = %.1f%n", A + B + C);
        } else {
            System.out.printf("Area = %.1f%n", ((A + B) * C) / 2);
        }
    }
}
