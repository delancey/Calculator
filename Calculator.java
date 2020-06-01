import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static int add(final String numbers){
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        List <Integer> negativeNumbers = new ArrayList<Integer>();
        // if(numbersArray.length >2){
        //     throw new RuntimeException("Up to 2 numbers separated by a comma (, ) are allowed");
        // } 
            //go through each number in array and convert to integer
        for (String number: numbersArray){
            if(!number.isEmpty()){
                int numberInt = Integer.parseInt(number);
                //converts number String to int, adds returnValue
                // returnValue += numberInt;
            //if not possible throw exception
                if(numberInt < 0){
                    negativeNumbers.add(numberInt);
                }  else if (numberInt <= 1000){
                    returnValue += numberInt;
                }            
            }     
        }
        if (negativeNumbers.size() > 0){
            throw new RuntimeException("Negatives are not allowed" + negativeNumbers.toString());
        }
        return returnValue;
        //returns 0(default value) if no items in array
        //Returns sum of items if 1 or 2 numbers present
    }

}