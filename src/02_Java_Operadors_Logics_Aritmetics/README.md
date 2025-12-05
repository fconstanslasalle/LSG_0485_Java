# 02 - Java Operadors Lògics i Aritmètics

## Introducció

Aquesta carpeta conté exemples sobre els operadors en Java. Els operadors són símbols que permeten realitzar operacions sobre variables i valors, i són fonamentals per a qualsevol programa.

## Conceptes

### Operadors Aritmètics
Permeten realitzar operacions matemàtiques bàsiques:
- **`+`**: Addició (suma)
- **`-`**: Sostracció (resta)
- **`*`**: Multiplicació
- **`/`**: Divisió
- **`%`**: Mòdul (residu de la divisió)
- **`++`**: Increment (augmenta en 1)
- **`--`**: Decrement (disminueix en 1)

### Operadors Lògics
Permeten combinar expressions booleanes:
- **`&&`**: AND lògic (ambdues condicions han de ser certes)
- **`||`**: OR lògic (almenys una condició ha de ser certa)
- **`!`**: NOT lògic (inverteix el valor booleà)

### Operadors de Comparació
Permeten comparar valors:
- **`==`**: Igual a
- **`!=`**: Diferent de
- **`>`**: Major que
- **`<`**: Menor que
- **`>=`**: Major o igual que
- **`<=`**: Menor o igual que

### Precedència d'Operadors
1. Operadors aritmètics (`*`, `/`, `%` abans que `+`, `-`)
2. Operadors de comparació
3. Operadors lògics (`!` abans que `&&` abans que `||`)

Es poden utilitzar parèntesis per modificar la precedència.

## Exemples

### 02_01 - Java Operadors Lògics
Exemple que demostra:
- Utilització de l'operador AND (`&&`)
- Utilització de l'operador OR (`||`)
- Utilització de l'operador NOT (`!`)
- Avaluació en curtcircuit
- Taules de veritat
- Combinació de diversos operadors

## Aplicacions Pràctiques

Els operadors s'utilitzen en:
- **Càlculs matemàtics**: Fórmules i expressions aritmètiques
- **Condicionals**: Prendre decisions basades en condicions
- **Validacions**: Comprovar dades d'entrada
- **Bucles**: Condicions de parada i control de flux

## Notes Importants

💡 **Consells**:
- Utilitzar parèntesis per fer les expressions més clares
- Tenir en compte la divisió entera vs divisió decimal
- Aprofitar l'avaluació en curtcircuit dels operadors lògics
- No confondre `=` (assignació) amb `==` (comparació)

⚠️ **Atenció**:
- La divisió entre enters retorna un enter (trunca els decimals)
- Per obtenir decimals, almenys un operand ha de ser `double` o `float`
- L'operador `==` compara valors; per Strings utilitzar `.equals()`
- Els operadors `++` i `--` es comporten diferent segons siguin prefix o postfix
