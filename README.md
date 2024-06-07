# CAJERO AUTOMATICO

Un cajero automático es un dispositivo electrónico que nos permite  realizar diversas transacciones bancarias, como retirar efectivo, depositar dinero o consultar saldo, pago de servicios, cambio de pin, ver el extracto y otros sin la necesidad de interactuar con el personal del banco. Están disponibles las 24 horas del día, los 7 días de la semana, en ubicaciones como sucursales bancarias, centros comerciales, aeropuertos universidades y colegios.


El proyecto "CAJERO AUTOMATICO" contiene paquetes como:
          1.- Logica
		  2.- Interfaces
		  3.-Imagenes
## PAQUETE LOGICA

En el paquete de logica se tiene 4 clases:
## 1. CLASE IDIOMA

Tenemos una clase llamada "Idiomas".
Cuenta con dos metodos para trabajar con archivos: "leer fila" y "guardar en archivos".

***- Metodo leer fila***
este metodo lee una linea especifica del archivo de texto deseado y devuelve una cadena de caracteres. contiene 2 parametros:
            1. numero de fila
			2. direccion
** *-Metodo guardar en archivo:* **
este metodo toma una cadena de texto  y lo escribe en el archivo que el usuario lo especifque.

 En este metodo se utiliza un objeto llamado "fileWriter y "BufferedWriter", esto para que el texto se escriba en el archivo que sea nombre.
 
 En la clase Idiomas se maneja excepciones para manejar cualquier error que pueda ocurrir durante la ejecucion en cuanto a leer y escribir archivos.
 
### 2. CLASE OPERACIONES

la  clase llamada Operaciones,  contiene métodos para realizar diversas operaciones con cuentas bancarias las cuales son:

***SaldoActual: * **Este método lee un archivo de texto en la ubicación especificada por ruta y devuelve el saldo actual de la cuenta. La ruta debe apuntar a un archivo que contenga el saldo en la primera posición de una línea, seguido por un delimitador ":". Si hay un error durante la lectura del archivo, se imprime el stack trace y se devuelve una cadena vacía.

***Moneda Cuenta: *** 
este método lee un archivo de texto en la ubicación especificada por ruta y devuelve el tipo de moneda asociado a la cuenta. Si hay un error durante la lectura del archivo, se imprime el stack trace y se devuelve una cadena vacía.

***ModificarSaldo:*** 
Este método modifica el saldo de una cuenta en un archivo de texto. Lee el archivo ubicado en rutaArchivo, reemplaza el saldo existente con un nuevo numero y luego sobrescribe el archivo con el nuevo contenido.

***Buscar archivo por numero de cuenta:*** 

Este método busca un archivo que contenga el número de cuenta que el usuario a especificado dentro de un directorio específico de cuentas. Despues recorre las subcarpetas dentro del directorio principal de cuentas, busca archivos de cuentas de ahorro y corriente numerados del 1 al 4, y verifica si alguno de esos archivos contiene el número de cuenta especificado.

**Convertir Moneda: **

Este método convierte un monto de una moneda a otra. Asumira que el tipo de moneda antiguo y el nuevo sean códigos de moneda válidos y que existen tipos de cambio definidos para ellas.

### 3.CLASE REGISTROS 
La clase llamada Registros,  c Esta clase contiene métodos para gestionar registros de operaciones.

***Método guardar Registro de Operaciones: ***

- Se tiene como parametros el monto de la operacion 
- Un identificador ID
- Un tipo de acción
- el número de cuenta 
###### *El metodo realiza las siguientes acciones *****

1. Guarda un registro de operación en un archivo de texto. 

2. Ademas convierte el "tipo accion" en una cadena llamando al método "obtener accion".
3. Obtiene la fecha y hora actual utilizando el método obtenerFechaHoraActual.

4. Construye una cadena de registro que contiene la fecha, la acción, el monto y el número de cuenta.

***Método obtener Accion:***  Este método convierte un entero en una cadena de acuerdo al tipo de accion a realizarse 
**Por ejemplo***
El valor 1 se convierte en "Depósito", 2 en "Retiro", y así sucesivamente.

