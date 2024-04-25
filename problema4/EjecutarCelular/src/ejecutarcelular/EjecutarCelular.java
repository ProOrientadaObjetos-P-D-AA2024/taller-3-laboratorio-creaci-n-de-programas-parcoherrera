package ejecutarcelular;

import celular.Celular;

public class EjecutarCelular {

    public static void main(String[] args) {
        
        // OBJETO 1
        Celular cel = new Celular();
        
        // Asignar valores
        cel.setSistemaOperativo("Android");
        cel.setPantalla(6);
        cel.setCostoIni(200);
        cel.setIvaPorcentaje(15);
        cel.setMac("00:1B:44:11:3A:B7");
        cel.setImei("485764793857234");
        
        // Calcular
        cel.calcularIva();
        cel.calcularCostoFin();
        
        // Imprimir
        System.out.println("El Equipo Celular con sistema operativo "+cel.getSistemaOperativo()
                +", tamaño de pantalla " +cel.getPantalla()+", direccion MAC "+cel.getMac()
                +",\ninformación IMEI "+cel.getImei()+", tiene un costo inical de $"
                +cel.getCostoIni()+", con el IVA del "+cel.getIvaPorcentaje()+"%, que equivale a "
                +cel.getIva()+"$,\ntiene un costo final de $" +cel.getCostoFin()+".");
        System.out.println("");
        
        // OBJETO 2
        Celular cel2 = new Celular();
        
        // Asignar valores
        cel2.setSistemaOperativo("iOS");
        cel2.setPantalla(6.3);
        cel2.setCostoIni(499);
        cel2.setIvaPorcentaje(15);
        cel2.setMac("03:5B:64:71:3C:D7");
        cel2.setImei("095827599033094");
        
        // Calcular
        cel2.calcularIva();
        cel2.calcularCostoFin();
        
        // Imprimir
        System.out.println("El Equipo Celular con sistema operativo "+cel2.getSistemaOperativo()
                +", tamaño de pantalla " +cel2.getPantalla()+", direccion MAC "+cel2.getMac()
                +",\ninformación IMEI "+cel2.getImei()+", tiene un costo inical de $"
                +cel2.getCostoIni()+", con el IVA del "+cel2.getIvaPorcentaje()+"%, que equivale a "
                +cel2.getIva()+"$,\ntiene un costo final de $" +cel2.getCostoFin()+".");
    }
    
}
