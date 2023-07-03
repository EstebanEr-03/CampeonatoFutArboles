import java.util.Random;

public class EquipoFut {
    String nombre;
    int golesEncajados;


    /*public EquipoFut(String nombre) {
        this.nombre = nombre;
    }

    public EquipoFut(String nombre, int golesEncajados) {
        this.nombre = nombre;
        this.golesEncajados = golesEncajados;
    }*/

    public EquipoFut(String nombre, boolean caso) {
        this.nombre = nombre;
        if(caso)
            golesEncajados=generarGoles();
        else
            golesEncajados=-1;
    }
    public int generarGoles() {
        Random aleatorio=new Random();
        int gol=aleatorio.nextInt();
        if(gol<0)
            gol=gol*(-1);
        gol=gol%8;
        golesEncajados=gol;
        return golesEncajados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        this.golesEncajados = golesEncajados;
    }

    @Override
    public String toString() {
        if(golesEncajados==-1)
            return "Equipo Campeon: "+nombre;
        else
            return "Equipo "+nombre+" goles=" + golesEncajados;
    }
}
