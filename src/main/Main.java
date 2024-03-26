package main;

import calculator.PasswordForceCalculator;
import printer.Printer;
import validator.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final int FORCE_PASSWORD_POINTS_THRESHOLD = 8;
    public static void main(String[] args) {
        Printer printer = new Printer();

        if(args.length <1){
            printer.checkParameters();
        }

        String password = args[0].trim();
        List<PasswordValidator> passwordValidators = new ArrayList<>();
        passwordValidators.add(new LengthPasswordValidator());
        passwordValidators.add(new DigitPresencePasswordValidator());
        passwordValidators.add(new SymbolPresencePasswordValidator());
        passwordValidators.add(new CaseLetterPasswordValidator());

        PasswordForceCalculator passwordForceCalculator =
                new PasswordForceCalculator(new CombinedPasswordValidator(passwordValidators));

        int force = passwordForceCalculator.calculatePasswordForce(password);
        printer.printPasswordInformation(password,force);
        printer.confirmPassword(force, FORCE_PASSWORD_POINTS_THRESHOLD);
    }



}
