
public class Main {

	public static void main(String[] args) {
		Grafo g = new Grafo();
		
		g.inserirVertice("A");
		g.inserirVertice("B");
		g.inserirVertice("C");
		
		Vertice a = g.buscarVertice("A");
		System.out.println("Vertice: " + a.getDado() + "\nref:" + a);
		Vertice b = g.buscarVertice("B");
		System.out.println("Vertice: " + b.getDado() + "\nref:" + b);
		Vertice c = g.buscarVertice("C");
		System.out.println("Vertice: " + c.getDado() + "\nref:" + c);
		
		
		System.out.println("Inserindo arestas: ");
		g.inserirAresta(a, b, 3);
		System.out.println(g.arestas());
		g.inserirAresta(b, c, 4);
		System.out.println(g.arestas());
		g.inserirAresta(c, a, 5);
		System.out.println(g.arestas());
		for(Aresta a1 : g.arestas()) {
			System.out.println("Origem: "+a1.getOrigem()+ " | Destino: "+ a1.getDestino()+ " | Peso: " + a1.getPeso());
		}
		
		System.out.println("\n B e C sao adjacentes? "+ (g.eAdjacente(b, c)==true?"Sim":"Nao"));
		
		System.out.println("\nFuncao eDirecionada:");
		for(Aresta arst : g.arestas()) {
			System.out.println(" Aresta: " +arst.getOrigem().getDado()+"-"+arst.getDestino().getDado()+" | "+g.eDirecionada(arst));
		}
		
		System.out.println("\nArestas incidentes: ");
		for(Vertice v : g.vertices()) {
			System.out.println("\n Vertice: " + v.getDado()+ ":");
			for(Aresta arst:v.getArestas()) {
				System.out.println("  Aresta: "+arst.getOrigem().getDado()+"-"+arst.getDestino().getDado());
			}
		}
		
	}

}
