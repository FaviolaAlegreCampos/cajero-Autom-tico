/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

/**
 *
 * @author jhona
 */
public class Usuarios {
    public boolean verificarUsuario(String pin, String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[3].equals(pin) && partes[2].equals(ci)) {
                    
                    return true; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // No coincide o hubo un error
    }
     public void guardarEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Archivos gestor\\Usuarios\\informacion.txt"; 
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
      public void guardarEnArchivo(String texto,String ruta) {
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }   
    }
     
     
     public String DevolverId(String pin, String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[3].equals(pin) && partes[2].equals(ci)) {
                    
                    return partes[4]; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    } 
     
    public String IdCuenta() {
        String contenidoFila = "";
        String direccion = "C:\\Archivos gestor\\Archivos gestor\\Usuarios\\informacion.txt";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            contenidoFila = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    } 
    
    public void cambiarPin(String idUsuario, String pinActual, String nuevoPin, String confirmacionPin) {
        // Nombre del archivo
        String nombreArchivo = "C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt";

        // Crear un objeto File que represente el archivo
        File archivo = new File(nombreArchivo);
        // Crear una variable para guardar las líneas del archivo
        String linea;
        // Crear una variable para guardar las líneas actualizadas
        String lineaNueva = "";
        // Variable para verificar si se encontró al usuario
        boolean usuarioEncontrado = false;
        
        try {
            // Crear un lector de archivos
            FileReader lectorArchivo = new FileReader(archivo);
            BufferedReader lectorBuffer = new BufferedReader(lectorArchivo);
            
            // Recorrer el archivo línea por línea
            while ((linea = lectorBuffer.readLine()) != null) {
                // Dividir la línea en partes usando ":" como delimitador
                String[] partes = linea.split(":");
                // Si el idUsuario coincide, verificar el pinActual
                if (partes[4].equals(idUsuario)) {
                    if (partes[3].equals(pinActual)) {
                        usuarioEncontrado = true;
                        // Actualizar el pin solo si el pinActual coincide y la confirmación del nuevo pin es correcta
                        if (nuevoPin.equals(confirmacionPin)) {
                            partes[3] = nuevoPin; // El nuevo pin se coloca en la posición 3
                            System.out.println("PIN cambiado exitosamente para el usuario con ID: " + idUsuario);
                        } else {
                            System.out.println("La confirmación del nuevo PIN no coincide. No se realizó ningún cambio.");
                        }
                    } else {
                        System.out.println("El PIN actual proporcionado no coincide con el registrado para el usuario con ID: " + idUsuario);
                    }
                }
                // Reconstruir la línea
                lineaNueva += partes[0] + ":" + partes[1] + ":" + partes[2] + ":" + partes[3] + ":" + partes[4] + "\n";
            }
            
            // Cerrar el lector de archivos
            lectorBuffer.close();
            
            // Si no se encontró al usuario, mostrar un mensaje
            if (!usuarioEncontrado) {
                System.out.println("No se encontró ningún usuario con ID: " + idUsuario);
            } else {
                // Crear un escritor de archivos
                FileWriter escritorArchivo = new FileWriter(archivo);
                BufferedWriter escritorBuffer = new BufferedWriter(escritorArchivo);
                
                // Escribir las líneas actualizadas en el archivo
                escritorBuffer.write(lineaNueva);
                
                // Cerrar el escritor de archivos
                escritorBuffer.close();
            }
            
        } catch (IOException e) {
            // Manejar la excepción en caso de que ocurra un error de lectura/escritura
            System.err.println("Error al leer/escribir en el archivo: " + e.getMessage());
        }
    }
    public  void llenarComboBoxConArchivos(JComboBox<String> comboBox, String rutaBase) {
        // Crear un filtro para solo incluir archivos .txt
        FilenameFilter filtroTxt = new FilenameFilter() {
            public boolean accept(File dir, String nombre) {
                return nombre.toLowerCase().endsWith(".txt");
            }
        };

        // Definir las carpetas "Cuenta Ahorro" y "Cuenta Corriente"
        String[] carpetas = {"Cuenta Ahorro", "Cuenta Corriente"};

        // Recorrer cada carpeta
        for (String carpeta : carpetas) {
            File directorio = new File(rutaBase, carpeta);

            // Verificar que el directorio existe y es un directorio
            if (directorio.exists() && directorio.isDirectory()) {
                // Obtener la lista de archivos .txt en el directorio
                String[] archivosTxt = directorio.list(filtroTxt);

                // Añadir cada archivo al combo box sin la extensión .txt
                if (archivosTxt != null) {
                    for (String archivo : archivosTxt) {
                        // Remover la extensión .txt
                        String nombreSinExtension = archivo.substring(0, archivo.lastIndexOf("."));
                       comboBox.addItem(carpeta + ":  " + nombreSinExtension);
                        /* if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Dolares" );;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Bolivianos");;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Euros");;
                         if(nombreSinExtension.equals("cuenta1"))comboBox.addItem(carpeta + ":  Yuanes");;*/
                    }
                }
            } else {
            }
        }
    }
    
     public void guardarRutaEnArchivo(String texto) {
        String ruta = "C:\\Archivos gestor\\Archivos gestor\\Usuarios\\ruta.txt"; 
        try {
            FileWriter fw = new FileWriter(ruta, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
     
     public String rutaCuenta() {
        String contenidoFila = "";
        String direccion = "C:\\Archivos gestor\\Archivos gestor\\Usuarios\\ruta.txt";
        try {
            FileReader fr = new FileReader(direccion);
            BufferedReader br = new BufferedReader(fr);
            contenidoFila = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contenidoFila;
    } 
     
     public String obtenerRuta(String input) {
        String[] partes = input.split(":  ");
        String resultado = partes[0] + "\\" + partes[1] + ".txt";
        return resultado;
    }
   
    public String IdTransferenci(String ruta) {
        Pattern pattern = Pattern.compile("\\\\Cuentas\\\\(\\d+)\\\\");
        Matcher matcher = pattern.matcher(ruta);

        if (matcher.find()) {
            String numero = matcher.group(1);
            System.out.println("Número encontrado: " + numero);
            return numero;
        } 
        return "";
    }
     
    
    public boolean Control(String rutaArchivo, String ciBuscado,int campo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5 && campos[campo].equals(ciBuscado)) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    private int obtenerUltimoId() throws IOException {
        int ultimoId = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5) {
                    int idActual = Integer.parseInt(campos[4]);
                    if (idActual > ultimoId) {
                        ultimoId = idActual;
                    }
                }
            }
        }
        return ultimoId;
    }
    
    public void anadirUsuario(String nombre, String apellido, String ci, String contrasena) {
        try {
            int ultimoId = obtenerUltimoId()+1;
            String nuevoUsuario = nombre + ":" + apellido + ":" + ci + ":" + contrasena + ":" + ultimoId;
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt", true))) {
                bw.write(nuevoUsuario);
                bw.newLine();
            }
        } catch (IOException e) {
        }
    }
    
    public int ObtenerUltimoId() {
        String rutaArchivo = "C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt";
        int ultimoId = -1;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(":");
                if (campos.length == 5) {
                    try {
                        int idActual = Integer.parseInt(campos[4]);
                        if (idActual > ultimoId) {
                            ultimoId = idActual;
                        }
                    } catch (NumberFormatException e) {
                    }
                }
            }
        } catch (IOException e) {
        }
        return ultimoId;
    }
    
        public String DevolverId(String ci) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Archivos gestor\\Archivos gestor\\Usuarios.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // Dividir la línea en partes usando el delimitador ":"
                String[] partes = linea.split(":");
                
                // Verificar si el PIN coincide con el almacenado en el archivo
                if (partes.length >= 5 && partes[2].equals(ci)) {
                    
                    return partes[4]; // Coincide
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ""; // No coincide o hubo un error
    }
     
    
}
