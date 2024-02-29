package homeWorks;

public class HW6 {

    public static void main(String[] args) {
        System.out.println(isAValidPassword("asdas"));//false
        System.out.println(isAValidPassword("supErSecur3Pa$$word!"));//true
    }

    public static boolean isAValidPassword(String password){
        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        return password.matches(regex);
    }
}
