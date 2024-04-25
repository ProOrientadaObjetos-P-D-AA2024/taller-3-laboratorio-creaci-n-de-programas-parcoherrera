package ejecutarhoras;

import equivalentehora.EquivalenteHora;

public class EjecutarHoras {

    public static void main(String[] args) {
        
        // OBJETO 1
        EquivalenteHora eh = new EquivalenteHora();
        
        // Asignar valores
        eh.setHoras(5);
        
        // Calcular
        eh.calcularMinutos();
        eh.calcularSegundos();
        eh.calcularDias();
        
        // Imprimir
        System.out.println(eh.getHoras()+" horas tiene las siguientes equivalencias:\n"
                +eh.getMinutos()+" minutos.\n"+eh.getSegundos()+" segundos.\n"
                +eh.getDias()+" días.");
        System.out.println("");
        
        // OBJETO 2
        EquivalenteHora eh2 = new EquivalenteHora();
        
        // Asignar valores
        eh2.setHoras(8);
        
        // Calcular
        eh2.calcularMinutos();
        eh2.calcularSegundos();
        eh2.calcularDias();
        
        // Imprimir
        System.out.println(eh2.getHoras()+" horas tiene las siguientes equivalencias:\n"
                +eh2.getMinutos()+" minutos.\n"+eh2.getSegundos()+" segundos.\n"
                +eh2.getDias()+" días.");
        
    }
    
}
