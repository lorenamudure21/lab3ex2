import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
//lab3ex2
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sammy’s makes it fun in the sun");
        System.out.println("Introduceti nr de ore pentru inchiriere:");
        Scanner sc = new Scanner(System.in);
        int ore = sc.nextInt();
        System.out.println("Introduceti numarul pentru minutele extra:");
        int minute = sc.nextInt();
        int pretora=40;
        int pretminut=1;
        int pretTotal=(ore*pretora)+(minute*pretminut);
        System.out.println("Numarul de ore: " + ore);
        System.out.println("Numarul de minute:" +minute);
        System.out.println("Pretul total:" +pretTotal);
           }
}