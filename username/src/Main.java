import java.util.*;
import java.io.*;

class Main {

    public static boolean CodelandUsernameValidation(String str) {
        // Regla 1: Longitud entre 4 y 25
        if (str.length() < 4 || str.length() > 25) {
            return false;
        }

        // Regla 2: Comienza con una letra
        if (!Character.isLetter(str.charAt(0))) {
            return false;
        }

        // Regla 3: Solo letras, números y _
        if (!str.matches("[A-Za-z0-9_]+")) {
            return false;
        }

        // Regla 4: No termina con _
        if (str.endsWith("_")) {
            return false;
        }

        // Si pasó todas las reglas, es válido
        return true;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }

}
