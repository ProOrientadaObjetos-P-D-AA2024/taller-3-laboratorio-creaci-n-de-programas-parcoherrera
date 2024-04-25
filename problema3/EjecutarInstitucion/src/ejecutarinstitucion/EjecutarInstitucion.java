package ejecutarinstitucion;

import institucion.Institucion;

public class EjecutarInstitucion {

    public static void main(String[] args) {
        
        // OBJETO 1
        Institucion ie = new Institucion();
        
        // Asignar valores
        ie.setNombre("Daniel Álvarez Burneo");
        ie.setTipo("Fiscomisional");
        ie.setNroAlumnos(1344);
        ie.setNroDocentes(189);
        ie.setNroSedes(2);
        ie.setGastosEstudiante(320);
        
        // Calcular
        ie.calcularPresupuesto();
        
        // Imprimir
        
        System.out.println("La Institucion Educativa "+ie.getNombre()+" de tipo "
                +ie.getTipo()+", con "+ie.getNroAlumnos()+" alumnos,\n"+ie.getNroDocentes()
                +" docentes y "+ie.getNroSedes()+" sedes, cuyos gastos proyectados por estudiante son de $"
                +ie.getGastosEstudiante()+" tiene un\npresupuesto de "+ie.getPresupuesto()+".");
        System.out.println("");
        
        // OBJETO 2
        Institucion ie2 = new Institucion();
        
        // Asignar valores
        ie2.setNombre("Vicente Agustin Aguirre Ruiz");
        ie2.setTipo("Particular");
        ie2.setNroAlumnos(631);
        ie2.setNroDocentes(55);
        ie2.setNroSedes(1);
        ie2.setGastosEstudiante(280);
        
        // Calcular
        ie2.calcularPresupuesto();
        
        // Imprimir
        
        System.out.println("La Institucion Educativa "+ie2.getNombre()+" de tipo "
                +ie2.getTipo()+", con "+ie2.getNroAlumnos()+" alumnos,\n"+ie2.getNroDocentes()
                +" docentes y "+ie2.getNroSedes()+" sedes, cuyos gastos proyectados por estudiante son de $"
                +ie2.getGastosEstudiante()+" tiene un\npresupuesto de "+ie2.getPresupuesto()+".");
        
    }
    
}
