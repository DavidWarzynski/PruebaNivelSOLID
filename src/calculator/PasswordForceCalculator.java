package calculator;

import validator.PasswordValidator;

public class PasswordForceCalculator {

    private PasswordValidator passwordValidator;

    public PasswordForceCalculator(PasswordValidator passwordValidator) {
        this.passwordValidator = passwordValidator;
    }

    /**
     * Método que calcúla la fuerza de la contraseña
     * @param password contraseña
     * @return fuerza de la contraseña
     */
    public int calculatePasswordForce(String password){
        int forcePasswordPoints= passwordValidator.calculatePoints(password);

        if(forcePasswordPoints==9){
            forcePasswordPoints++;
        }

        return forcePasswordPoints;
    }
}