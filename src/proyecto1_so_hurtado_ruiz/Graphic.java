
package proyecto1_so_hurtado_ruiz;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import static java.lang.Thread.sleep;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Graphic extends JFrame implements Runnable {
    JFreeChart chart;
    XYSeries serie1;
    XYSeries serie2;
    ChartPanel panel; // Mueve el panel a nivel de clase

    JTextField daysMS;
    JLabel incomeHP;
    JLabel incomeDELL;

    int numPairs = 5; // Números de parejas ordenadas que se verán en el gráfico

    public Graphic(JTextField daysMS, JLabel incomeHP, JLabel incomeDELL) {
        super("Gráfico HP vs. DELL");
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.daysMS = daysMS;
        this.incomeHP = incomeHP;
        this.incomeDELL = incomeDELL;

        createGUI();
        setVisible(true);
        new Thread(this).start(); // Inicia el hilo correctamente
    }

    private void createGUI() {
        JLabel jl = new JLabel("Gráfico HP vs. DELL");
        jl.setBounds(0, 0, 800, 50);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        jl.setOpaque(true);
        jl.setBackground(Color.CYAN);
        add(jl);

        createGraphic();

        panel = new ChartPanel(chart, false); // Inicializa el ChartPanel
        panel.setBounds(15, 60, 750, 480);
        add(panel);
    }

    public void run() {
        try {
            int x = 1; // valor de la coordenada en x
            while (true) {
                sleep(19000);
                Thread.sleep(Integer.parseInt(daysMS.getText()));

                int yHP = Integer.parseInt(incomeHP.getText()); // Valor de la ganancia de HP
                serie1.add(x, yHP); // Adicionar la pareja ordenada al grafico

                int yDELL = Integer.parseInt(incomeDELL.getText()); // Valor de la ganancia de DELL
                serie2.add(x, yDELL); // Adicionar la pareja ordenada al grafico

                // Si se visualizaron todas las parejas ordenadas, entonces...
                if (serie1.getItemCount() > numPairs) {
                    serie1.remove(0); // Borrar la primera pareja ordenada del grafico
                    serie2.remove(0); // Borrar la primera pareja ordenada del grafico
                }

                // Actualiza el panel de gráficos
                SwingUtilities.invokeLater(() -> panel.repaint());

                x++; // Aumentar la coordenada x
            }
        } catch (InterruptedException ie) {
            JOptionPane.showMessageDialog(null, "Error en el método sleep");
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Error en el formato del número: " + nfe.getMessage());
        }
    }

    public void createGraphic() {
        serie1 = new XYSeries("HP");
        serie1.add(0, 0); // Adicionar la primera pareja ordenada al grafico        

        serie2 = new XYSeries("DELL");
        serie2.add(0, 0); // Adicionar la primera pareja ordenada al grafico

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(serie1);
        dataset.addSeries(serie2);

        chart = ChartFactory.createXYLineChart(
                "HP vs. DELL", // Titulo
                "Companies",   // Etiqueta Coordenada X
                "Income",      // Etiqueta Coordenada Y
                dataset,       // Datos
                PlotOrientation.VERTICAL,
                true,          // Muestra la leyenda de los productos en el eje de la X
                true,          // Mostrar la leyenda en cada punto
                false
        );
    }
}
