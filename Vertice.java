import java.util.ArrayList;

public class Vertice {
	
	private String dado;
	private ArrayList<Aresta> arestas;
	

	public Vertice(String dado) {
		this.dado=dado;
		arestas = new ArrayList<>();
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void addAresta(Aresta v) {
		arestas.add(v);
	}
	public void remAresta(Aresta v) {
		arestas.remove(v);
	}

	public String getDado() {
		return dado;
	}

	public void setDado(String dado) {
		this.dado = dado;
	}

}
