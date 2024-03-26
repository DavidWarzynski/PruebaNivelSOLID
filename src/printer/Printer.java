package printer;

import java.util.Scanner;

public class Printer {

    public void printPasswordInformation(String password, int force) {
        System.out.println("La contraseña: "+ password +", tiene un nivel de fuerza "
                + forceTag(force)+" con un valor de "+ force);
    }
    public void checkParameters() {
        System.out.println("Se requiere el parámetro contraseña");
        System.exit(1);
    }

    public void confirmPassword(int force, int passwordForcePointsThreshold) {
        if(force <= passwordForcePointsThreshold && !confirmWeakPassword()){
            denyPassword();
        }else {
            acceptPassword();
        }
    }

    private void denyPassword() {
        System.out.println("La contraseña ha sido denegada");
        System.exit(1);
    }

    private void acceptPassword() {
        System.out.println("La contraseña ha sido aceptada");
    }

    /**
     * Método qe asigna una etiqueta a la fuerza según su valor númerico
     * @param forcePasswordPoints valor númerico de la fuerza de la contaseña
     * @return etiqueta
     */
    private String forceTag(int forcePasswordPoints){
        if(forcePasswordPoints==10){
            return "muy fuerte";
        }
        else if (forcePasswordPoints >=8){
            return "fuerte";
        }
        else if (forcePasswordPoints>=6){
            return "moderada";
        }
        else if (forcePasswordPoints>=3){
            return "débil";
        }
        else {
            return "muy débil";
        }
    }
    /**
     * Método que prgunta al usuario por consola si confirma la contraseña débil
     * @return verdadero si es confirmada, falso en caso contrario
     */
    public boolean confirmWeakPassword(){
        Scanner reader = new Scanner(System.in);
        System.out.println("¿Confirmar contraseña débil? (s/n)");
        String response= reader.next();
        return response.equalsIgnoreCase("s");
    }
}
