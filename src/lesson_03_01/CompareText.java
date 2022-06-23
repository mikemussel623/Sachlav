package lesson_03_01;

public class CompareText {
    public static void main(String[] args) {

        String name = "Alex";
        String secondName = "Alex";
        String thirdName = "Alex2";
        String anotherName = "aleX2";


        boolean areEqual;
        System.out.println(name == secondName);

        areEqual = secondName.equals(thirdName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equals(anotherName);
        System.out.println("areEqual = " + areEqual);

        areEqual = thirdName.equalsIgnoreCase(anotherName);
        System.out.println("areEqual = " + areEqual);



    }
}
