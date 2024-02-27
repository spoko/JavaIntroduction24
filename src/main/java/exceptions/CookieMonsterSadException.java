package exceptions;

public class CookieMonsterSadException extends Exception {
    public CookieMonsterSadException (String message, int cookiesCount){
        super(message + ". You cannot divide " + cookiesCount + " cookies evenly amount 0 friends! " +
                "See it does not make any sense! And the cookie monster is sad because there is no cookies and" +
                "you are sad because you have no friends!");
    }
}
