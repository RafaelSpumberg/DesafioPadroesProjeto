import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Visualizador> visualizadores;

    public FonteDeDados(){
        lst = new LinkedList<>();
        visualizadores = new LinkedList<>();
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notificaVisualizadores();
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }

    public void adicionaVisualizador(Visualizador visualizador) {
        visualizadores.add(visualizador);
    }

    public void removeVisualizador(Visualizador visualizador) {
        visualizadores.remove(visualizador);
    }

    private void notificaVisualizadores() {
        for (Visualizador visualizador : visualizadores) {
            visualizador.atualiza();
        }
    }
}