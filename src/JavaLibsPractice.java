import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        //caixa que guarda informações 
        String input = (String) JOptionPane.showInputDialog(null,
                "Digite seu nome",
                "Título caixa de diálogo",
                3,
                null,
                null,
                "Digite seu nome.");
                System.out.println("meu nome:" + input);
                
        String input2 = (String) JOptionPane.showInputDialog(null,
                "Digite sua idade",
                "Título caixa de diálogo",
                3,
                null,
                null,
                "Digite sua idade.");
                System.out.println("minha idade:" + input2); 
                
        String input3 = (String) JOptionPane.showInputDialog(null,
                "Digite seu cep",
                "Título caixa de diálogo",
                3,
                null,
                null,
                "Digite seu cep.");
                System.out.println("meu cep :" + input3);
                
        Scanner sc = new Scanner (System.in);
                System.out.println("Digite o primeiro numero:");
                int    n1 = sc.nextInt();
                System.out.println("Digite o primeiro numero:");
                int    n2 = sc.nextInt();
                System.out.println("Digite o primeiro numero:");
                int    n3 = sc.nextInt();
                System.out.println("A soma dos numeros e igual a:" + (n1+n2+n3));
                sc.close();         
    }   
    
}