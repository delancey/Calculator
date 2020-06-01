public class Calculator {
    public static final int add(final String numbers){
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        // if(numbersArray.length >2){
        //     throw new RuntimeException("Up to 2 numbers separated by a comma (, ) are allowed");
        // } 
            //go through each number in array and convert to integer
        for (String number: numbersArray){
            if(!number.isEmpty()){
                //converts number String to int, adds returnValue
                returnValue += Integer.parseInt(number);
            //if not possible throw exception
            }                 
                   
        }
        return returnValue;
        //returns 0(default value) if no items in array
        //Returns sum of items if 1 or 2 numbers present
    }

}