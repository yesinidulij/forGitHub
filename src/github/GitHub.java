package github;
import javax.swing.JOptionPane;
public class GitHub {

    public static void main(String[] args) {
        // TODO code application logic here
        String fno=JOptionPane.showInputDialog("enter first number");
        String sno=JOptionPane.showInputDialog("enter second number");
        int n1=Integer.parseInt(fno);
        int n2=Integer.parseInt(sno);
        int sum=n1+n2;
        JOptionPane.showMessageDialog(null,"the sum is"+sum,"THE SUM OF TWO INTEGER IS",JOptionPane.PLAIN_MESSAGE);
    }
}
