import java.util.Collections;
import java.util.List;

public class VisualizadorDeMediana implements Visualizador {
    private FonteDeDados fonteDeDados;

    public VisualizadorDeMediana(FonteDeDados fonteDeDados) {
        this.fonteDeDados = fonteDeDados;
        this.fonteDeDados.adicionaVisualizador(this);
    }
    public void exibeMediana() {
        List<Integer> valores = fonteDeDados.getValores();
        
        Collections.sort(valores);
        int size = valores.size();
        double mediana;
        
        if (size % 2 == 0) {
            mediana = (valores.get(size / 2 - 1) + valores.get(size / 2)) / 2.0;
        } else {
            mediana = valores.get(size / 2);
        }
        
        System.out.println("Mediana: " + mediana + ", quantidade de elementos analisados: " + valores.size());
    }

    
    @Override
    public void atualiza() {
        exibeMediana();
    }

}
