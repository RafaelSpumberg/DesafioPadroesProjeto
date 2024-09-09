public class App {
    public static void main(String[] args) {
        FonteDeDados fonte = new FonteDeDados();
        System.out.println("Utilizacao dos 3 visualizadores definidos: ");
        VisualizadorDeMedia visualizadorMedia = new VisualizadorDeMedia(fonte);
        VisualizadorDeSomatorio visualizadorSomatorio = new VisualizadorDeSomatorio(fonte);
        VisualizadorDeMediana visualizadorMediana = new VisualizadorDeMediana(fonte);
        fonte.add(10);
        fonte.add(20);
        fonte.add(30);
        fonte.add(40);
        fonte.add(50);

        System.out.println("Removendo visualizador mediana: ");
        fonte.removeVisualizador(visualizadorMediana);
        fonte.add(60);
        fonte.add(70);
        fonte.add(80);
    }
}
