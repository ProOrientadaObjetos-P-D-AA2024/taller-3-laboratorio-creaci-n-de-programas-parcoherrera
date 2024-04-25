package institucion;

public class Institucion {
    
    private String nombre;
    private String tipo;
    private int nroAlumnos;
    private int nroDocentes;
    private int nroSedes;
    private double gastosEstudiante;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroAlumnos() {
        return nroAlumnos;
    }

    public void setNroAlumnos(int nroAlumnos) {
        this.nroAlumnos = nroAlumnos;
    }

    public int getNroDocentes() {
        return nroDocentes;
    }

    public void setNroDocentes(int nroDocentes) {
        this.nroDocentes = nroDocentes;
    }

    public int getNroSedes() {
        return nroSedes;
    }

    public void setNroSedes(int nroSedes) {
        this.nroSedes = nroSedes;
    }

    public double getGastosEstudiante() {
        return gastosEstudiante;
    }

    public void setGastosEstudiante(double gastosEstudiante) {
        this.gastosEstudiante = gastosEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void calcularPresupuesto() {
        presupuesto = nroAlumnos * gastosEstudiante;
    }
    
}
