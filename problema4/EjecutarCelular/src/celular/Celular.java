package celular;

public class Celular {
    
    private String sistemaOperativo;
    private String mac; //direccion MAC
    private String imei; //informacion IMEI
    private double pantalla; //tamaño de pantalla en pulgadas
    private double costoIni;
    private double ivaPorcentaje;
    private double iva;
    private double costoFin;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public double getPantalla() {
        return pantalla;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public double getCostoIni() {
        return costoIni;
    }

    public void setCostoIni(double costoIni) {
        this.costoIni = costoIni;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public double getIva() {
        return iva;
    }

    public void calcularIva() {
        iva = (ivaPorcentaje * costoIni) / 100;
    }

    public double getCostoFin() {
        return costoFin;
    }

    public void calcularCostoFin() {
        costoFin = costoIni + iva;
    }
    
    
    
    
}
