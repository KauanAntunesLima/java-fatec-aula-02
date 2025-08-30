// ler um valor de raio, calcular o comprimento (2.pi.r) da circunferencia, a
//  área (pi.r ao quadrado) do circulo e o volume (4/3.pi.r ao cubo) da esfera correspondentes 
// e exibir os resultados

import java.util.Scanner;

public class Bolinhas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = scanner.nextDouble();
        scanner.close();
        double comprimento = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = 4.0/3 * Math.PI * Math.pow(raio, 3);
        System.out.println("comprimento = " + comprimento);
        System.out.println("area = " + area);
        System.out.println("volume = " + volume);
    }
}
