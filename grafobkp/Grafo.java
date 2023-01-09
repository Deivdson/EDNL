package grafobkp;

public class Grafo {
	private Vertice[] vertices;
	private int[][] matrizAdjacencia;
	
	public Grafo(int qtdVertices) {
		matrizAdjacencia = new int[qtdVertices][qtdVertices];
		vertices = new Vertice[qtdVertices];
	}
	
	public void inserirVertice(String dado) {
		
	}
	
	public String removeVertice(String dado) {
		return null;
	}
	
	public void listarVertices() {
		
	}
	public Vertice buscarVertice() {
		return null;
	}
}
