public class Tractor extends Vehiculo {
    public boolean isBarraDeTiro() {
        return barraDeTiro;
    }

    public void setBarraDeTiro(boolean barraDeTiro) {
        this.barraDeTiro = barraDeTiro;
    }

    public boolean isBrazoHidraulico() {
        return brazoHidraulico;
    }

    public void setBrazoHidraulico(boolean brazoHidraulico) {
        this.brazoHidraulico = brazoHidraulico;
    }

    public boolean isDiferencial() {
        return diferencial;
    }

    public void setDiferencial(boolean diferencial) {
        this.diferencial = diferencial;
    }

    public boolean isSistemaDeLevante() {
        return sistemaDeLevante;
    }

    public void setSistemaDeLevante(boolean sistemaDeLevante) {
        this.sistemaDeLevante = sistemaDeLevante;
    }

    public int getTomaDeFuerza() {
        return tomaDeFuerza;
    }

    public void setTomaDeFuerza(int tomaDeFuerza) {
        this.tomaDeFuerza = tomaDeFuerza;
    }

    @Override
    public String toString() {
        return super.toString() +" /// "+"Necesita: "+
                "barraDeTiro=" + barraDeTiro +
                ", brazoHidraulico=" + brazoHidraulico +
                ", diferencial=" + diferencial +
                ", sistemaDeLevante=" + sistemaDeLevante +
                ", tomaDeFuerza=" + tomaDeFuerza
                ;
    }

    private boolean barraDeTiro;
    private boolean brazoHidraulico;
    private boolean diferencial;
    private boolean sistemaDeLevante;
    private int tomaDeFuerza;

    public Tractor(String matric, String color, String marca,boolean barraDeTiro, boolean brazoHidraulico, boolean diferencial, boolean sistemaDeLevante, int tomaDeFuerza){
        super(matric, color, marca);
        this.barraDeTiro= barraDeTiro;
        this.brazoHidraulico= brazoHidraulico;
        this.diferencial= diferencial;
        this.sistemaDeLevante= sistemaDeLevante;
        this.tomaDeFuerza= tomaDeFuerza;
    }
}
