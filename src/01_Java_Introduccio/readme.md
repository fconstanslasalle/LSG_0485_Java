
# Començar a Programar en Java amb Windows 11 ☕

Per desenvolupar aplicacions en Java al teu ordinador amb Windows 11, necessitaràs principalment dues coses: el **Kit de Desenvolupament de Java (JDK)** i un **Entorn de Desenvolupament Integrat (IDE)**.

---

## 1. Kit de Desenvolupament de Java (JDK)

El JDK és un paquet de programari que conté tot el necessari per compilar, depurar i executar aplicacions Java.

* **Què és?** Inclou el compilador de Java (`javac`), la Màquina Virtual de Java (JVM) i les biblioteques de classes estàndard de Java.
* **On descarregar-lo?** Pots descarregar la darrera versió del JDK (o una versió específica si el teu projecte ho requereix) des del web oficial d'[Oracle](https://www.oracle.com/java/technologies/downloads/) o alternatives populars com [AdoptOpenJDK (ara Eclipse Temurin)](https://adoptium.net/).
* **Instal·lació:**
    1.  Descarrega l'instal·lador per a Windows (normalment un fitxer `.exe` o `.msi`).
    2.  Executa l'instal·lador i segueix les instruccions. És recomanable acceptar les opcions per defecte si no estàs segur.
* **Configuració de les Variables d'Entorn (important!):**
    * **`JAVA_HOME`**: Aquesta variable ha d'apuntar al directori d'instal·lació del JDK (per exemple, `C:\Program Files\Java\jdk-21`).
        1.  Cerca "variables d'entorn" a la barra de cerca de Windows.
        2.  Fes clic a "Edita les variables d'entorn del sistema".
        3.  A la finestra de "Propietats del sistema", fes clic al botó "Variables d'entorn...".
        4.  A la secció "Variables del sistema", fes clic a "Nova...".
        5.  Introdueix `JAVA_HOME` com a nom de la variable i la ruta al teu directori del JDK com a valor.
    * **`Path`**: Afegeix el directori `bin` del JDK a la variable `Path` del sistema.
        1.  A la mateixa finestra de "Variables d'entorn", selecciona la variable `Path` a "Variables del sistema" i fes clic a "Edita...".
        2.  Fes clic a "Nou" i afegeix `%JAVA_HOME%\bin`.
        3.  Accepta els canvis.
* **Verificació:** Obre una nova finestra de símbol del sistema (CMD) o PowerShell i executa les ordres següents per comprovar que la instal·lació és correcta:
    ```bash
    java -version
    javac -version
    ```
    Hauries de veure la informació de la versió del JDK instal·lat.

---

## 2. Entorn de Desenvolupament Integrat (IDE) 🚀

Un IDE et facilita l'escriptura, compilació, depuració i execució del teu codi Java. Tot i que pots fer servir un editor de text simple i la línia d'ordres, un IDE és molt més eficient.

* **Opcions populars:**
    * **[IntelliJ IDEA (Community Edition)](https://www.jetbrains.com/idea/download/)**: Molt potent i popular, amb una versió gratuïta (Community) suficient per a la majoria de desenvolupaments Java.
    * **[Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/release/2024-03/r/eclipse-ide-java-developers)**: Un altre IDE clàssic, de codi obert i molt extensible.
    * **[Visual Studio Code (VS Code)](https://code.visualstudio.com/Download)**: Un editor de codi lleuger però potent que, amb les extensions adequades (com el "Extension Pack for Java" de Microsoft), es converteix en un entorn de desenvolupament Java complet.
    * **[NetBeans](https://netbeans.apache.org/download/index.html)**: Un IDE oficial de Apache, també de codi obert i amb moltes funcionalitats.
* **Instal·lació:**
    1.  Descarrega l'instal·lador de l'IDE que hagis triat des del seu web oficial.
    2.  Executa l'instal·lador i segueix les instruccions. La majoria d'instal·ladors moderns detectaran automàticament el teu JDK si està correctament configurat.
* **Primers Passos:**
    * Un cop instal·lat, obre l'IDE.
    * Crea un nou projecte Java.
    * Escriu el teu primer programa (el clàssic "Hello, World!").
    * Compila'l i executa'l des de dins de l'IDE.

---

## Resum dels Passos Clau:

1.  **Descarrega i instal·la el JDK** (Oracle JDK, Eclipse Temurin, etc.).
2.  **Configura les variables d'entorn** `JAVA_HOME` i afegeix el directori `bin` del JDK al `Path`.
3.  **Verifica la instal·lació del JDK** amb `java -version` i `javac -version`.
4.  **Descarrega i instal·la un IDE** (IntelliJ IDEA, Eclipse, VS Code amb extensions, NetBeans).
5.  **Comença a programar!** 🎉

Amb aquests elements, estaràs llest per començar a desenvolupar les teves aplicacions Java a Windows 11. Molta sort!