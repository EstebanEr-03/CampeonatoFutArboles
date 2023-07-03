import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    private Queue<NodoArbol> cola;

    public Cola(){
        cola=new LinkedList<NodoArbol>();
    }

    public boolean esVacia(){
        return cola.isEmpty();
    }

    public void encolar(NodoArbol dato){
        cola.add(dato);
    }

    public NodoArbol desencolar(){
        return cola.poll();
    }

    public int tamanio(){
        return cola.size();
    }

    public NodoArbol frente(){
        return cola.peek();
    }

    public String imprimir(){
        String resultado="";
        for (NodoArbol elemento : cola) {
            resultado+=elemento.getDatos().toString()+ "\n";
        }
        return resultado;
    }

}
