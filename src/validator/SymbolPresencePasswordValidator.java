package validator;

public class SymbolPresencePasswordValidator implements PasswordValidator {

    /**
     * Método que calcúla los puntos de la contraseña en función de si presenta algún símbolo
     * @param password contaseña
     * @return puntos asignados
     */
    @Override
    public int calculatePoints(String password) {
        int passwordPoints = 0;
        if(password.matches(".*[^a-zA-Z\\d].*")){
            passwordPoints+=2;
        }
        return passwordPoints;
    }
}
