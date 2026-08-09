import java.util.Scanner;
public class ajedrez_de_consola {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] blancas = new String[10];
        String[] negras = new String[10];
        String[] fechas = new String[10];
        String[] niveles = new String[10];
        String[] resultados = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //---------------------------------------//
        //--|menu_principal_ajedrez_de_consola|--//
        //---------------------------------------//
        do {
            System.out.println("menu principal ajedrez de consola");
            System.out.println("1) Registrar partida");
            System.out.println("2) Editar partida");
            System.out.println("3) Listar partidas");
            System.out.println("4) Buscar partida");
            System.out.println("5) Eliminar partida");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_partida|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro de la partida");
                    System.out.println("id de la partida a registrar: " + id);
                    System.out.print("nombre del jugador de blancas: ");
                    blancas[total] = entrada.nextLine();
                    System.out.print("nombre del jugador de negras: ");
                    negras[total] = entrada.nextLine();
                    System.out.print("fecha de la partida: ");
                    fechas[total] = entrada.nextLine();
                    System.out.print("nivel de dificultad: ");
                    niveles[total] = entrada.nextLine();
                    System.out.print("resultado de la partida: ");
                    resultados[total] = entrada.nextLine();
                    System.out.print("estado de la partida: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Partida registrada correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_partida|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen partidas registradas.");
                        break;
                    }
                    System.out.println("Datos de las partidas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Blancas: " + blancas[i] + " | Negras: " + negras[i] + " | Fecha: " + fechas[i] + " | Nivel: " + niveles[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la partida: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato de la partida");
                        System.out.print("Nuevo jugador de blancas: ");
                        blancas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo jugador de negras: ");
                        negras[posicion] = entrada.nextLine();
                        System.out.print("Nueva fecha: ");
                        fechas[posicion] = entrada.nextLine();
                        System.out.print("Nuevo nivel de dificultad: ");
                        niveles[posicion] = entrada.nextLine();
                        System.out.print("Nuevo resultado: ");
                        resultados[posicion] = entrada.nextLine();
                        System.out.print("Nuevo estado: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Partida actualizada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_partidas|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen partidas registradas.");
                    } else {
                        System.out.println("Lista de partidas");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Blancas: " + blancas[i] + " | Negras: " + negras[i] + " | Fecha: " + fechas[i] + " | Nivel: " + niveles[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_partida|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen partidas registradas.");
                        break;
                    }
                    System.out.println("busqueda de partida");
                    System.out.print("ingresa la id para buscar partida: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos de la partida encontrada:");
                        System.out.println("ID: " + idBusqueda + " | Blancas: " + blancas[posicion] + " | Negras: " + negras[posicion] + " | Fecha: " + fechas[posicion] + " | Nivel: " + niveles[posicion] + " | Resultado: " + resultados[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_partida|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen partidas registradas.");
                        break;
                    }
                    System.out.println("Datos de las partidas");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Blancas: " + blancas[i] + " | Negras: " + negras[i] + " | Fecha: " + fechas[i] + " | Nivel: " + niveles[i] + " | Resultado: " + resultados[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID de la partida a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            blancas[i] = blancas[i + 1];
                            negras[i] = negras[i + 1];
                            fechas[i] = fechas[i + 1];
                            niveles[i] = niveles[i + 1];
                            resultados[i] = resultados[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Partida eliminada correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Ajedrez de Consola.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}