
# Guia Completa per a Començar amb GitHub i GitHub Desktop

Aquesta guia et portarà a través del procés de crear un compte a GitHub, crear el teu primer repositori, instal·lar GitHub Desktop i començar a treballar amb el teu repositori de forma local.

## Part 1: Crear un Compte a GitHub i el Teu Primer Repositori

### 1. Crear un Compte a GitHub

GitHub és una plataforma de desenvolupament col·laboratiu basada en el sistema de control de versions Git. Per començar, necessites un compte.

1.  **Ves a la pàgina de GitHub:** Obre el teu navegador web i navega a [https://github.com/](https://github.com/).
2.  **Registra't:**
    * Busca el botó "Sign up" (Registrar-se), normalment situat a la cantonada superior dreta.
    * Se't demanarà que introdueixis una adreça de correu electrònic vàlida. Assegura't que sigui una que revisis regularment.
    * Crea una contrasenya segura. GitHub et donarà indicacions sobre la fortalesa de la contrasenya.
    * Tria un nom d'usuari. Aquest serà el teu identificador públic a GitHub (per exemple, `elmeunomusuari`).
    * És possible que hagis de resoldre un petit trencaclosques per verificar que ets humà.
    * Llegeix i accepta els Termes de Servei i la Declaració de Privacitat.
    * Fes clic a "Create account" (Crear compte).
3.  **Verifica el teu correu electrònic:** GitHub t'enviarà un correu electrònic de verificació. Obre el correu i fes clic a l'enllaç de verificació per activar completament el teu compte.
4.  **Configura el teu perfil (opcional però recomanat):**
    * Un cop hagis iniciat sessió, pots personalitzar el teu perfil afegint una foto, una biografia, la teva ubicació, etc. Això es fa des de la icona del teu perfil a la cantonada superior dreta, seleccionant "Your profile" (El teu perfil) i després "Edit profile" (Editar perfil).

### 2. Crear el Teu Primer Repositori

Un repositori (sovint anomenat "repo") és on s'emmagatzema tot el teu projecte: fitxers, imatges, vídeos, fulls de càlcul, conjunts de dades, i el més important, l'historial de canvis de cada fitxer.

1.  **Inicia sessió a GitHub:** Si encara no ho has fet, inicia sessió al teu compte de GitHub.
2.  **Crea un nou repositori:**
    * Hi ha diverses maneres de fer-ho:
        * A la pàgina principal (dashboard), busca un botó verd que digui "Create repository" (Crear repositori) o "New" (Nou) al costat de la llista de repositoris.
        * Fes clic a la icona `+` a la cantonada superior dreta i selecciona "New repository" (Nou repositori).
3.  **Configura el teu nou repositori:**
    * **Repository name (Nom del repositori):** Tria un nom descriptiu per al teu projecte (per exemple, `el-meu-primer-projecte`, `notes-de-classe`). GitHub t'indicarà si el nom està disponible. Els noms dels repositoris han de ser únics dins del teu compte.
    * **Description (Descripció) (opcional):** Afegeix una breu descripció del teu projecte. Això ajuda els altres (i a tu mateix en el futur) a entendre de què tracta el repositori.
    * **Public / Private (Públic / Privat):**
        * **Public:** Qualsevol persona a Internet pot veure aquest repositori. Tu tries qui pot fer "commit" (aportar canvis).
        * **Private:** Tu tries qui pot veure i fer "commit" a aquest repositori. Els comptes gratuïts de GitHub permeten repositoris privats amb col·laboradors il·limitats.
        * *Per a començar, pots triar qualsevol opció. Si no estàs segur, `Public` és una bona opció per a projectes d'aprenentatge.*
    * **Initialize this repository with (Inicialitzar aquest repositori amb):**
        * **Add a README file (Afegir un fitxer README):** **MOLT RECOMANAT.** Un fitxer README és on pots escriure una descripció més llarga del teu projecte, com instal·lar-lo, com utilitzar-lo, etc. Marcar aquesta opció crea el repositori amb un primer fitxer (`README.md`).
        * **Add .gitignore (Afegir .gitignore):** Opcional per ara. Un fitxer `.gitignore` especifica fitxers que Git hauria d'ignorar intencionadament (per exemple, fitxers temporals, fitxers de configuració local). Pots seleccionar una plantilla si saps quin tipus de projecte crearàs (per exemple, Python, Node).
        * **Choose a license (Triar una llicència):** Opcional per ara. Una llicència informa els altres sobre què poden i no poden fer amb el teu codi/projecte.
    * Fes clic al botó verd "Create repository" (Crear repositori).

Enhorabona! Has creat el teu primer repositori a GitHub. Ara veuràs la pàgina principal del teu nou repositori. Si has inicialitzat amb un README, el veuràs allà. Fixa't en l'URL del teu repositori a la barra d'adreces del navegador (serà quelcom com `https://github.com/elmeunomusuari/el-meu-primer-projecte`).

## Part 2: Instal·lar GitHub Desktop i Treballar amb el Repositori

GitHub Desktop és una aplicació que et permet interactuar amb GitHub utilitzant una interfície gràfica en lloc de la línia de comandes.

### 1. Descarregar i Instal·lar GitHub Desktop

1.  **Ves a la pàgina de GitHub Desktop:** Obre el teu navegador i ves a [https://desktop.github.com/](https://desktop.github.com/).
2.  **Descarrega l'instal·lador:** La pàgina web hauria de detectar automàticament el teu sistema operatiu (Windows o macOS) i oferir-te el botó de descàrrega correcte. Fes clic per descarregar l'instal·lador.
3.  **Executa l'instal·lador:**
    * **Windows:** Obre el fitxer `.exe` descarregat i segueix les instruccions. GitHub Desktop s'instal·larà i s'iniciarà automàticament.
    * **macOS:** Obre el fitxer `.zip` descarregat. Arrossega l'aplicació GitHub Desktop a la teva carpeta d'Aplicacions. Després, obre GitHub Desktop des de la carpeta d'Aplicacions.
4.  **Inicia sessió a GitHub Desktop:**
    * Quan GitHub Desktop s'iniciï per primera vegada, et demanarà que iniciïs sessió amb el teu compte de GitHub.
    * Fes clic a "Sign in to GitHub.com" (Iniciar sessió a GitHub.com).
    * Això obrirà el teu navegador perquè autoritzis l'aplicació. Introdueix les teves credencials de GitHub si se't demana i autoritza GitHub Desktop.
    * Un cop autoritzat, torna a GitHub Desktop.
5.  **Configura Git:**
    * GitHub Desktop pot necessitar configurar el teu nom i correu electrònic per a Git. Aquests s'utilitzaran per identificar els canvis (commits) que facis.
    * Assegura't que el nom i el correu electrònic que apareixen són els que vols utilitzar (normalment els mateixos que el teu compte de GitHub). Si no és així, pots canviar-los. Aquesta informació serà visible a l'historial de commits.
    * Fes clic a "Finish" (Finalitzar).

### 2. Clonar el Repositori Creat Anteriorment

"Clonar" un repositori significa crear una còpia local del repositori que existeix a GitHub.com al teu ordinador. Això et permet treballar en els fitxers del projecte localment.

1.  **Obre GitHub Desktop.**
2.  **Clona un repositori:**
    * A la pantalla principal de GitHub Desktop, hauries de veure una opció per "Clone a repository from the Internet..." (Clonar un repositori des d'Internet...). Fes-hi clic.
    * Alternativament, pots anar a `File` (Fitxer) > `Clone repository...` (Clonar repositori...).
3.  **Selecciona el repositori:**
    * A la pestanya "GitHub.com", hauries de veure una llista dels teus repositoris existents.
    * Busca el repositori que vas crear a la Part 1 (per exemple, `el-meu-primer-projecte`) i selecciona'l.
4.  **Tria la ruta local (Local Path):**
    * A sota, veuràs el camp "Local Path" (Ruta local). Aquesta és la carpeta del teu ordinador on es descarregaran els fitxers del repositori.
    * Per defecte, GitHub Desktop sol suggerir una carpeta anomenada `GitHub` dins de la teva carpeta de Documents (per exemple, `C:\Users\ElTeuUsuari\Documents\GitHub\el-meu-primer-projecte` a Windows o `/Users/ElTeuUsuari/Documents/GitHub/el-meu-primer-projecte` a macOS).
    * Pots fer clic a "Choose..." (Triar...) per seleccionar una ubicació diferent si ho prefereixes.
5.  **Fes clic a "Clone" (Clonar):**
    * GitHub Desktop descarregarà tots els fitxers del teu repositori des de GitHub.com a la carpeta local que has especificat.

### 3. Començar a Treballar amb el Repositori Localment

Ara tens una còpia local del teu repositori. Pots començar a fer canvis!

1.  **Obre la carpeta del projecte:**
    * A GitHub Desktop, amb el teu repositori seleccionat, pots fer clic a "Show in Explorer" (Mostrar a l'Explorador - Windows) o "Show in Finder" (Mostrar al Finder - macOS) a la barra lateral dreta (o des del menú `Repository` > `Show in Explorer/Finder`). Això obrirà la carpeta on has clonat el repositori.
    * També pots fer clic a "Open in [el teu editor de text per defecte]" (Obrir a...) si GitHub Desktop detecta un editor de codi compatible (com VS Code).
2.  **Fes canvis:**
    * Obre el fitxer `README.md` (o crea un nou fitxer) amb un editor de text (Bloc de notes, TextEdit, VS Code, Sublime Text, etc.).
    * Fes alguns canvis. Per exemple, afegeix una nova línia de text al `README.md`.
    * Guarda el fitxer.
3.  **Revisa els canvis a GitHub Desktop:**
    * Torna a GitHub Desktop. Hauries de veure que la pestanya "Changes" (Canvis) a la barra lateral esquerra ara mostra els fitxers que has modificat o afegit.
    * Selecciona un fitxer de la llista per veure les diferències (què has afegit o eliminat - en verd el que s'ha afegit, en vermell el que s'ha eliminat).
4.  **Fes un "Commit" dels teus canvis:**
    * Un "commit" és com una instantània dels teus canvis en un moment determinat. Cada commit té un missatge que descriu els canvis fets.
    * A la part inferior de la pestanya "Changes", trobaràs una caixa de text per al "Summary" (Resum) i opcionalment "Description" (Descripció).
    * Escriu un missatge de commit breu i descriptiu al camp "Summary" (per exemple, "Actualitzat el README amb més informació" o "Afegit el primer esborrany del document principal").
    * Pots afegir una descripció més llarga si cal.
    * Fes clic al botó "Commit to `main`" (o `master`, depenent del nom de la teva branca principal). El nom de la branca per defecte sol ser `main`).
    * Això desa els teus canvis *localment* al teu repositori Git. Encara no estan a GitHub.com.
5.  **Puja ("Push") els canvis a GitHub.com:**
    * Després de fer un o més commits, necessites pujar aquests canvis al teu repositori remot a GitHub.com. Això es coneix com "push".
    * A la part superior de GitHub Desktop, hauries de veure un botó que diu "Push origin" (Pujar a l'origen) amb un número que indica quants commits locals estan pendents de pujar.
    * Fes clic a aquest botó.
    * GitHub Desktop pujarà els teus commits al repositori a GitHub.com.
6.  **Verifica a GitHub.com:**
    * Ves al teu navegador i actualitza la pàgina del teu repositori a GitHub.com.
    * Hauries de veure els canvis que has fet i el nou commit a l'historial del repositori.

### Resum del Flux de Treball Bàsic amb GitHub Desktop

1.  **Fetch origin / Pull origin (Recuperar / Baixar canvis):** Abans de començar a treballar, és una bona pràctica assegurar-te que tens la darrera versió del repositori, especialment si hi ha altres col·laboradors. A GitHub Desktop, el botó "Fetch origin" comprova si hi ha canvis nous. Si n'hi ha, es convertirà en "Pull origin" per descarregar-los i fusionar-los amb la teva còpia local.
2.  **Fes canvis** als teus fitxers localment (afegir, modificar, eliminar).
3.  **Fes un "Commit"** dels teus canvis a GitHub Desktop amb un missatge descriptiu.
4.  **Fes "Push"** dels teus commits a GitHub.com per compartir-los i mantenir una còpia de seguretat al núvol.

Ara estàs preparat per utilitzar GitHub i GitHub Desktop per gestionar els teus projectes! A mesura que avancis, aprendràs conceptes més avançats com branques (branching), fusions (merging), resolució de conflictes i col·laboració amb altres persones.