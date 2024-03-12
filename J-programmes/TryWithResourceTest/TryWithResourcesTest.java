
import java.io.*;
import java.util.*;


/*
 * Official documentation.
 * https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
 *
 * */

public class TryWithResourcesTest{

	public static void main(String[] args){
		
        String inputFile = "D://input.txt";
		readFile(inputFile);
		
	}


	public static void readFile(String inputFile){

        StringBuilder inputText = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {   //try with resources
            String line;
            while ((line = reader.readLine()) != null) {
                inputText.append(line);
                String separator = System.getProperty("line.separator");   //append "carriage return". note by me.
                inputText.append(separator);
            }

			System.out.println(inputText);

        } catch (IOException e) {
            e.printStackTrace();
        }

	
	}

}

