package validator;

public class DigitPresencePasswordValidator implements PasswordValidator {

    /**
     * Método que calcúla los puntos de la contraseña en función de si presenta algún número
     * @param password contaseña
     * @return puntos asignados
     */
    @Override
    public int calculatePoints(String password) {
        int passwordPoints =0;
        if(password.matches(".*\\d.*")){
           passwordPoints+=1;
        }
        return passwordPoints;
    }
}
