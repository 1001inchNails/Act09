import java.util.Scanner;
public class Registro {

    //Organizacion del menu
    public void menu(){
        Modelo.getInstance();
        boolean flag=true;

        while(flag){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione opción\n1. Registrar vehiculo\n2. Ver registro completo\n3. Salir\n");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    Modelo.getInstance().introducirVehiculo();
                    break;
                case 2:
                    Modelo.getInstance().verTodo();
                    break;
                case 3:
                    flag = false;
            }
        }
    }

}
