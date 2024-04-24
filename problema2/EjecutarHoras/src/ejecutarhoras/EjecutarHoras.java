package ejecutarhoras;

import paquete.EquivalenteHora;

public class EjecutarHoras {

    public static void main(String[] args) {
        
        EquivalenteHora eh = new EquivalenteHora();
        
        double horas = 5;
        
        eh.setHoras(horas);
        
        eh.calcularMinutos();
        eh.calcularSegundos();
        eh.calcularDias();
        
        System.out.println(eh.getHoras()+" horas tiene las siguientes equivalencias:\n"
                +eh.getMinutos()+" minutos.\n"+eh.getSegundos()+" segundos.\n"
                +eh.getDias()+" días.");
        
    }
    
}
