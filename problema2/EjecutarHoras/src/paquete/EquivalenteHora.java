package paquete;

public class EquivalenteHora {
    
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public void calcularMinutos() {
        minutos = horas * 60;
    }

    public double getSegundos() {
        return segundos;
    }

    public void calcularSegundos() {
        segundos = horas * 3600;
    }

    public double getDias() {
        return dias;
    }

    public void calcularDias() {
        dias = horas / 24;
    }
    
}
