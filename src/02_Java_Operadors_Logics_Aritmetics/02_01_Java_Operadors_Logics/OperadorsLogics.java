package Java_Operadors_Logics_Aritmetics.Java_Operadors_Logics;

public class OperadorsLogics {
    public static void main(String[] args) {
        boolean condicio1 = true;
        boolean condicio2 = false;
        int edat = 25;
        boolean teCarnet = true;

        // AND Lògic (&&)
        boolean resultatAND = condicio1 && condicio2; // true && false -> false
        System.out.println(condicio1 + " && " + condicio2 + " = " + resultatAND);

        boolean potConduir = (edat >= 18) && teCarnet; // (true) && (true) -> true
        System.out.println("Pot conduir? " + potConduir);

        // OR Lògic (||)
        boolean resultatOR = condicio1 || condicio2; // true || false -> true
        System.out.println(condicio1 + " || " + condicio2 + " = " + resultatOR);

        boolean esFestiu = false;
        boolean esCapDeSetmana = true;
        boolean diaLliure = esFestiu || esCapDeSetmana; // false || true -> true
        System.out.println("És dia lliure? " + diaLliure);

        // NOT Lògic (!)
        boolean resultatNOT1 = !condicio1; // !true -> false
        System.out.println("!" + condicio1 + " = " + resultatNOT1);

        boolean resultatNOT2 = !condicio2; // !false -> true
        System.out.println("!" + condicio2 + " = " + resultatNOT2);

        boolean noTeCarnet = !teCarnet; // !true -> false
        System.out.println("No té carnet? " + noTeCarnet);

        // Combinació d'operadors
        boolean a = true, b = false, c = true;
        boolean complex = (a && b) || (!c && a); // (true && false) || (!true && true)
                                                 // (false) || (false && true)
                                                 // false || false -> false
        System.out.println("Resultat complex: " + complex);

        // Avaluació en curtcircuit amb &&
        System.out.println("\nDemostració de curtcircuit amb &&:");
        int x = 5;
        // Com que (x < 0) és false, la segona part (x++ > 10) no s'executa
        boolean testCurtCircuitAND = (x < 0) && (x++ > 10);
        System.out.println("Resultat testCurtCircuitAND: " + testCurtCircuitAND); // false
        System.out.println("Valor de x després de &&: " + x); // x segueix sent 5, no s'ha incrementat

        // Avaluació en curtcircuit amb ||
        System.out.println("\nDemostració de curtcircuit amb ||:");
        int y = 5;
        // Com que (y > 0) és true, la segona part (y++ > 10) no s'executa
        boolean testCurtCircuitOR = (y > 0) || (y++ > 10);
        System.out.println("Resultat testCurtCircuitOR: " + testCurtCircuitOR); // true
        System.out.println("Valor de y després de ||: " + y); // y segueix sent 5, no s'ha incrementat
    }
}