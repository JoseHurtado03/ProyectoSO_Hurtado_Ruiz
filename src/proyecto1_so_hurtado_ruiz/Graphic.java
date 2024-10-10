
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
import javax.swing.JTextField;

public class Graphic extends JFrame implements Runnable{
    JFreeChart chart;
    XYSeries serie1;
    XYSeries serie2;
    
    JTextField daysMS;
    JLabel incomeHP;
    JLabel incomeDELL;

    int numPairs = 5;//Números de parejas ordenadas que se verán en el gráfico

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
        run();
    }

    private void createGUI() {
        JLabel jl = new JLabel("Gráfico HP vs. DELL");
        jl.setBounds(0, 0, 800, 50);
        jl.setFont(new Font("Tahoma", Font.BOLD, 25));
        jl.setOpaque(true);
        jl.setBackground(Color.CYAN);
        add(jl);

        createGraphic();

        ChartPanel panel = new ChartPanel(chart, false);
        panel.setBounds(15, 60, 750, 480);
        add(panel);
    }

    public void run() {
        try {
            int x = 1;//valor de la coordenada en x
            int y = 0;//valor de la coordenada en x
            while (true) {
                
                Thread.sleep(Integer.parseInt(daysMS.getText()));
                
                
                y = Integer.parseInt(incomeHP.getText());//Valor de la ganancia de HP
                serie1.add(x, y);//adicionar la pareja ordenada al grafico
                
                
                y = Integer.parseInt(incomeDELL.getText());//Valor de la ganancia de HP
                serie2.add(x, y);//adicionar la pareja ordenada al grafico

                if (serie1.getItemCount() > numPairs) {//si se visualizaron todas las parejas ordenadas, entonces...
                    serie1.remove(0);//borrar la primera pareja ordenada del grafico
                    serie2.remove(0);//borrar la primera pareja ordenada del grafico
                }
                x++;//aumentar la coordenada x
            }
        } catch (InterruptedException ie) {
            JOptionPane.showMessageDialog(null, "Error en el método sleep");
        }
    }

    public void createGraphic() {
        serie1 = new XYSeries("HP");
        serie1.add(0, 0);//adicionar la primera pareja ordenada al grafico		

        serie2 = new XYSeries("DELL");
        serie2.add(0, 0);//adicionar la primera pareja ordenada al grafico

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
                true,          // mostrar la leyenda en cada punto
                false
        );
    }
}