***Método obtener/Fecha/Hora actual: *** 

Este método obtiene la fecha y hora actuales en el formato "dd/MM/yyyy HH:mm

***Excepciones:* ** 

Se maneja la excepción IOException en caso de que ocurra un problema al escribir en el archivo en a ruta especificada.

### 4. CLASE USUARIOS

la clase de "Usuarios" tiene los siguientes metodos:

**Método verificar Usuario: **Este método intenta verificar si un usuario con el PIN y la Cédula de Identidad proporcionados existe en el archivo de usuarios. El metodo lee cada línea del archivo, divide la línea en partes usando ":" como delimitador y verifica si el PIN y la CI coinciden con los proporcionados, ademas retorna "verdadero" si encuentra una coincidencia, de lo contrario, retorna "falso".

***Método guardar En Archivo:* **

Este método guarda el texto proporcionado en la ruta de un archivo especificado por el usuario para que realice esa funcion se apliza un FileWriter para escribir en el archivo.

***Método guardar En Archivo*:** 

Similar al método anterior, pero permite especificar la ruta del archivo como un parámetro.

***Método Devolver ID: *** 

devuelve el ID del usuario basado en el PIN y la CI proporcionados. Lee el archivo de usuarios, busca una coincidencia y retorna el ID del usuario si se encuentra.

***Método cambiarPin:*** 

Este método  cambia el PIN de un usuario específico. Lee el archivo de usuarios, busca al usuario por su ID, verifica si el PIN actual coincide, y si lo hace, actualiza el PIN con el nuevo PIN proporcionado. Finalmente, escribe los cambios en el archivo de la ruta especifica.

***Método llenar ComboBox Con Archivo:* **

Este método llena un JComboBox con los archivos .txt encontrados en las carpetas "Cuenta Ahorro" y "Cuenta Corriente" ubicadas en la ruta base proporcionada.

***Método guardarRutaEnArchivo:***

Similar al método guardarEnArchivo, pero guarda la ruta proporcionada en un archivo específico.

***Método ruta de la Cuenta*:** 

Lee la ruta de un archivo (ruta.txt) y devuelve su contenido.

***Método obtener Ruta:*** 

Toma una entrada en formato "carpeta: nombreArchivo" y devuelve la ruta completa del archivo.

***Método Id Transferencia:*** 

Extrae el número de cuenta de la ruta proporcionada.

**Método Control: **

Controla si un usuario con la CI proporcionada ya existe en el archivo. Retorna "false" si la CI ya está en uso, de lo contrario, retorna "true".

**Método obtener ultimo Id: **

Devuelve el último ID de usuario registrado en el archivo Usuarios.txt.

**Método anadir usuario: **

Añade un nuevo usuario al archivo Usuarios.txt con los datos proporcionados.

***Método Obtener Ultimo Id:*** 

Similar a obtenerUltimoId(), pero devuelve el último ID de usuario de manera diferente.

**Método Devolver Id: **

devuelve e ID de usuario basado en la CI proporcionada.

## PAQUETE INTERFACES
El paquete de interfaces cuenta con 23 clases para que el proyecto funcione de manera correcta las cuales son:

***1. Cambio de pin*: **

 este código representa una interfaz de usuario para cambiar el PIN de algún sistema o aplicación, con soporte para internacionalización y manejo de eventos de usuario.
 
***2. Cantidad de deposito***

el código representa una ventana de interfaz gráfica donde los usuarios pueden ingresar una cantidad de dinero para depositar, con opciones para aceptar, cancelar o corregir la entrada. También hay una opción para salir

***3. Cantidad de retiro***

este código representa una interfaz de usuario para ingresar una cantidad de dinero a retirar en una aplicación bancaria. L interfaz gráfica contiene lógica para manejar eventos y procesar datos relacionados con las operaciones bancarias.

***4. Cantidad de transferencia***

en esta clase se representa una interfaz grafica de usuario para que pueda ingresar una cantidad para su posterior transferencia. Ademas contiene logica y eventos para su mejor uso.

