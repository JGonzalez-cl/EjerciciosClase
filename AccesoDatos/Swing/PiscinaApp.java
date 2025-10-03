package AccesoDatos.Swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;

public class PiscinaApp extends JFrame {
    
    class Piscina {
        private int nivel;
        public final int MAX_NIVEL;

        public Piscina(int max) {
            if (max < 0) max = 0;
            MAX_NIVEL = max;
        }

        public int getNivel() {
            return nivel;
        }

        public void vaciar(int cantidad) {
            if (nivel - cantidad < 0) {
                nivel = 0;
                throw new IllegalStateException("La piscina ya esta vacia");
            }
            nivel = nivel - cantidad;
        }

        public void llenar(int cantidad) {
            if (nivel + cantidad > MAX_NIVEL) {
                nivel = MAX_NIVEL;
                throw new IllegalStateException("No se puede llenar mas la piscina");
            }
            nivel = nivel + cantidad;
        }
    }

    private Piscina piscina;
    private JSlider jS;
    private JTextArea textArea;
    private JButton btnLlenar;
    private JButton btnVaciar;
    private Random random;
    
    public PiscinaApp(int capacidad) { // capacidad en m3
        super("Simulador Piscina");
        piscina = new Piscina(capacidad);
        random = new Random();

        jS = new JSlider(); 
        jS.setMinimum(0);
        jS.setMaximum(capacidad);
        jS.setMajorTickSpacing(100);
        jS.setMinorTickSpacing(10);
        jS.setValue(0);
        jS.setPaintTicks(true);
        jS.setPaintLabels(true);
        jS.setEnabled(false);

        textArea = new JTextArea(8,25);
        textArea.setEditable(false);
        actualizarTexto("Aplicacion iniciada.\n");

        btnLlenar = new JButton("Llenar aleatoriamente");
        btnVaciar = new JButton("Vaciar aleatoriamente");

        btnLlenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int cantidad = random.nextInt(1000) + 1; 
                try {
                    piscina.llenar(cantidad);
                    jS.setValue(piscina.getNivel());
                    actualizarTexto("Se llenaron " + cantidad + " M3.\nNivel actual: "
                                    + piscina.getNivel() + " M3\n");
                } catch (Exception ex) {
                    actualizarTexto("Error al llenar: " + ex.getMessage()
                    + "\nNivel actual: " + piscina.getNivel() + " M3\n");
                }
            }
        });

        btnVaciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int cantidad = random.nextInt(1000) + 1;
                try {
                    piscina.vaciar(cantidad);
                    jS.setValue(piscina.getNivel());
                    actualizarTexto("Se vaciaron " + cantidad + " M3.\nNivel actual: "
                                    + piscina.getNivel() + " M3\n");
                } catch (Exception ex) {
                    actualizarTexto("Error al vaciar: " + ex.getMessage()
                            + "\nNivel actual: " + piscina.getNivel() + " M3\n");
                }
            }
        });

        // Botones
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnLlenar);
        panelBotones.add(btnVaciar);

        // Layout
        setLayout(new BorderLayout());
        add(jS, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }

    private void actualizarTexto(String msg) {
        textArea.append(msg);
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce la capacidad de la piscina en m3:");
        int capacidad = Integer.parseInt(input);
        new PiscinaApp(capacidad);
    }
}
