# 05_01 - Topuria vs Holloway

## Introducció

Aquest exemple simula un combat entre dos lluitadors utilitzant bucles, condicionals i estructures de control. És un exercici pràctic que combina diversos conceptes de programació per crear una aplicació interactiva.

## Conceptes

### Conceptes Aplicats
- Bucle `do-while` per controlar les rondes
- Instrucció `switch` per gestionar diferents tipus de cops
- Variables acumuladores per la puntuació
- Variables de control (comptador de rondes, temps, KO)
- Condicions complexes de sortida
- Entrada de dades amb Scanner
- Condicionals niats

### Mecànica del Combat
- **Rondes**: 5 rondes de 300 segons cadascuna
- **Lluitadors**: Topuria (T) i Holloway (H)
- **Tipus de cops**:
  - LK (Low Kick): 2 punts, 50 segons
  - J (Jab): 5 punts, 150 segons
  - G (Ganxo): 10 punts, 200 segons
  - KO (Knockout): 5000 punts (només vàlid des de la ronda 3)
  - Altres: -1 punt, 120 segons (penalització)

### Estructura del Programa
1. Inicialització de variables
2. Bucle principal (rondes)
3. Lectura d'entrada (lluitador i cop)
4. Processar cop amb switch
5. Actualitzar puntuació i temps
6. Comprovar condicions de finalització
7. Determinar guanyador

## Exemples

Aquest exemple demostra:
- Utilització de bucle `do-while` per simular rondes
- Switch per processar diferents accions
- Control de temps i rondes
- Variables booleanes per control de flux (KO)
- Condicions de sortida múltiples
- Càlcul de puntuació acumulada
- Determinació del guanyador amb condicionals

## Format d'Entrada

```
T
LK
H
J
T
G
...
```

- Primera línia: Inicial del lluitador (T o H)
- Segona línia: Codi del cop (LK, J, G, KO, o altres)

## Format de Sortida

```
Topuria WINS 45 - 32
```
o
```
Holloway WINS (KO)
```
o
```
DRAW 40 - 40
```

## Notes Importants

💡 **Conceptes Clau**:
- El KO només és vàlid a partir de la ronda 3
- Els cops no vàlids penalitzen amb -1 punt
- El combat acaba per KO o després de 5 rondes
- Si els segons d'una ronda s'esgoten, passa a la següent ronda

⚠️ **Atenció**:
- Validar sempre l'entrada de l'usuari
- Controlar les condicions de sortida del bucle
- Tenir en compte tots els casos possibles (guanyador, empat, KO)
