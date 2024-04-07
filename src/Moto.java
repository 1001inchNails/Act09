public class Moto extends Vehiculo {
    public boolean isManillar() {
        return manillar;
    }

    public void setManillar(boolean manillar) {
        this.manillar = manillar;
    }

    public int getPedales() {
        return pedales;
    }

    public void setPedales(int pedales) {
        this.pedales = pedales;
    }

    public boolean isCadena() {
        return cadena;
    }

    public void setCadena(boolean cadena) {
        this.cadena = cadena;
    }

    public boolean isPata() {
        return pata;
    }

    public void setPata(boolean pata) {
        this.pata = pata;
    }

    public boolean isGuardafangos() {
        return guardafangos;
    }

    public void setGuardafangos(boolean guardafangos) {
        this.guardafangos = guardafangos;
    }

    @Override
    public String toString() {
        return super.toString() +" /// "+"Necesita: "+
                "manillar=" + manillar +
                ", pedales=" + pedales +
                ", cadena=" + cadena +
                ", pata=" + pata +
                ", guardafangos=" + guardafangos
                ;
    }

    private boolean manillar;
    private int pedales;
    private boolean cadena;
    private boolean pata;
    private boolean guardafangos;

    public Moto(String matric, String color, String marca,boolean manillar, int pedales, boolean cadena, boolean pata, boolean guardafangos){
        super(matric, color, marca);
        this.manillar= manillar;
        this.pedales= pedales;
        this.cadena= cadena;
        this.pata= pata;
        this.guardafangos= guardafangos;
    }
}
