import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Modelo {
    private static Modelo instance;
    private ArrayList<Coche> listaCoches = new ArrayList();
    private ArrayList<Moto> listaMotos = new ArrayList();
    private ArrayList<Camion> listaCamions = new ArrayList();
    private ArrayList<Grua> listaGruas = new ArrayList();
    private ArrayList<Tractor> listaTractores = new ArrayList();

    public static Modelo getInstance() {    //instanciación única
        if (instance == null) {
            instance = new Modelo();
        }
        return instance;
    }
/*
Metodos para reparacion/sustitucion mediante polimorfismo
 */
    public void reparar(String matricula, String color, String fabricante, boolean manillar, int pedales, boolean cadena, boolean pata, boolean guardafangos){
        this.listaMotos.add(new Moto(matricula,color,fabricante,manillar,pedales,cadena,pata,guardafangos));
    }
    public void reparar(String matricula, String color, String fabricante, boolean barraDeTiro, boolean brazoHidraulico, boolean diferencial, boolean sistemaDeLevante, int tomaDeFuerza){
        this.listaTractores.add(new Tractor(matricula,color,fabricante,barraDeTiro,brazoHidraulico,diferencial,sistemaDeLevante,tomaDeFuerza));
    }
    public void reparar(String matricula, String color, String fabricante, boolean gps, boolean centralita, int sensores, int faroAntiniebla, int climatizadorAsiento){
        this.listaCoches.add(new Coche(matricula,color,fabricante,gps,centralita,sensores,faroAntiniebla,climatizadorAsiento));
    }
    public void reparar(String matricula, String color, String fabricante, boolean gancho, boolean plataforma, boolean motorArrastre, boolean eje, boolean polea){
        this.listaGruas.add(new Grua(matricula,color,fabricante,gancho,plataforma,motorArrastre,eje,polea));
    }
    public void reparar(String matricula, String color, String fabricante, int luzSenhalizacion, boolean remolque, boolean parachoques, boolean chimeneaEscape, boolean paravientos){
        this.listaCamions.add(new Camion(matricula,color,fabricante,luzSenhalizacion,remolque,parachoques,chimeneaEscape,paravientos));
    }
    /*
    Metodo para introducir datos
     */
    public void introducirVehiculo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca numero de matricula: ");
        String matri = scanner.nextLine();
        System.out.print("Introduzca color: ");
        String color = scanner.nextLine();
        System.out.print("Introduzca marca de fabricante: ");
        String fabri = scanner.nextLine();
        System.out.print("Seleccione tipo de vehiculo: \n1. Coche\n2. Moto\n3. Camion\n4. Grua\n5. Tractor\n>");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // nextInt da problemas si se hace un nextLine despues
                            //por eso se pone ese scanner vacio despues

        switch(opcion){ //un case para cada tipo de vehiculo
            case 1:
                boolean gps;
                boolean centra;
                int sens;
                int niebla;
                int clima;

                System.out.print("¿Necesita nuevo GPS? (y/n): ");
                String opc11 = scanner.nextLine();
                if(Objects.equals(opc11, "y"))
                {gps=true;}else{gps=false;}

                System.out.print("¿Necesita nueva centralita? (y/n): ");
                String opc12 = scanner.nextLine();
                if(Objects.equals(opc12, "y"))
                {centra=true;} else{centra=false;}

                System.out.print("¿Cuantos sensores necesita?: ");
                int opc13 = scanner.nextInt();
                scanner.nextLine();
                sens=opc13;

                System.out.print("¿Cuantos faros antiniebla necesita?: ");
                int opc14 = scanner.nextInt();
                scanner.nextLine();
                niebla=opc14;

                System.out.print("¿Cuantos climatizadores de asiento necesita?: ");
                int opc15 = scanner.nextInt();
                scanner.nextLine();
                clima=opc15;

                reparar(matri,color,fabri,gps,centra,sens,niebla,clima);
                break;

            case 2:
                boolean manillar;
                int pedales;
                boolean cadena;
                boolean pata;
                boolean guardafangos;

                System.out.print("¿Necesita nuevo manillar? (y/n): ");
                String opc21 = scanner.nextLine();
                if(Objects.equals(opc21, "y"))
                {manillar=true;}else{manillar=false;}

                System.out.print("¿Cuantos pedales necesita?: ");
                int opc22 = scanner.nextInt();
                scanner.nextLine();
                pedales=opc22;

                System.out.print("¿Necesita nueva cadena? (y/n): ");
                String opc23 = scanner.nextLine();
                if(Objects.equals(opc23, "y"))
                {cadena=true;}else{cadena=false;}

                System.out.print("¿Necesita nueva pata? (y/n): ");
                String opc24 = scanner.nextLine();
                if(Objects.equals(opc24, "y"))
                {pata=true;}else{pata=false;}

                System.out.print("¿Necesita nuevo guardafangos? (y/n): ");
                String opc25 = scanner.nextLine();
                if(Objects.equals(opc25, "y"))
                {guardafangos=true;}else{guardafangos=false;}

                reparar(matri,color,fabri,manillar,pedales,cadena,pata,guardafangos);
                break;
            case 3:
                int luzSenhalizacion;
                boolean remolque;
                boolean parachoques;
                boolean chimeneaEscape;
                boolean paravientos;

                System.out.print("¿Cuantas luz de senhalizacion necesita?: ");
                int opc31 = scanner.nextInt();
                scanner.nextLine();
                luzSenhalizacion=opc31;

                System.out.print("¿Necesita nuevo remolque? (y/n): ");
                String opc32 = scanner.nextLine();
                if(Objects.equals(opc32, "y"))
                {remolque=true;}else{remolque=false;}

                System.out.print("¿Necesita nuevo parachoques? (y/n): ");
                String opc33 = scanner.nextLine();
                if(Objects.equals(opc33, "y"))
                {parachoques=true;}else{parachoques=false;}

                System.out.print("¿Necesita nueva chimenea de Escape? (y/n): ");
                String opc34 = scanner.nextLine();
                if(Objects.equals(opc34, "y"))
                {chimeneaEscape=true;}else{chimeneaEscape=false;}

                System.out.print("¿Necesita nuevo paravientos? (y/n): ");
                String opc35 = scanner.nextLine();
                if(Objects.equals(opc35, "y"))
                {paravientos=true;}else{paravientos=false;}

                reparar(matri,color,fabri,luzSenhalizacion,remolque,parachoques,chimeneaEscape,paravientos);
                break;
            case 4:
                boolean gancho;
                boolean plataforma;
                boolean motorArrastre;
                boolean eje;
                boolean polea;

                System.out.print("¿Necesita nuevo gancho? (y/n): ");
                String opc41 = scanner.nextLine();
                if(Objects.equals(opc41, "y"))
                {gancho=true;}else{gancho=false;}

                System.out.print("¿Necesita nueva plataforma? (y/n): ");
                String opc42 = scanner.nextLine();
                if(Objects.equals(opc42, "y"))
                {plataforma=true;}else{plataforma=false;}

                System.out.print("¿Necesita nuevo motor de arrastre? (y/n): ");
                String opc43 = scanner.nextLine();
                if(Objects.equals(opc43, "y"))
                {motorArrastre=true;}else{motorArrastre=false;}

                System.out.print("¿Necesita nuevo eje? (y/n): ");
                String opc44 = scanner.nextLine();
                if(Objects.equals(opc44, "y"))
                {eje=true;}else{eje=false;}

                System.out.print("¿Necesita nueva polea? (y/n): ");
                String opc45 = scanner.nextLine();
                if(Objects.equals(opc45, "y"))
                {polea=true;}else{polea=false;}

                reparar(matri,color,fabri,gancho,plataforma,motorArrastre,eje,polea);
                break;
            case 5:
                boolean barraDeTiro;
                boolean brazoHidraulico;
                boolean diferencial;
                boolean sistemaDeLevante;
                int tomaDeFuerza;

                System.out.print("¿Necesita nueva barra de tiro? (y/n): ");
                String opc51 = scanner.nextLine();
                if(Objects.equals(opc51, "y"))
                {barraDeTiro=true;}else{barraDeTiro=false;}

                System.out.print("¿Necesita nuevo brazo hidraulico? (y/n): ");
                String opc52 = scanner.nextLine();
                if(Objects.equals(opc52, "y"))
                {brazoHidraulico=true;}else{brazoHidraulico=false;}

                System.out.print("¿Necesita nuevo diferencial? (y/n): ");
                String opc53 = scanner.nextLine();
                if(Objects.equals(opc53, "y"))
                {diferencial=true;}else{diferencial=false;}

                System.out.print("¿Necesita nuevo sistema de levante? (y/n): ");
                String opc54 = scanner.nextLine();
                if(Objects.equals(opc54, "y"))
                {sistemaDeLevante=true;}else{sistemaDeLevante=false;}

                System.out.print("¿Cuantas toma de fuerza necesita?: ");
                int opc55 = scanner.nextInt();
                scanner.nextLine();
                tomaDeFuerza=opc55;

                reparar(matri,color,fabri,barraDeTiro,brazoHidraulico,diferencial,sistemaDeLevante,tomaDeFuerza);
                break;
        }


    }
    //Metodo para ver todas las listas
    public void verTodo(){
        System.out.println("Coches:\n");
        for(Coche coche: this.listaCoches){
            System.out.println(coche);
        }
        System.out.println("\n");

        System.out.println("Motos:\n");
        for(Moto moto: this.listaMotos){
            System.out.println(moto);
        }
        System.out.println("\n");

        System.out.println("Camiones:\n");
        for(Camion camion: this.listaCamions){
            System.out.println(camion);
        }
        System.out.println("\n");

        System.out.println("Gruas:\n");
        for(Grua grua: this.listaGruas){
            System.out.println(grua);
        }
        System.out.println("\n");

        System.out.println("Tractores:\n");
        for(Tractor tractor: this.listaTractores){
            System.out.println(tractor);
        }
        System.out.println("\n");
    }
}
