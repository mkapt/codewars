package codewars.katas;

public class ValidatePINCode {

    public static void main(String[] args) {
        System.out.println(validatePin("123456"));
    }

    public static boolean validatePin(String pin) {
        return pin.matches("[0-9]{4}|[0-9]{6}");

        /*if(pin.matches("[0-9]{4}|[0-9]{6}") *//*|| pin.matches("[0-9]{6}")*//*)
            return true;
        else
            return false;*/
    }
}
