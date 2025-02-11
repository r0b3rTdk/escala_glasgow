import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscalaGlasgow extends javax.swing.JFrame implements ActionListener {
    private JLabel respostaMotoraLabel, respostaVerbalLabel, aberturaOcularLabel, resultadoLabel, nivelConscienciaLabel;
    private JTextField respostaMotoraField, respostaVerbalField, aberturaOcularField;
    private JButton calcularButton;

    public EscalaGlasgow() {
        initComponents();
    }

    private void initComponents() {
        // criar janela
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ESCALA DE COMA DE GLASGOW");
        setResizable(false);
        getContentPane().setBackground(Color.BLACK);

        // criar layout principal
        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        contentPane.setLayout(new GridBagLayout());
        contentPane.setBackground(Color.BLACK);
        setContentPane(contentPane);

        // criar componentes

        aberturaOcularLabel = new JLabel("Abertura Ocular (1-4):  ");
        aberturaOcularField = new JTextField(10);
        respostaVerbalLabel = new JLabel("Resposta Verbal (1-5):  ");
        respostaVerbalField = new JTextField(10);
        respostaMotoraLabel = new JLabel("Resposta Motora (1-6):   ");
        respostaMotoraField = new JTextField(10);

        calcularButton = new JButton("CALCULAR");
        calcularButton.addActionListener(this);
        calcularButton.setBackground(Color.BLACK);
        calcularButton.setForeground(Color.WHITE);

        resultadoLabel = new JLabel();
        resultadoLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultadoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultadoLabel.setForeground(Color.WHITE);

        nivelConscienciaLabel = new JLabel();
        nivelConscienciaLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nivelConscienciaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nivelConscienciaLabel.setForeground(Color.WHITE);

        // configuração do layout 
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5, 0, 5, 0);

        c.gridx = 0;
        c.gridy = 2;
        contentPane.add(aberturaOcularLabel, c);

        c.gridx = 1;
        c.gridy = 2;
        contentPane.add(aberturaOcularField, c);

        c.gridx = 0;
        c.gridy = 1;
        contentPane.add(respostaVerbalLabel, c);

        c.gridx = 1;
        c.gridy = 1;
        contentPane.add(respostaVerbalField, c);

        c.gridx = 0;
        c.gridy = 0;
        contentPane.add(respostaMotoraLabel, c);

        c.gridx = 1;
        c.gridy = 0;
        contentPane.add(respostaMotoraField, c);

        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        contentPane.add(calcularButton, c);

        c.gridx = 0;
        c.gridy = 4;
        c.gridwidth = 2;
        contentPane.add(resultadoLabel, c);

        c.gridx = 0;
        c.gridy = 5;
        c.gridwidth = 2;
        contentPane.add(nivelConscienciaLabel, c);


        aberturaOcularLabel.setForeground(Color.WHITE);
        respostaVerbalLabel.setForeground(Color.WHITE);
        respostaMotoraLabel.setForeground(Color.WHITE);
        calcularButton.setForeground(Color.BLACK);

        respostaMotoraField.setBackground(Color.WHITE);
        respostaVerbalField.setBackground(Color.WHITE);
        aberturaOcularField.setBackground(Color.WHITE);

        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calcularButton) {

            int aberturaOcular = Integer.parseInt(aberturaOcularField.getText());
            int respostaVerbal = Integer.parseInt(respostaVerbalField.getText());
            int respostaMotora = Integer.parseInt(respostaMotoraField.getText());

            int pontos = respostaMotora + respostaVerbal + aberturaOcular;
            resultadoLabel.setText("Pontos: " + pontos);

            String nivelConsciencia = "";

            if (respostaMotora >= 5 && respostaVerbal >= 4 && aberturaOcular >= 3) {
                nivelConsciencia = "Leve";
            } else if ((respostaMotora >= 3 && respostaMotora <= 4) && respostaVerbal >= 2 && aberturaOcular >= 2) {
                nivelConsciencia = "Moderado";
            } else {
                nivelConsciencia = "Grave";
            }

            nivelConscienciaLabel.setText("Nível de Consciência: " + nivelConsciencia);
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscalaGlasgow().setVisible(true);
            }
        });
    }
}
