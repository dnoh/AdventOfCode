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


    public static void main(String[] args) {
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

        for (Integer num : listOfLines) {
            final int desiredValue = sum - num;
            if (listOfLines.contains(desiredValue)) {
                System.out.println("Final Anwser is: " + desiredValue*num);
                return;
            }
        }
    }

}