import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        //Los datos que debes pedir al usuario son:
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //1. Nombre
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        //2. Apellido
        System.out.println("Last name:");
        String lastName = scanner.nextLine();
        //3. Nombre de usuario
        System.out.println("Username:");
        String userName = scanner.nextLine();
        //4. Contraseña
        System.out.println("Password:");
        String password = scanner.nextLine();

        scanner.close();
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta

        System.out.println("Hola " + name + " " + lastName + ", tu nombre de usuario es " + userName + " y tu contraseña es " + password + ", gracias por registrarte.");

    }
}