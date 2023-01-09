import java.util.ArrayList;
import java.util.List;

public class Grafo {
	private List<Vertice> vertices;
	private List<Aresta> listAdjacencia;
	
	public Grafo(int qtdVertices) {
		listAdjacencia = new ArrayList<>();
		vertices = new ArrayList<>();
	}
	
	public void inserirVertice(String dado) {
		vertices.add(new Vertice(dado));
	}
	
	public String removeVertice(String dado) {
		Vertice o = vertices.remove((vertices.indexOf(dado)));
		return o.getDado();
	}
	
	public void listarVertices() {
		
	}
	public Vertice buscarVertice(String dado) {
		Vertice o = vertices.get(vertices.indexOf(dado));
		return o;
	}
	
	public boolean eAdjacente(Vertice v, Vertice w) {
		for(Aresta a : listAdjacencia) {
			if((a.getOrigem().equals(v) && a.getDestino().equals(w) || (a.getDestino().equals(w) && a.getOrigem().equals(v)))){
				return true;
			}
		}				
		return false;
		
	}
	
}
