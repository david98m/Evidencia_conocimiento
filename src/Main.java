//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio_total = 0, precio_alquiler_total = 0;
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su documento: ");
        String documento = sc.nextLine();
        System.out.println("TravelNow Empiece su viaje aqui");
        System.out.println("Seleccione 1- Para comprar un viaje\n2- Para reservar un hotel\n3- Para alquilar un vehiculo");
        String menu = sc.nextLine();
        switch (menu){
            case "1":
                System.out.print("Ingrese 1 si el destino es nacional o ingrese 2 si el destino es internacional: ");
                int destino = sc.nextInt();
                System.out.print("Ingrese el valor del vuelo: ");
                double precio_vuelo = sc.nextDouble();
                System.out.print("Ingrese 1 si la temprada es baja o ingrese 2 si la temporada es alta: ");
                int temporada = sc.nextInt();
                if (destino == 1 && temporada == 1 ){
                    precio_vuelo= precio_vuelo-(precio_vuelo*0.1);
                    System.out.print("Felicidades " + nombre + " accediste a un descuento por el 10 %, por lo tanto el precio final del vuelo quedará en: " + precio_vuelo);
                } else if (destino == 2 && temporada == 2) {
                    precio_vuelo = precio_vuelo+(precio_vuelo*0.2);
                    System.out.println("Hola " + nombre + " te informamos que los vuelos internacionales en temporada alta tienen un recargo del 20% por o tanto la tarifa del vuelo quedará en: " + precio_vuelo);
                } else if  ((destino != 1 && destino != 2) || (temporada != 1 && temporada != 2)) {
                    System.out.println("Alguno de los valores ingresados es inválido. Asegúrese de que:");
                    System.out.println("- Destino debe ser 1 (nacional) o 2 (internacional)");
                    System.out.println("- Temporada debe ser 1 (baja) o 2 (alta)");
                }
                break;
            case "2":
                System.out.println("Ingrese el valor de la habitación por noche: ");
                double precio_noche = sc.nextDouble();
                System.out.println("Seleccione el numero de noches: ");
                int noches = sc.nextInt();
                precio_total= precio_noche * noches;
                if (noches > 5 ){
                    precio_total = precio_total-(precio_total*0.25);
                    System.out.print("Felicidades" + nombre + " accediste a un descuento por el 25%, por lo tanto el precio final del hotel quedará en: " + precio_total);
                }else if (noches >= 2 && noches <= 5){
                    precio_total = precio_total-(precio_total*0.1);
                    System.out.print("Felicidades" + nombre + " accediste a un descuento por el 10%, por lo tanto el precio final del hotel quedará en: " + precio_total);
                }else {
                    System.out.print("Hola" + nombre + " el precio final del hotel quedará en: " + precio_total);
                }
                break;
            case "3":
                System.out.print("Ingrese su edad: ");
                int edad = sc.nextInt();
                System.out.print("Ingrese la tarifa de alquiler diaria del vehiculo: ");
                double precio_diario = sc.nextDouble();
                System.out.print("Ingrese la cantidad de dias de alquiler: ");
                double dias_alquiler = sc.nextDouble();
                precio_alquiler_total = precio_diario * dias_alquiler;
                if (edad < 25){
                    System.out.print("Ya que eres menor de 25 años no puedes alquilar vehiculos");
                } else if (edad < 60 ) {
                    System.out.print("Hola " + nombre + " la tarifa de alquiler de vehiculo sera de:" + precio_alquiler_total);
                }else {
                    precio_alquiler_total = precio_alquiler_total-(precio_alquiler_total*0.15);
                    System.out.print("Felicidades" + nombre + " accediste a un descuento por el 15%, por lo tanto el precio final del alquiler del vehiculo quedará en: " + precio_alquiler_total);
                }
                break;
        }

    }
}