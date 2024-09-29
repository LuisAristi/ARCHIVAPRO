import java.util.Scanner;

public class IngresarUsuario {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean ingresar() {
        System.out.println("\nINICIAR SESIÓN");
        
        System.out.print("Nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Contraseña: ");
        String contrasena = scanner.nextLine();

        // Aquí se debería validar con la base de datos o archivo de usuarios
        if (validarUsuario(nombreUsuario, contrasena)) {
            System.out.println("Inicio de sesión exitoso.");
            return true;
        } else {
            System.out.println("Nombre de usuario o contraseña incorrectos.");
            return false;
        }
    }

    private static boolean validarUsuario(String nombreUsuario, String contrasena) {
        // Lógica para validar credenciales (base de datos o archivo)
        return true;  // Se asume que se valida correctamente
    }
}
