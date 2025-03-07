package controladores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Clase principal que contiene toda la logica.
 * 070325
 * @author CSL
 */

public class Inicio {

	/**
	 * Metodo principal de la aplicación que contiene todas las operaciones matematicas junto
	 * al fichero.
	 * 070325 - CSL
	 * @param args
	 */
	
	public static void main(String[] args) {
		
        Path path = Paths.get("ejemplo.txt");
       
        String contenido = "¡Hola, mundo! Esto es un ejemplo en Java 21.\n";

        try {
            Files.write(path, contenido.getBytes());

            System.out.println("El contenido se ha escrito en el archivo exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
		boolean esCerrado = false;
		Scanner scanner = new Scanner(System.in);
		byte opcionUsuario;
		float operandoUno, operandoDos, resultado;

		do {

			System.out.println("------ MENÚ ------");
			System.out.println("0. Cerrar menú.");
			System.out.println("1. Suma.");
			System.out.println("2. Resta.");
			System.out.println("3. División.");
			System.out.println("4. Producto.");
			System.out.println("5. Módulo.");
			System.out.println("6. Ver fichero.");
			System.out.println("------------------");
			System.out.println("Escriba la opción deseada: ");
			opcionUsuario = scanner.nextByte();

			switch (opcionUsuario) {
			case 0: {
				System.out.println("Se ha seleccionado la opción 0.");
				esCerrado = true;
				break;
			}
			case 1: {
				System.out.println("Operación suma.");
				System.out.println("Indique el primer operando: ");
				operandoUno = scanner.nextFloat();
				System.out.println("Indique el segundo operando: ");
				operandoDos = scanner.nextFloat();
				resultado = operandoUno + operandoDos;
				System.out.println("El resultado de la operación es: " + resultado);
				try {
			        String textoAGuardar = "Resultado de la suma: " + resultado + "\n";
			        Files.write(path, textoAGuardar.getBytes(), StandardOpenOption.APPEND);
			    } catch (IOException e) {
			    	String errorAGuardar = "Error en la operación suma: " + e.getMessage() + "\n";
			        try {
			            Files.write(path, errorAGuardar.getBytes(), StandardOpenOption.APPEND);
			        } catch (IOException ioException) {
			            System.err.println("Error al escribir en el archivo de errores: " + ioException.getMessage());
			        }
			    }
				break;
			}
			case 2: {
				System.out.println("Operación resta.");
				System.out.println("Indique el primer operando: ");
				operandoUno = scanner.nextFloat();
				System.out.println("Indique el segundo operando: ");
				operandoDos = scanner.nextFloat();
				resultado = operandoUno - operandoDos;
				System.out.println("El resultado de la operación es: " + resultado);
				try {
			        String textoAGuardar = "Resultado de la resta: " + resultado + "\n";
			        Files.write(path, textoAGuardar.getBytes(), StandardOpenOption.APPEND);
			    } catch (IOException e) {
			    	String errorAGuardar = "Error en la operación resta: " + e.getMessage() + "\n";
			        try {
			            Files.write(path, errorAGuardar.getBytes(), StandardOpenOption.APPEND);
			        } catch (IOException ioException) {
			            System.err.println("Error al escribir en el archivo de errores: " + ioException.getMessage());
			        }
			    }
				break;
			}
			case 3: {
				System.out.println("Operación división.");
				System.out.println("Indique el primer operando: ");
				operandoUno = scanner.nextFloat();
				System.out.println("Indique el segundo operando: ");
				operandoDos = scanner.nextFloat();
				resultado = operandoUno / operandoDos;
				System.out.println("El resultado de la operación es: " + resultado);
				try {
			        String textoAGuardar = "Resultado de la división: " + resultado + "\n";
			        Files.write(path, textoAGuardar.getBytes(), StandardOpenOption.APPEND);
			    } catch (IOException e) {
			    	String errorAGuardar = "Error en la operación división: " + e.getMessage() + "\n";
			        try {
			            Files.write(path, errorAGuardar.getBytes(), StandardOpenOption.APPEND);
			        } catch (IOException ioException) {
			            System.err.println("Error al escribir en el archivo de errores: " + ioException.getMessage());
			        }
			    }
				break;
			}
			case 4: {
				System.out.println("Operación producto.");
				System.out.println("Indique el primer operando: ");
				operandoUno = scanner.nextFloat();
				System.out.println("Indique el segundo operando: ");
				operandoDos = scanner.nextFloat();
				resultado = operandoUno * operandoDos;
				System.out.println("El resultado de la operación es: " + resultado);
				try {
			        String textoAGuardar = "Resultado del producto: " + resultado + "\n";
			        Files.write(path, textoAGuardar.getBytes(), StandardOpenOption.APPEND);
			    } catch (IOException e) {
			    	String errorAGuardar = "Error en la operación producto: " + e.getMessage() + "\n";
			        try {
			            Files.write(path, errorAGuardar.getBytes(), StandardOpenOption.APPEND);
			        } catch (IOException ioException) {
			            System.err.println("Error al escribir en el archivo de errores: " + ioException.getMessage());
			        }
			    }
				break;
			}
			case 5: {
				System.out.println("Operación módulo.");
				System.out.println("Indique el primer operando: ");
				operandoUno = scanner.nextFloat();
				System.out.println("Indique el segundo operando: ");
				operandoDos = scanner.nextFloat();
				resultado = operandoUno % operandoDos;
				System.out.println("El resultado de la operación es: " + resultado);
				try {
			        String textoAGuardar = "Resultado de la operacion módulo: " + resultado + "\n";
			        Files.write(path, textoAGuardar.getBytes(), StandardOpenOption.APPEND);
			    } catch (IOException e) {
			    	String errorAGuardar = "Error en la operación módulo: " + e.getMessage() + "\n";
			        try {
			            Files.write(path, errorAGuardar.getBytes(), StandardOpenOption.APPEND);
			        } catch (IOException ioException) {
			            System.err.println("Error al escribir en el archivo de errores: " + ioException.getMessage());
			        }
			    }
				break;
			}			
			case 6: {
			    System.out.println("Mostrando el contenido del fichero:");
			    try {
			        String contenidoFichero = Files.readString(path);
			        System.out.println(contenidoFichero);
			    } catch (IOException e) {
			        System.err.println("Error al leer el archivo: " + e.getMessage());
			    }
			    break;
			}
			default:
				System.out.println("La opción seleccionada no existe.");
				break;
			}

		} while (!esCerrado);

		scanner.close();

	}
}
