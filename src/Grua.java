public class Grua extends Vehiculo {
    public boolean isGancho() {
        return gancho;
    }

    public void setGancho(boolean gancho) {
        this.gancho = gancho;
    }

    public boolean isPlataforma() {
        return plataforma;
    }

    public void setPlataforma(boolean plataforma) {
        this.plataforma = plataforma;
    }

    public boolean isMotorArrastre() {
        return motorArrastre;
    }

    public void setMotorArrastre(boolean motorArrastre) {
        this.motorArrastre = motorArrastre;
    }

    public boolean isEje() {
        return eje;
    }

    public void setEje(boolean eje) {
        this.eje = eje;
    }

    public boolean isPolea() {
        return polea;
    }

    public void setPolea(boolean polea) {
        this.polea = polea;
    }

    @Override
    public String toString() {
        return super.toString() +" /// "+"Necesita: "+
                "gancho=" + gancho +
                ", plataforma=" + plataforma +
                ", motorArrastre=" + motorArrastre +
                ", eje=" + eje +
                ", polea=" + polea
                ;
    }

    private boolean gancho;
    private boolean plataforma;
    private boolean motorArrastre;
    private boolean eje;
    private boolean polea;

    public Grua(String matric, String color, String marca,boolean gancho, boolean plataforma, boolean motorArrastre, boolean eje, boolean polea){
        super(matric, color, marca);
        this.gancho= gancho;
        this.plataforma= plataforma;
        this.motorArrastre= motorArrastre;
        this.eje= eje;
        this.polea= polea;
    }
}
