# 01_01 - Java Hello World

## Introducció

Aquest és el primer exemple de programació en Java. El clàssic programa "Hello World" és tradicionalment el primer programa que s'escriu quan s'aprèn un nou llenguatge de programació. Demostra la sintaxi bàsica i com executar un programa simple.

## Conceptes

### Estructura Bàsica d'un Programa Java
- Declaració de la classe pública
- Mètode `main` com a punt d'entrada del programa
- Instrucció `System.out.println()` per mostrar text per pantalla

### Elements del Codi
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- **`public class HelloWorld`**: Declaració de la classe pública
- **`public static void main(String[] args)`**: Mètode principal que executa el programa
- **`System.out.println()`**: Imprimeix text a la consola amb salt de línia

## Exemples

Aquest exemple demostra:
- Com crear una classe Java
- Com definir el mètode main
- Com mostrar text per pantalla
- Estructura mínima d'un programa Java funcional

## Com Executar

1. Compilar el programa: `javac HelloWorld.java`
2. Executar el programa: `java HelloWorld`
3. Veuràs el missatge "Hello, World!" a la consola

## Notes

💡 El nom del fitxer Java ha de coincidir amb el nom de la classe pública que conté.
