import java.util.*; 
import java.io.*;

class QuestionOne {

    static final Integer sum = 2020;
    static final List<Integer> numbers = new ArrayList<Integer>() {{
        add(1721);
        add(979);
        add(366);
        add(299);
        add(1456);
    }};

    public void calculateWithTwoEntries(final ArrayList<Integer> listOfLines) {
        for (Integer num : listOfLines) {
            final int desiredValue = sum - num;
            if (listOfLines.contains(desiredValue)) {
                final int product = desiredValue * num;
                System.out.println("Final Anwser for Two Entries is: " + product);
                return;
            }
        }
    }

    public void calculateWithThreeEntries(final ArrayList<Integer> listOfLines) {
        final int arrayLength = listOfLines.size();
        for (int i = 0; i < arrayLength; i++) {
            for (int j = 1; j < arrayLength; j++) {
                final int firstValue = listOfLines.get(i);
                final int secondValue = listOfLines.get(j);
                final int desiredValue = sum - firstValue - secondValue;
                if (listOfLines.contains(desiredValue)) {
                    final int product = desiredValue * firstValue * secondValue;
                    System.out.println("Final Anwser for Three Entries is: " + product);
                    return;
                }        
            }
        }
    }



    public static void main(String[] args) {
        QuestionOne questionOne = new QuestionOne();
        final ArrayList<Integer> listOfLines = new ArrayList<>();
        
        try (final BufferedReader bufReader = new BufferedReader(new FileReader("input.txt"))) {
            String line = bufReader.readLine(); 
            while (line != null) { 
                listOfLines.add(Integer.parseInt(line)); 
                line = bufReader.readLine(); 
            }    
        } catch (IOException e) {
            System.out.println("Error reading in File. Exiting Program.");
            return;
        }
        
        questionOne.calculateWithTwoEntries(listOfLines);
        questionOne.calculateWithThreeEntries(listOfLines);
        
    }

}