# 13 - Java OOP (Programació Orientada a Objectes)

## Introducció

Aquesta carpeta conté exemples de codi per aprendre els fonaments de la Programació Orientada a Objectes (OOP) en Java. L'OOP és un paradigma de programació que organitza el codi en objectes que combinen dades (atributs) i comportament (mètodes).

## Conceptes

### Principis Bàsics de l'OOP

#### Classes i Objectes
- **Classe**: Plantilla o model per crear objectes
- **Objecte**: Instància d'una classe
- **Atributs**: Variables que defineixen l'estat d'un objecte
- **Mètodes**: Funcions que defineixen el comportament d'un objecte

#### Encapsulació
- Ocultar la implementació interna
- Modificadors d'accés: `private`, `public`, `protected`
- Getters i Setters per accedir als atributs privats
- Avantatges: protecció de dades, flexibilitat

#### Herència
- Relació "és un" (is-a)
- Classe pare (superclasse) i classe filla (subclasse)
- Reutilització de codi
- Paraula clau `extends`
- Sobreescriptura de mètodes (`@Override`)

#### Polimorfisme
- Capacitat d'un objecte de prendre diferents formes
- Mètodes amb el mateix nom però diferent comportament
- Sobrecàrrega de mètodes (overloading)
- Sobreescriptura de mètodes (overriding)

#### Abstracció
- Amagar detalls complexos
- Classes abstractes
- Interfícies

### Constructors
- Mètode especial per inicialitzar objectes
- Mateix nom que la classe
- Poden tenir paràmetres
- Constructor per defecte vs constructor personalitzat

### Paraula Clau `this`
- Referència a l'objecte actual
- Distingir entre atributs i paràmetres
- Cridar un constructor des d'un altre

### Paraula Clau `static`
- Membres que pertanyen a la classe, no als objectes
- Mètodes i atributs estàtics
- Accés sense crear objectes

## Exemples

### 13_01 - JavaClasses
Exemple que demostra:
- Creació de classes simples
- Declaració d'atributs i mètodes
- Instanciació d'objectes
- Utilització de constructors
- Encapsulació amb getters i setters
- Exemple pràctic d'una aplicació orientada a objectes

## Avantatges de l'OOP

- **Modularitat**: El codi està organitzat en classes independents
- **Reutilització**: Les classes es poden reutilitzar en diferents parts del programa
- **Mantenibilitat**: Els canvis es poden fer de forma localitzada
- **Escalabilitat**: Facilita l'extensió del programa
- **Modelatge natural**: Representa conceptes del món real de forma intuïtiva

## Notes Importants

💡 **Consells**: 
- Començar amb classes simples i anar augmentant la complexitat
- Utilitzar noms descriptius per a classes, atributs i mètodes
- Aplicar l'encapsulació des del principi
- Pensar en termes d'objectes i les seves responsabilitats
