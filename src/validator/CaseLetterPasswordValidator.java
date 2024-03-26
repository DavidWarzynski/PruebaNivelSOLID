package validator;

public class CaseLetterPasswordValidator implements PasswordValidator {
    /**
     * Método que calcúla los puntos de la contraseña en función de si contiene letras
     *  mayúsculas, minúsculas o ambas.
     * @param password contaseña
     * @return puntos asignados
     */
    @Override
    public int calculatePoints(String password) {
        int forcePasswordPoints =0;
        boolean hasLowerCase = password.matches(".*[a-z].*");
        boolean hasUpperCase = password.matches(".*[A-Z].*");
        if(hasUpperCase || hasLowerCase){
            forcePasswordPoints++;
        }
        if(hasLowerCase && hasUpperCase){
            forcePasswordPoints= forcePasswordPoints + 2;
        }
        return forcePasswordPoints;
    }
}
