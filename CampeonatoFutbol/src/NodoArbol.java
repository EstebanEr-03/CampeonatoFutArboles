public class NodoArbol {
    public EquipoFut datos;
    public NodoArbol iz;
    public NodoArbol der;
    public NodoArbol(EquipoFut datos) {
        this.datos = datos;
        iz = der = null;
    }

    public NodoArbol(EquipoFut datos, NodoArbol iz, NodoArbol der) {
        this.datos = datos;
        this.iz = iz;
        this.der = der;
    }

    public EquipoFut getDatos() {
        return datos;
    }

    public void setDatos(EquipoFut datos) {
        this.datos = datos;
    }

    public NodoArbol getIz() {
        return iz;
    }

    public void setIz(NodoArbol iz) {
        this.iz = iz;
    }

    public NodoArbol getDer() {
        return der;
    }

    public void setDer(NodoArbol der) {
        this.der = der;
    }
   /* public NodoArbol (){
            clave = null;//puede ser un numero,un string o una clase ejm Persona/Organigrama/Equipo
            iz=null;
            de=null;
    }
    public NodoArbol(EquipoFut equipoIngresado){
            clave=equipoIngresado;
            iz=null;
            de=null;
    }
    public NodoArbol(EquipoFut equipoIngresado,NodoArbol izq,NodoArbol der){
        clave=equipoIngresado;
        iz=izq;
        de=der;
    }*/



}
