import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        menu menu = new menu();
        seleccion seleccion = new seleccion();
        Scanner sc = new Scanner(System.in);
        while (true) {
            LinkedList productosActuales=seleccion.listar();
            menu.imprimirMenu();
            int opcion = Integer.parseInt(sc.nextLine());
            menu.seleccion(opcion);
        }
    }
}