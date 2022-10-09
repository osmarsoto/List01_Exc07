import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
     //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
     double lado, area, dobro;
     System.out.print("Digite a área do quadrado: ");
     Scanner sc = new Scanner (System.in);
     lado = sc.nextDouble();
     sc.close();

     area = lado * lado;
     dobro = area * 2;

     System.out.print("O dobro da area quadrado é: "+dobro);

     



     
    }
}
