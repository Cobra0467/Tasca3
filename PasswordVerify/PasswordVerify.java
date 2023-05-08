package PasswordVerify;
import java.util.Scanner;

public class PasswordVerify {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String contra = "";


        System.out.println("Introduce una contraseña segura: ");
        contra = sc.nextLine();
        boolean isValid = validaContra(contra);

    }

    public static boolean validaContra(String contrasenya) {
        boolean isValid = true;
        StringBuilder mensajeError = new StringBuilder();

        if (contrasenya.length() < 8) {
            System.err.print("La contraseña debe tener al menos 8 caracteres \n");
        }

        int cuentaDigitos = 0;
        int cuentaLetras = 0;
        int cuentaSimbolos = 0;
        int cuentaMayus = 0;

        for (char c : contrasenya.toCharArray()) {
            if (Character.isDigit(c)) {
                cuentaDigitos++;
            } else if (Character.isLetter(c)) {
                cuentaLetras++;
            } else if (esSimbolo(c)) {
                cuentaSimbolos++;
            } else if (contrasenya.matches("[A-Z]")) {
                cuentaMayus++;
            }
        }

        if (cuentaDigitos < 2) {
            System.err.print("La contraseña debe tener al menos 2 numeros \n");
            isValid = false;
        }

        if (cuentaLetras < 2) {
            System.err.print("La contraseña debe tener 2 letras como mínimo \n");
            isValid = false;
        }

        if (cuentaSimbolos < 1) {
            System.err.print("La contraseña debe tener al menos 1 símbolo \n");
        }

        if (cuentaMayus < 1) {
            System.err.print("La contraseña debe tener al menos una mayuscula");
        }

        return isValid;
    }

    public static boolean esSimbolo(char c) {
        String simbolos = "[!@#$%^&*()-+=.,_'¿¡?/&·|]";
        return simbolos.indexOf(c) != -1;
    }

}
