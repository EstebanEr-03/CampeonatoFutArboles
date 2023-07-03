import java.util.ArrayList;
import java.util.List;

public class Arbol {
    public NodoArbol raiz;
    public String nombre;
    List<EquipoFut> equiposFut=new ArrayList<>();


    public Arbol() {
        raiz = null;
    }

    public Arbol(EquipoFut datos) {
        raiz = new NodoArbol(datos);
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void unir(EquipoFut datos, NodoArbol iz, NodoArbol der) {
        if (iz == der) {
            System.out.println("No se puede unir");
            return;
        }
        raiz = new NodoArbol(datos, iz, der);

    }
    public String recorridoAnchura() {
        if (raiz != null) {
            Cola cola = new Cola();
            cola.encolar(raiz);
            Cola colaAux = new Cola();
            while (!cola.esVacia()) {
                NodoArbol aux = cola.desencolar();
                if (aux.getIz() != null) {
                    cola.encolar(aux.getIz());
                }
                if (aux.getDer() != null) {
                    cola.encolar(aux.getDer());
                }
                colaAux.encolar(aux);

            }
            return colaAux.imprimir();

        }
        return "No hay elementos";

    }

    /*public Arbol() {
        raiz = null;
        nombre = null;
    }
    public Arbol(EquipoFut equipoFutRaiz) {
        raiz=new NodoArbol(equipoFutRaiz,null,null);
    }
    public NodoArbol getRaiz() {
        return raiz;
    }
   public void unir(EquipoFut datos, NodoArbol iz, NodoArbol der) {
        if (iz == der) {
            System.out.println("No se puede unir");
            return;
        }
        raiz = new NodoArbol(datos, iz, der);

    }*/
    /*public Arbol(EquipoFut equipoFutRaiz,String nombreArbol){
        raiz=new NodoArbol(equipoFutRaiz,null,null);
        nombre=nombreArbol;
    }*/

    /*public void juntar(EquipoFut dato,Arbol a1,Arbol a2){
        if (a1.raiz==a2.raiz && a1.raiz!=null){
            System.out.println("no se pueden mezclar, t1 y t2 iguales");
            return;
        }
        raiz=new NodoArbol(dato,a1.raiz,a2.raiz);
        if (this!=a1)
            a1.raiz=null;
        if (this!=a2)
            a2.raiz=null;
    }
    static void preOrden(NodoArbol arbol){
        if (arbol !=null){
            System.out.println(arbol.clave+" ");//String o stringbuilder
            preOrden(arbol.iz);
            preOrden(arbol.de);
        }
    }
    public void preOrden(){
        preOrden(raiz);
    }
    static void postOrden(NodoArbol arbol){
        if (arbol!=null){
            postOrden(arbol.iz);
            postOrden(arbol.de);
            System.out.println(arbol.clave+" ");
        }
    }
    public void postOrden(){
        preOrden(raiz);
    }
    static void ordenCentral (NodoArbol arbol){
        if (arbol!=null){
            ordenCentral(arbol.iz);
            System.out.println(arbol.clave+" ");
            ordenCentral(arbol.de);
        }
    }
    public void ordenCentral(){
        ordenCentral(raiz);
    }



    /*static void clavesNiveles (Arbol a){
        clavesNiveles(a.raiz,1);
    }*/
    /*static boolean iguales (NodoArbol a,NodoArbol b){
        boolean resul;
        if ((a ==null)&&(b==null)) {
            resul = true;
        }else if ((a ==null) || (b==null)) {
            resul=false;
            } else if (a.clave ==b.clave) {
                resul=iguales(a.iz,b.iz) && iguales(a.de,b.de);
            }else resul=false;
        return resul;
    }
    static boolean iguales (Arbol a1,Arbol a2){
        return iguales(a1.raiz,a2.raiz);
    }*/
}
