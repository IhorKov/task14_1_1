public class Main {
    public static void main(String[] args) {
        String s1 = "Молоко";
        String s2 = "Далеко";

        try {
            checkString(s1, s2);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void checkString(String s1, String s2){
        String lastElementOne = s1.substring(s1.length() - 1);
        String lastElementTwo = s2.substring(s1.length() - 1);

        if(lastElementOne.equals(lastElementTwo)) {
            IllegalArgumentException ex = new IllegalArgumentException(lastElementOne);
            throw ex;
        }
        else {
            System.out.println(s1);
            System.out.println(s2);
        }
    }
}
