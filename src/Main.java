import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        menu menu = new menu();
        seleccion seleccion = new seleccion();
        int nums = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            seleccion.listar();
            menu.imprimirMenu();
            int opcion = Integer.parseInt(sc.nextLine());
            if(opcion == 2){
                nums++;
            }
            menu.seleccion(opcion, nums);
        }
    }
}