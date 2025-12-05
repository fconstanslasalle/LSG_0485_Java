# 11 - Java Files

## Introducció

Aquesta carpeta conté exemples de codi per aprendre a treballar amb fitxers en Java. La gestió de fitxers és essencial per emmagatzemar i recuperar dades de forma persistent, permetent que els programes treballin amb informació que es manté entre execucions.

## Conceptes

### Gestió de Fitxers en Java
- Classes principals: `File`, `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`
- Rutes absolutes i relatives
- Lectura de fitxers de text
- Escriptura de fitxers de text
- Lectura de fitxers binaris
- Gestió d'excepcions en operacions amb fitxers

### Operacions amb Fitxers
- Comprovar existència de fitxers
- Crear i eliminar fitxers
- Llegir línia per línia
- Escriure en fitxers
- Tancament adequat de recursos (try-with-resources)

### Rutes i Directoris
- `File.separator` per compatibilitat multiplataforma
- Crear i navegar per directoris
- Obtenir informació de fitxers (mida, data de modificació, etc.)

## Exemples

### 11_01 - Rutes
Exemple que demostra:
- Treballar amb rutes de fitxers
- Diferència entre rutes absolutes i relatives
- Gestió de directoris
- Informació sobre fitxers i carpetes

### 11_02 - Llegir Fitxer Text
Exemple que demostra:
- Obrir i llegir fitxers de text
- Utilitzar BufferedReader per lectura eficient
- Processar línies de text
- Tancar adequadament els recursos

### 11_03 - Llegir Fitxer Binari
Exemple que demostra:
- Lectura de fitxers binaris
- Diferència entre fitxers de text i binaris
- Gestió de bytes
- Aplicacions pràctiques

### 11_04 - BucleInfinito
Exemple que demostra:
- Lectura contínua de fitxers
- Monitorització de canvis
- Control de bucles amb fitxers
- Gestió d'errors en lectures repetides

## Notes Importants

⚠️ **Atenció**: 
- Sempre cal tancar els fitxers després d'utilitzar-los
- Utilitzar try-with-resources per garantir el tancament automàtic
- Gestionar les excepcions `IOException` adequadament
- Verificar l'existència del fitxer abans de llegir-lo
