import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        //Los datos que debes pedir al usuario son:
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //1. Nombre
        Scanner scannerName = new Scanner(System.in);
        System.out.println("Name:");
        String name = scannerName.nextLine();
        //2. Apellido
        Scanner scannerLastName = new Scanner(System.in);
        System.out.println("Last name:");
        String lastName = scannerLastName.nextLine();
        //3. Nombre de usuario
        Scanner scannerUserName = new Scanner(System.in);
        System.out.println("Username:");
        String userName = scannerUserName.nextLine();
        //4. Contraseña
        Scanner scannerPassword = new Scanner(System.in);
        System.out.println("Password:");
        String password = scannerPassword.nextLine();

        scannerName.close();
        scannerLastName.close();
        scannerUserName.close();
        scannerPassword.close();
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        System.out.println("Hola " + name + " " + lastName + ", tu nombre de usuario es " + userName + " y tu contraseña es " + password + ", gracias por registrarte.");

    }
}