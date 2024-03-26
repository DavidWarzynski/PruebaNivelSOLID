package validator;

import java.util.List;

public class CombinedPasswordValidator implements PasswordValidator {
    private List<PasswordValidator> validators;

    public CombinedPasswordValidator(List<PasswordValidator> validators) {
        this.validators = validators;
    }

    @Override
    public int calculatePoints(String password) {
        int totalPoints = 0;
        for (PasswordValidator validator : validators) {
            totalPoints += validator.calculatePoints(password);
        }
        return totalPoints;
    }
}
