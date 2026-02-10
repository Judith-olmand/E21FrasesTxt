- BC3- COLECCIONES, FICHEROS Y ENTRADA/SALIDA
- LECTURA Y ESCRITURA DE FICHEROS

Lector de Frases desde Fichero

Programa en Java diseñado para la lectura y visualización en consola de cadenas de texto almacenadas en un archivo externo.

🚀 Funcionalidades
- Lectura de Archivos Externos: Accede al contenido del archivo frases.txt de forma directa.
- Procesamiento de Texto: Lee y procesa el documento línea por línea hasta alcanzar el final del archivo.
- Salida por Consola: Vuelca el contenido recuperado en la terminal respetando la estructura original del texto.
- Robustez: Incluye una gestión de excepciones para informar al usuario en caso de que el archivo no exista o sea inaccesible.

🛠️ Estructura técnica
- El programa utiliza las clases estándar de Java para la gestión de flujos de entrada:
- FileReader: Abre el flujo de conexión con el archivo físico en disco.
- BufferedReader: Proporciona un búfer para realizar una lectura eficiente de caracteres y líneas completas mediante el método readLine().
- try-with-resources: Asegura que el archivo se cierre automáticamente una vez terminada la lectura, optimizando el uso de recursos del sistema.
