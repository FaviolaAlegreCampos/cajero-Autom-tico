/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jhona
 */
public class Registros {
    public void guardarRegistroOperaciones(String monto,String id, int tipoAccion, String cuenta) {
        // Obtener la acción correspondiente al número
        String accion = obtenerAccion(tipoAccion);

        // Obtener la fecha y hora actual
        String fechaHoraActual = obtenerFechaHoraActual();

        // Construir el registro a guardar en el archivo
        String registro = fechaHoraActual + ";" + accion + ";" + monto+";"+cuenta;

        // Ruta del archivo donde se guardarán los datos
        String rutaArchivo = "C:\\Archivos gestor\\Archivos gestor\\Cuentas\\"+id+"\\registroActividades.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaArchivo, true))) {
            // Escribir el registro en el archivo
            escritor.write(registro);
            escritor.newLine(); // Agregar un salto de línea
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String obtenerAccion(int tipoAccion) {
        // Definir las acciones correspondientes a cada tipo
        String accion;
        switch (tipoAccion) {
            case 1:
                accion = "Deposito";
                break;
            case 2:
                accion = "Retiro";
                break;
            case 3:
                accion = "Consulta de saldo";
                break;
            case 4:
                accion = "Transferencia";
                break;
            case 5:
                accion = "Cambio de Pin";
                break;
            default:
                accion = "Acción Desconocida";
                break;
        }
        return accion;
    }

    public String obtenerFechaHoraActual() {
        // Obtener la fecha y hora actual en el formato deseado
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaHoraActual = new Date();
        return formatter.format(fechaHoraActual);
    }
    
}
