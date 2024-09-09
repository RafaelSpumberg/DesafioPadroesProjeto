public class App {
    public static void main(String[] args) throws Exception {
        Codificador cod = new Codificador();
        Codificadorr codS = new CodificadorSimples();
        Codificadorr codD = new CodificadorDeslocamento();
        String aux = "Desafio Padrões de Projeto";
        
        System.out.println(aux);
        aux = codS.codifica(aux);
        System.out.println("Codificando utilizando nova classe codificador simples: " + aux);
        aux = codS.decodifica(aux);
        System.out.println("Decodificando utilizando nova classe codificador simples: " + aux);
        
        aux = codD.codifica(aux);
        System.out.println("Codificando utilizando nova classe codificador deslocamento: " + aux);
        aux = codD.decodifica(aux);
        System.out.println("Decodificando utilizando nova classe codificador deslocamento: " + aux);


        System.out.println("------------------------------sem STRATEGY---------------------");
        System.out.println(aux);
        aux = cod.codifica(Codificador.Tipo.SIMPLES, aux);
        System.out.println(aux);
        aux = cod.deCodifica(Codificador.Tipo.SIMPLES, aux);
        System.out.println(aux);
        aux = cod.codifica(Codificador.Tipo.DESLOCA, aux);
        System.out.println(aux);
        aux = cod.deCodifica(Codificador.Tipo.DESLOCA, aux);
        System.out.println(aux);
    }
}
