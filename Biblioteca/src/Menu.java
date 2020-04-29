import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        ArrayList<Client> ClientsL = new ArrayList<Client>();
        ArrayList<Books> BooksL = new ArrayList<Books>();

        int option = 0;

        Scanner sc = new Scanner(System.in);

        while (option != 6) {
            System.out.println("Opciones:");
            System.out.println("1.Información de Clientes \n2.Libros \n3.Libros  \n4.Productos Vendidos \n5.Ordenar comida");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    Client.Main(ClientsL);
                    break;
                case 2:
                    //Empleados();
                    break;
                case 3:
                    //Clients.main();
                    break;
                case 4:
                    // Psold.ViewFD();
                    break;
                case 5:
                    //OrdersF.OrdersF2();
                    break;
                case 6:
                    //rdersD.OrdersD2();
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }
    }

    public static void EnterContinue() {
        System.out.println("Selecionar \"Enter\" para continuar");
        try {
            System.in.read();
        } catch (IOException e) { }
    }
}
