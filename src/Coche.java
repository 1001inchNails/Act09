public class Coche extends Vehiculo {
    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isCentralita() {
        return centralita;
    }

    public void setCentralita(boolean centralita) {
        this.centralita = centralita;
    }

    public int getSensores() {
        return sensores;
    }

    public void setSensores(int sensores) {
        this.sensores = sensores;
    }

    public int getFaroAntiniebla() {
        return faroAntiniebla;
    }

    public void setFaroAntiniebla(int faroAntiniebla) {
        this.faroAntiniebla = faroAntiniebla;
    }

    public int getClimatizadorAsiento() {
        return climatizadorAsiento;
    }

    public void setClimatizadorAsiento(int climatizadorAsiento) {
        this.climatizadorAsiento = climatizadorAsiento;
    }

    @Override
    public String toString() {
        return super.toString() +" /// "+"Necesita: "+
                "gps=" + gps +
                ", centralita=" + centralita +
                ", sensores=" + sensores +
                ", faroAntiniebla=" + faroAntiniebla +
                ", climatizadorAsiento=" + climatizadorAsiento
                ;
    }

    private boolean gps;
    private boolean centralita;
    private int sensores;
    private int faroAntiniebla;
    private int climatizadorAsiento;

    public Coche(String matric, String color, String marca,boolean gps, boolean centralita, int sensores, int faroAntiniebla, int climatizadorAsiento){
        super(matric, color, marca);
        this.gps= gps;
        this.centralita= centralita;
        this.sensores= sensores;
        this.faroAntiniebla= faroAntiniebla;
        this.climatizadorAsiento= climatizadorAsiento;
    }
}
