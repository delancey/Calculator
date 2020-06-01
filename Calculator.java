public class Calculator {
    public static void add(final String numbers){
        String[] numbersArray = numbers.split(",");
        if(numbersArray.length >2){
            throw new RuntimeException("Up to 2 numbers separated by a comma (, ) are allowed");
        } else {
            //go through each number ain array and convert to integer
            for (String number: numbersArray){
                Integer.parseInt(number);
                //if not possible throw exception
            }
        }
    }

}