import java.util.*; 

class QuestionOne {

    static final Integer sum = 2020;
    static final List<Integer> numbers = new ArrayList<Integer>() {{
        add(1721);
        add(979);
        add(366);
        add(299);
        add(1456);
    }};


    public static void main(String[] args) {
        for (Integer num : numbers) {
            final int desiredValue = sum - num;
            if (numbers.contains(desiredValue)) {
                System.out.println(num + " & " + desiredValue);
                System.out.println("Final Anwser is: " + desiredValue*num);
            }
        }
    }

}