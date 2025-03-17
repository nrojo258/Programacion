package Reservas;

import java.util.Scanner;

public class mainReservas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de alojamientos: ");
        int cantidadAlojamientos = sc.nextInt();
        sc.nextLine(); 

        Alojamiento[] alojamientos = new Alojamiento[cantidadAlojamientos];

        for (int i = 0; i < cantidadAlojamientos; i++) {
            System.out.println("Introduce los datos del alojamiento " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Tipo (1: Habitación, 2: Apartamento, 3: Casa Rural): ");
            int tipo = sc.nextInt();
            sc.nextLine();

            switch (tipo) {
                case 1: 
                    System.out.print("Número de camas: ");
                    int numCamas = sc.nextInt();
                    sc.nextLine(); 
                    alojamientos[i] = new Habitacion(nombre, capacidad, numCamas);
                    break;
                case 2: 
                    System.out.print("Número de habitaciones: ");
                    int numHabitaciones = sc.nextInt();
                    System.out.print("¿Tiene cocina? (true/false): ");
                    boolean tieneCocina = sc.nextBoolean();
                    sc.nextLine(); 
                    alojamientos[i] = new Apartamento(nombre, capacidad, numHabitaciones, tieneCocina);
                    break;
                case 3: 
                    System.out.print("¿Tiene jardín? (true/false): ");
                    boolean tieneJardin = sc.nextBoolean();
                    System.out.print("¿Tiene piscina? (true/false): ");
                    boolean tienePiscina = sc.nextBoolean();
                    sc.nextLine(); 
                    alojamientos[i] = new CasaRural(nombre, capacidad, tieneJardin, tienePiscina);
                    break;
                default:
                    System.out.println("Tipo no válido. Se asignará una habitación por defecto.");
                    alojamientos[i] = new Habitacion(nombre, capacidad, 1);
                    break;
            }
        }

        String opcion = "";
        while (!opcion.equals("5")) { 
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar alojamientos disponibles");
            System.out.println("2. Reservar alojamiento");
            System.out.println("3. Liberar alojamiento");
            System.out.println("4. Búsqueda personalizada");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    for (Alojamiento a : alojamientos) {
                        if (a.isDisponible()) {
                            System.out.println(a.mostrarInformacion());
                            System.out.println("-------------------");
                        }
                    }
                    break;
                case "2":
                    System.out.print("Introduce el nombre del alojamiento a reservar: ");
                    String nomReserva = sc.nextLine();
                    boolean encontradoReserva = false;
                    for (Alojamiento a : alojamientos) {
                        if (a.getNombre().equalsIgnoreCase(nomReserva)) {
                            encontradoReserva = true;
                            if (a.reservar()) {
                                System.out.println("Reservado correctamente.");
                            } else {
                                System.out.println("Ya está reservado.");
                            }
                            break;
                        }
                    }
                    if (!encontradoReserva) {
                        System.out.println("Alojamiento no encontrado.");
                    }
                    break;
                case "3":
                    System.out.print("Introduce el nombre del alojamiento a liberar: ");
                    String nomLiberar = sc.nextLine();
                    boolean encontradoLiberar = false;
                    for (Alojamiento a : alojamientos) {
                        if (a.getNombre().equalsIgnoreCase(nomLiberar)) {
                            encontradoLiberar = true;
                            a.liberar();
                            System.out.println("Liberado correctamente.");
                            break;
                        }
                    }
                    if (!encontradoLiberar) {
                        System.out.println("Alojamiento no encontrado.");
                    }
                    break;
                case "4":
                    buscarAlojamientosPersonalizados(alojamientos, sc);
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }

    public static void buscarAlojamientosPersonalizados(Alojamiento[] alojamientos, Scanner sc) {
        System.out.print("Introduce el precio máximo que quieres por noche: ");
        double precioMaximo = sc.nextDouble();
        sc.nextLine(); 
        
        System.out.println("¿Buscas características específicas? (1: Cocina, 2: Jardín, 3: Piscina, 0: Ninguna)");
        int caracteristica = sc.nextInt();
        sc.nextLine(); 

        for (Alojamiento a : alojamientos) {
            if (a.isDisponible() && a.calcularPrecio() <= precioMaximo) {
                boolean cumpleCaracteristicas = true;

                switch (caracteristica) {
                    case 1: 
                        if (!(a instanceof Apartamento) || !((Apartamento) a).getTieneCocina()) {
                            cumpleCaracteristicas = false;
                        }
                        break;
                    case 2: 
                        if (!(a instanceof CasaRural) || !((CasaRural) a).getTieneJardin()) {
                            cumpleCaracteristicas = false;
                        }
                        break;
                    case 3: 
                        if (!(a instanceof CasaRural) || !((CasaRural) a).getTienePiscina()) {
                            cumpleCaracteristicas = false;
                        }
                        break;
                    case 0: 
                        cumpleCaracteristicas = true;
                        break;
                    default:
                        cumpleCaracteristicas = false; 
                }

                if (cumpleCaracteristicas) {
                    System.out.println(a.mostrarInformacion());
                    System.out.println("-------------------");
                }
            }
        }
    }
}