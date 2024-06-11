import java.util.ArrayList;

class ListsExceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Casted value: " + castedValue + " at index: " + i);
            } catch (ClassCastException e) {
                System.out.println("Error: Cannot cast value to Integer. Index: " + i + ", Value: " + myList.get(i));
            }
        }
    }
}
