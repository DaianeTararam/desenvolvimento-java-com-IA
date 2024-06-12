import javax.swing.JOptionPane;

public class ResultadoEscolarEncadeada {
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da nota:"));
        if(nota < 3){
            JOptionPane.showMessageDialog(null,"Aluno REPROVADO!");
        }else if(nota >= 3 && nota < 6 ){
            JOptionPane.showMessageDialog(null,"Aluno em RECUPERAÇÃO!");
        }else {
            JOptionPane.showMessageDialog(null,"Aluno APROVADO!");
        }
    }
}

