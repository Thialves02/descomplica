import javax.swing.*; 

class Programa04 
{
    public static void main(String entradas[])
    {
        int n1, n2;
        double quo, pot;
        String msg = "";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o primeiro número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escreva o segundo número"));

        quo = n1 % n2;
        pot = Math.pow(n1, n2);

        msg = "O quociente de n1 por n1 é " + quo + "\n";
        msg = msg + "A potencia de n1 por n2 é " + pot + "\n";

        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
}