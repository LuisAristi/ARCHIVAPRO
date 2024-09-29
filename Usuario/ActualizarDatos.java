import java.util.Scanner;

public class ActualizarDatos {
    private static Scanner scanner = new Scanner(System.in);

    public static void actualizar() {
        System.out.println("\nACTUALIZAR DATOS");
        System.out.print("Nuevo correo electrónico: ");
        String nuevoCorreo = scanner.nextLine();

        System.out.print("Nuevo número de celular: ");
        String nuevoCelular = scanner.nextLine();

        // Lógica para actualizar los datos del usuario en la base de datos o archivo
        System.out.println("Datos actualizados exitosamente.");
    }
}//esta huevada me dio paja extenderla, entonces XD

