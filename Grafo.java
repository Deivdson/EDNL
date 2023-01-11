import java.util.ArrayList;
import java.util.List;

public class Grafo {
	private List<Vertice> vertices;
	private List<Aresta> listAdjacencia;
	
	public Grafo() {
		listAdjacencia = new ArrayList<>();
		vertices = new ArrayList<>();
	}
	
	public void inserirVertice(String dado) {
		vertices.add(new Vertice(dado));
	}
	
	public Aresta inserirAresta(Vertice v, Vertice w, int o) {
		Aresta a = new Aresta(v,w,o);
		v.addAresta(a);
		w.addAresta(a);
		listAdjacencia.add(a);
		return a;
	}
	
	public String removeVertice(String dado) {
		Vertice o = buscarVertice(dado);
		return o.getDado();
	}

	public Vertice buscarVertice(String dado) {
		Vertice o = null;
		for(Vertice v:vertices) {
			if(v.getDado().equals(dado)) {
				o = v;
			}
		}
		
		return o;
	}
	
	public boolean eAdjacente(Vertice v, Vertice w) {
		for(Aresta a : listAdjacencia) {
			if((a.getOrigem().equals(v) && a.getDestino().equals(w)) || (a.getDestino().equals(w) && a.getOrigem().equals(v))){
				return true;
			}
		}				
		return false;
		
	}
	public Vertice oposto(Vertice v, Aresta e) throws ArestaNaoIncidenteException {
		if(!(e.getDestino().equals(v)) && !(e.getOrigem().equals(v)))
			throw new ArestaNaoIncidenteException("Aresta não incidente");
		else{
			if(e.getDestino().equals(v))
				return e.getOrigem();
			else
				return e.getDestino();
		}		
	}
	
	public ArrayList<Vertice> finalVertices(Aresta e){
		//Retorna um array armazenando os vértices finais da aresta e.
		Aresta aux = e;
		ArrayList<Vertice> verts = new ArrayList<Vertice>();
		//Vertice v = e.getDestino();
		
		verts.add(e.getOrigem());
		verts.add(e.getDestino());				
		
		return verts;
	}
	
	public void subsVertice(Vertice v, String x) {
		v.setDado(x);
	}
	
	public void subsAresta(Aresta e, int x) {
		e.setPeso(x);
	}
	
	public String removeVertice(Vertice v) {
		ArrayList<Aresta> arestasV = v.getArestas();
		for(Aresta a: arestasV) {
			listAdjacencia.remove(a);
		}
		v.clearArestas();
		vertices.remove(v);
		return v.getDado();
	}
	
	public int removeAresta(Aresta e) {
		listAdjacencia.remove(e);
		return e.getPeso();
	}
	
	public ArrayList<Aresta> arestasIncidentes(Vertice v){
		return v.getArestas();
	}
	
	public List<Vertice> vertices(){
		return vertices;
	}
	public List<Aresta> arestas(){
		return listAdjacencia;
	}
	
	public boolean eDirecionada(Aresta e) {
		if(e.getOrigem() != null && e.getDestino() != null)
			return true;
		else
			return false;
	}
	
	public void inserirArestaDirecionada(Vertice v, Vertice w, int o) {
		listAdjacencia.add(new Aresta(v,w,o));
	}
}
