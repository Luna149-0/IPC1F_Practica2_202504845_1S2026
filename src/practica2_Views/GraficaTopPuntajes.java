//Este es para lo del top de puntajes
package practica2_Views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import practica2_Controller.PartidaController;

public class GraficaTopPuntajes {

    private JPanel PanelGrafica;

    public GraficaTopPuntajes(JPanel PanelGrafica) {
        this.PanelGrafica = PanelGrafica;
        mostrarGrafica();
    }

    private void mostrarGrafica() {
        PartidaController pController = new PartidaController();
        String[][] datos = pController.topPuntajes();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < datos.length; i++) {
            String nombre = datos[i][0];
            int puntos = Integer.parseInt(datos[i][1]);
            dataset.setValue(puntos, "Punteo Total", nombre);
        }

        JFreeChart grafica = ChartFactory.createBarChart(
                "Ranking de Jugadores",
                "Jugadores",
                "Punteo Total",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        ChartPanel chartPanel = new ChartPanel(grafica);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(540, 288));

        PanelGrafica.removeAll();
        PanelGrafica.setLayout(new BorderLayout());
        PanelGrafica.add(chartPanel, BorderLayout.CENTER);
        PanelGrafica.revalidate();
        PanelGrafica.repaint();
    }
}