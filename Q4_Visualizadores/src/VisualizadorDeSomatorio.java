import java.util.List;

public class VisualizadorDeSomatorio implements Visualizador {
    private FonteDeDados fonteDeDados;

    public VisualizadorDeSomatorio(FonteDeDados fonteDeDados) {
        this.fonteDeDados = fonteDeDados;
        this.fonteDeDados.adicionaVisualizador(this);
    }

    public void exibeSomatorio() {
        List<Integer> valores = fonteDeDados.getValores();
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: " + soma + ", quantidade de elementos analisados: " + valores.size());
    }
    
    @Override
    public void atualiza() {
        exibeSomatorio();
    }
}