***5. Confirmar cambio de pin***

Para tener uncambio mas seguro esta clase nos da una opcion de volver a confirmar en cambio de pin que estamos realizando.

***6. Confirmar deposito***

Esta asociado a la clase "Deposito" la cual da la opcion al usuario al momento de hacer el deposito si este quiere hacer el deposito.

***7. Confirmar retiro***

Esta clase esta vinculada a la clase retiro, para que el usuario confirme la accion que esta realizando.

***8. Crear cuenta***

en esta clase nos da la opcion de crear una cuenta en caso de que el usuario desee creal una cuenta, se pide nombre, apellido y cedula de identidad, asimismo el sistema le proporcionara un pin para que pueda acceder.

***9. Crear cuenta principal***

se hace el uso de los metodos de "crear cuenta principal" y init componentes en las cuales se hace uso de los parametros: nombre, apellido y CI. asi mismo se aplica diferentes tipos de eventos para su mejor uso.

***10. Crear subcuenta***

para crear una subcuenta se hace el uso de los parametros: ruta, direccion y idioma.
Tambien se hace el llamado de las clases: registro, operaciones, usuarios y idioma.
***11. Deposito a terceros***

se hace el uso de clases publicas, parametros : 

              - NRO.
			  - IDIOMA
			   - DIRECCION
***12. Deposito* **

Se tiene metodos para realizar el deposito, asi mismo diferentes eventos y se hace el llamado a la clase idioma. a los metodos guardar archivo.


***13. Detalles de Extracto***

en esta clase se hace uso de metodos como detalles de extracto y cargar usuario. tambien se hace llamado de las clases idioma, usuario y operaciones.

***14. Detalles de Saldo***

la interfaz grafica de esta clase nos muestra los detalles actuales despues de realizar una transferencia.

***15. Detalles de transferencia***

En esta clase el usuario podra ver los detalles de la transferencia antes de realizar la accion.

***16. Extracto***

En el extracto se uso metodos y eventos para cuando se haga uso del mismo el usuario pueda comprender y ver todos los movimientos que desee saber.

***17. Inicio* **

en esta clase el usuario ya deberia seleccionar el idioma que quiera, seuidamente debe ingresar el pin.
El codigo tiene logica y eventos dinamicos para su mejor comprension.

***18.  Login***

en esta clase se hace el llamado de las clases idioma, usuario y pin para poder ingresar al sistema.

***19. Menu***

El menu cuneta con diferentes tipos de servicio, el usuario puede acceder haciendo clic en la pestaña deseada y ademas cuenta con una logica y eventos dinamicos para su mejor comprension.

***20. Servicios basicos***

en la clase servicios basicos tenemos diferentes opciones para realizar pagos.
Este codigo tiene logica y eventos.

***21. Sintarjeta***

En esta clase existe metodos para que el usuario pueda ingresar su PIN y Ci sin necesidad de tener tarjeta.

***22. Total deposito***

En la interfaz grafica se puede ver el total del deposito a realizarse.

***23. Transferencia***

en esta clase tendremos metodos capaces de cumplir con lo requerido para una tranferencia


## PAQUETE IMAGENES

En este paquete se puede ver diferentes imagenes para que la interfaz grafica sea mas dinamico.

#### IMAGENES DE REFERENCIA 

![C1](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/ff602415-9d70-488b-915b-cc2016bf79d8)


![C4](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/ddf5628b-b6c2-44cc-83a4-3d8edc399bdd)


![DEPOSITO CUENTA PROPIA](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/3d3a5f02-e02d-4349-bf3f-ab6a399f23d8)


![SERVICIOS](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/88d6912d-0af9-4fc6-b80b-39ef37a11185)


![RETIRO](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/0912cefa-e9ee-402d-b7d4-2058449ee3a7)



![C5](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/8f1d9381-d825-4ae3-b97f-20087e1e3086)



![C7](https://github.com/FaviolaAlegreCampos/cajero-Autom-tico/assets/164113839/9c28f5fe-0e0d-4218-be6a-064b06932e77)










