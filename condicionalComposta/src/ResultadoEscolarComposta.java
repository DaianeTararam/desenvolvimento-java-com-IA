import javax.swing.JOptionPane;

public class ResultadoEscolarComposta {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da nota:"));
        if(nota >= 6){
            JOptionPane.showMessageDialog(null,"Aluno APROVADO!");
        }else{
            JOptionPane.showMessageDialog(null,"Aluno REPROVADO!");
        }
    }
}
