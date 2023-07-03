import java.util.List;

public class SystemArbol {
    Arbol arbolBinario;

    public SystemArbol() {
    }

    public SystemArbol(Arbol arbolBinario) {
        this.arbolBinario = arbolBinario;
    }

    public void aniadirEquipos(EquipoFut equipoFutNuevo){
        arbolBinario.equiposFut.add(equipoFutNuevo);
    }
    public EquipoFut comprobarExistencia(List<EquipoFut> listaEquiposParaComprobar,String equipoFutNombrebuscar){
        EquipoFut equipoRetornar=null;
        for (EquipoFut equipoFutBuscador:listaEquiposParaComprobar){
            if (equipoFutBuscador.getNombre().equalsIgnoreCase(equipoFutNombrebuscar)) {
                equipoRetornar=equipoFutBuscador;
                return equipoRetornar;
            }
        }
        return equipoRetornar;
    }

    public Arbol getArbolBinario() {
        return arbolBinario;
    }

    public void setArbolBinario(Arbol arbolBinario) {
        this.arbolBinario = arbolBinario;
    }
}
