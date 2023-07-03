public class NodoCola {
    private NodoArbol nodoDatos;
    private NodoCola siguiente;

    public NodoCola(NodoArbol nodoDatos, NodoCola siguiente) {
        this.nodoDatos = nodoDatos;
        this.siguiente = siguiente;
    }

    public NodoArbol getNodoDatos() {
        return nodoDatos;
    }

    public void setNodoDatos(NodoArbol nodoDatos) {
        this.nodoDatos = nodoDatos;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
}