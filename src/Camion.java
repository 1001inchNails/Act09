public class Camion extends Vehiculo{
    public int getLuzSenhalizacion() {
        return luzSenhalizacion;
    }

    public void setLuzSenhalizacion(int luzSenhalizacion) {
        this.luzSenhalizacion = luzSenhalizacion;
    }

    public boolean isRemolque() {
        return remolque;
    }

    public void setRemolque(boolean remolque) {
        this.remolque = remolque;
    }

    public boolean isParachoques() {
        return parachoques;
    }

    public void setParachoques(boolean parachoques) {
        this.parachoques = parachoques;
    }

    public boolean isChimeneaEscape() {
        return chimeneaEscape;
    }

    public void setChimeneaEscape(boolean chimeneaEscape) {
        this.chimeneaEscape = chimeneaEscape;
    }

    public boolean isParavientos() {
        return paravientos;
    }

    public void setParavientos(boolean paravientos) {
        this.paravientos = paravientos;
    }

    @Override
    public String toString() {
        return super.toString() +" /// "+"Necesita: "+
                "luzSenhalizacion=" + luzSenhalizacion +
                ", remolque=" + remolque +
                ", parachoques=" + parachoques +
                ", chimeneaEscape=" + chimeneaEscape +
                ", paravientos=" + paravientos
                ;
    }

    private int luzSenhalizacion;
    private boolean remolque;
    private boolean parachoques;
    private boolean chimeneaEscape;
    private boolean paravientos;

    public Camion(String matric, String color, String marca,int luzSenhalizacion, boolean remolque, boolean parachoques, boolean chimeneaEscape, boolean paravientos){
        super(matric, color, marca);
        this.luzSenhalizacion= luzSenhalizacion;
        this.remolque= remolque;
        this.parachoques= parachoques;
        this.chimeneaEscape= chimeneaEscape;
        this.paravientos= paravientos;
    }
}
