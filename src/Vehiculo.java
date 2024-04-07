public class Vehiculo {

    @Override
    public String toString() {
        return  "Matricula='" + Matricula + '\'' +
                ", Color='" + Color + '\'' +
                ", Marca='" + Marca + '\''
                ;
    }

    private String Matricula;
    private String Color;
    private String Marca;

    public Vehiculo(String matric, String color, String marca){
        this.Matricula=matric;
        this.Color=color;
        this.Marca=marca;
    }
}
