import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 390.00;
        double valorSolicitado = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de saque:"));

        if(valorSolicitado <= saldo){
            saldo = saldo - valorSolicitado;
            JOptionPane.showMessageDialog(null, "O novo saldo na conta é de R$"+ saldo +".");
        }else{
            JOptionPane.showMessageDialog(null, "Valor indisponível, o seu saldo é de R$"+saldo+".");
        }
    }
}
