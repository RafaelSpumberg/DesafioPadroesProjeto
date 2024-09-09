import java.util.List;

public class VisualizadorDeMedia implements Visualizador{
    private FonteDeDados fonteDeDados;

    public VisualizadorDeMedia(FonteDeDados fonteDeDados){
        this.fonteDeDados = fonteDeDados;
        this.fonteDeDados.adicionaVisualizador(this);
    }

    public void exibeMedia() {
        List<Integer> valores = fonteDeDados.getValores();
        double media = valores.stream()
            .mapToInt(Integer::intValue)
            .average()
            .orElse(0.0);
        System.out.println("Media: " + media + ", quantidade de elementos analisados: " + valores.size());
    }

    @Override
    public void atualiza(){
        exibeMedia();
    }
}
