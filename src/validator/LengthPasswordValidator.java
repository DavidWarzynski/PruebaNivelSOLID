package validator;

public class LengthPasswordValidator implements PasswordValidator {

    /**
     * Método que calcúla los puntos de la contraseña en función de su longitud
     * @param password contaseña
     * @return puntos asignados
     */
    @Override
    public int calculatePoints(String password) {
        int passwordLength = password.length();
        int passwordPoints = 0;
        if(passwordLength> 12){
            passwordPoints+=3;
        } else if (passwordLength>=9) {
            passwordPoints+=2;
        } else if (passwordLength>=7) {
            passwordPoints+=1;
        }
        return passwordPoints;
    }
}
