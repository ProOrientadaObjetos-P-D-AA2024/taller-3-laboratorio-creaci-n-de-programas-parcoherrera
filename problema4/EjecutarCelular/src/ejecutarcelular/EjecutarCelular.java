package ejecutarcelular;

import paquete.Celular;

public class EjecutarCelular {

    public static void main(String[] args) {
        
        Celular cel = new Celular();
        
        String sistemaOperativo = "Android";
        double pantalla = 6; //tamaño de pantalla en pulgadas
        double costoIni = 200;
        double ivaPorcentaje = 15;
        String mac = "00:1B:44:11:3A:B7"; //direccion MAC
        String imei = "485764793857234"; //informacion IMEI
        
        
        cel.setSistemaOperativo(sistemaOperativo);
        cel.setPantalla(pantalla);
        cel.setCostoIni(costoIni);
        cel.setIvaPorcentaje(ivaPorcentaje);
        cel.setMac(mac);
        cel.setImei(imei);
        
        cel.calcularIva();
        cel.calcularCostoFin();
        
        System.out.println("El Equipo Celular con sistema operativo " +cel.getSistemaOperativo()
                +", tamaño de pantalla " +cel.getPantalla()+", direccion MAC "+cel.getMac()+",\ninformación IMEI "+cel.getImei()
                +", tiene un costo inical de $"+cel.getCostoIni()+", con el IVA del "+cel.ivaPorcentaje+"%, que equivale a "+cel.getIva()
                +"$\ntiene un costo final de $" +cel.getCostoFin()+".");
        
        
    }
    
}
