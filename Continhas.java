import java.util.Scanner;

public class Continhas {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int dobro = numero * 2;
        int quadrado = numero * numero;
        int sucessor = numero + 1;
        scanner.close();
        
        System.out.println("O dobro do seu numero é = " + dobro);
        System.out.println("O quadrado do seu numero é = " + quadrado);
        System.out.println("O sucessor do seu numero é = " + sucessor);
    }
}
