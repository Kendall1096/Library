import java.util.ArrayList;
import java.util.Scanner;

public class Client {

    ArrayList<Client> ClientsL = new ArrayList<Client>();
    private String Name;
    private String LastName;
    private String Birthday;
    private String Phone;

    public static void Main(ArrayList<Client> ClientsL) {

        int Option = 0;
        int indice = 0;
        Scanner input = new Scanner(System.in);

        while (Option != 5) {

            System.out.println("Opciones:");
            System.out.println("1. Mostrar lista de clientes");
            System.out.println("2. Ver detalles de un cliente");
            System.out.println("3. Agregar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Salir");

            Option = input.nextInt();

            switch (Option) {
                case 1:
                    ViewC(ClientsL);
                    break;
                case 2:
                    System.out.println("Ingrese el numero del cliente: ");
                    indice = input.nextInt();
                    Cinfo(ClientsL,indice);
                    break;
                case 3:
                    AddC(ClientsL);
                    break;
                case 4:
                    System.out.println("Ingrese el numero del cliente que desea eliminar: ");
                    indice = input.nextInt();
                    DeleteC(ClientsL,indice);
                    System.out.println("Volver");
                    break;
                case 5:
                    System.out.println("Volver");
                    break;
                default:
                    System.out.println("Error. Intente de nuevo");
            }
        }
    }

    private static void ViewC(ArrayList<Client> clientsL) {
    }


    public Client() {
        this.Name = Name;
        this.LastName = LastName;
        this.Birthday = Birthday;
        this.Phone = Phone;
    }

    public Client(String Name, String LastName, String Birthday, String Phone) {
        this.Name = Name;
        this.LastName = LastName;
        this.Birthday = Birthday;
        this.Phone = Phone;
    }


    public static void AddC(ArrayList<Client> ClientsL) {

        Scanner input = new Scanner(System.in);
        System.out.println("AGREGAR NUEVO CLIENTE");
        //Empleado nuevoEmpleado = new Cliente();
        System.out.println("Nombre: ");
        String Name = input.next();
        System.out.println("Apellido: ");
        String LastName = input.next();
        System.out.println("Nacimiento (MM/DD/AÑO): ");
        String Birthday = input.next();
        System.out.println("Telefono: ");
        String Phone = input.next();
        Client newClient = new Client(Name, LastName, Birthday, Phone);
        ClientsL.add(newClient);
        System.out.println("Cliente agregado exitosamente");
        Menu.EnterContinue();
    }

    public void ViewC(ArrayList<Client> ClientsL, int indice) {
         int i=0;
        for (Client Clients : ClientsL) {
            System.out.println(i + ". " + Clients.getName());
            i++; 
        }
        Menu.EnterContinue();
    }


    private static void DeleteC(ArrayList<Client> ClientsL, int indice) {

        ClientsL.remove(indice);
        System.out.println("Cliente eliminado exitosamente");
        Menu.EnterContinue();
    }

    public static void Cinfo(ArrayList<Client> ClientsL, int indice) {


        System.out.println("Clientes" + indice);

        Client Client = ClientsL.get(indice);
        System.out.println("Nombre:" + Client.getName());
        System.out.println("Apellido:" + Client.getLastName());
        System.out.println("Nacimiento (MM/DD/AÑO):" + Client.getBirthday());
        System.out.println("Telefono:" + Client.getPhone());
        Menu.EnterContinue();
    }


    public String getName() {
        return this.Name;
    }

    public String setName() {
        return (this.Name = Name);
    }

    public String getLastName() {
        return this.LastName;
    }

    public String setLastName() {
        return (this.LastName = LastName);
    }

    public String getBirthday() {
        return this.Birthday;
    }

    public String setBirthday() {
        return (this.Birthday = Birthday);
    }

    public String getPhone() {
        return this.Phone;
    }

    public String setPhone() {
        return (this.Phone = Phone);
    }

}
