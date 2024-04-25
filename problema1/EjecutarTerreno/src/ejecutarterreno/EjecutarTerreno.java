package ejecutarterreno;

import terreno.Terreno;

public class EjecutarTerreno {

    public static void main(String[] args) {
        
        // OBJETO 1
        Terreno terr = new Terreno();
        
        // Asignar valores
        terr.setAncho(4);
        terr.setLargo(10);
        terr.setValorMetroCuadrado(200);
        
        // Calcular
        terr.calcularArea();
        terr.calcularCostoTerreno();
        
        // Imprimir
        System.out.println("El terreno que tiene "+terr.getAncho()+" metros de ancho, "
                +terr.getLargo()+" metros de largo, y un valor por metro\ncuadrado de "
                +terr.getValorMetroCuadrado()+", tiene un área de "+terr.getArea()
                +" metros cuadrados, y un costo total de $"+terr.getCostoTerreno()+".");
        System.out.println("");
        
        // OBJETO 2
        Terreno terr2 = new Terreno();
        
        // Asignar valores
        terr2.setAncho(7);
        terr2.setLargo(15);
        terr2.setValorMetroCuadrado(350);
        
        // Calcular
        terr2.calcularArea();
        terr2.calcularCostoTerreno();
        
        // Imprimir
        System.out.println("El terreno que tiene "+terr2.getAncho()+" metros de ancho, "
                +terr2.getLargo()+" metros de largo, y un valor por metro\ncuadrado de "
                +terr2.getValorMetroCuadrado()+", tiene un área de "+terr2.getArea()
                +" metros cuadrados, y un costo total de $"+terr2.getCostoTerreno()+".");
        System.out.println("");
        
    }
    
}
