package CentralTendencyPackage;

import java.util.Arrays;

/**
 *  The class {@code Central Tendency} contains methods for performing 
 *  measurement of the data distribution such as {@code Mean}, {@code Median}, 
 *  and {@code Mode}.
 * 
 *  <p>{@code NOTE:} This class is still in beta test.
 *  For bug and error occurrence, please leave a feedback to 
 *  {@link https://github.com/SRNM21/Central-Tendency-Package/issues/new}
 *
 *  @author  Niño Greg Gregorio
 *  @since   03/02/2023
 */
public class CentralTendency {

    /**
     * Returns {@code true} if the integer is even otherwise {@code false}.
     *
     * @param   a   the number to check for
     * @return {@code true} if the integer is even otherwise {@code false}
     */
    public static boolean isEven(int a){
        return a % 2 == 0;
    }

    /**
     * Returns rounded decimal value
     *
     * @param   a   a floating-point value to be rounded to a two decimal value
     * @return {@code true} if the integer is even otherwise {@code false}
     */
    public static double roundOffDecimal(double a) {
        return Math.round(a * 100.0) / 100.0;
    }

    /**
     * The mean is equal to the sum of all the values in the data set 
     * divided by the number of values in the data set.
     * 
     * @param dataSet data set
     * @return the sum of all the values in the data set divided by 
     * the number of values in the data set
     */
    public static int mean(int[] dataSet){
        int result = 0;
        for (int i : dataSet) result += i;
        return result / dataSet.length;
    }

    /**
     * The mean is equal to the sum of all the values in the data set 
     * divided by the number of values in the data set.
     * 
     * @param dataSet data set
     * @return the sum of all the values in the data set divided by 
     * th e number of values in the data set
     */
    public static double mean(double[] dataSet){
        double result = 0;
        for (double i : dataSet) result += i;
        return roundOffDecimal(result / dataSet.length);
    }

    /**
     * The median is the middle number in a sorted list of numbers
     * and can be more descriptive of that data set than the average
     * 
     * @param dataSet data set
     * @return the middle number in a sorted data set
     */
    public static int median(int[] dataSet){
        Arrays.sort(dataSet);
        int midpoint = dataSet.length / 2;

        if (isEven(dataSet.length))
            return (int)(dataSet[midpoint] + dataSet[midpoint - 1]) / 2;
        else 
            return dataSet[(int) Math.floor(dataSet.length / 2)];
    }

    /**
     * The median is the middle number in a sorted list of numbers
     * and can be more descriptive of that data set than the average
     * 
     * @param dataSet data set
     * @return the middle number in a sorted data set
     */
    public static double median(double[] dataSet){
        Arrays.sort(dataSet);
        int midpoint = dataSet.length / 2;
        double result = 0;

        if (isEven(dataSet.length))
            result = (double)(dataSet[midpoint] + dataSet[midpoint - 1]) / 2;
        else 
            result = dataSet[(int) Math.floor(dataSet.length / 2)];

        return roundOffDecimal(result);
    }

    /**
     * The mode is the most frequent score in the data set
     * 
     * @param dataSet data set
     * @return the most frequent score in the data set
     */
    public static String mode(int[] dataSet){
        int mode = 0;
        int frequency = 0;

        for (int i = 0; i < dataSet.length; i++){
            int currentFrequency = 0;

            for (int j = 0; j < dataSet.length; j++){
                if (dataSet[i] == dataSet[j]) currentFrequency++;
            }
            
            if (currentFrequency > frequency) {
                frequency = currentFrequency;
                mode = dataSet[i];
            }
        }
        
        return String.valueOf(mode + ", appeared " + frequency + " times");
    }
    
    /**
     * The mode is the most frequent score in the data set
     * 
     * @param dataSet data set
     * @return the most frequent score in the data set
     */
    public static String mode(double[] dataSet){
        double mode = 0;
        int frequency = 0;

        for (int i = 0; i < dataSet.length; i++){
            int currentFrequency = 0;

            for (int j = 0; j < dataSet.length; j++){
                if (dataSet[i] == dataSet[j]) currentFrequency++;
            }
            
            if (currentFrequency > frequency) {
                frequency = currentFrequency;
                mode = dataSet[i];
            }
        }
        
        if (frequency == 1)
            return "No mode";
        else 
            return String.valueOf(mode + ", appeared " + frequency + " times");
    }

    /**
     * The range is the difference between the largest and the 
     * smallest values in the data set
     *  
     * @param dataSet data set
     * @return  the difference between the largest and the 
     * smallest values in the data set
     */
    public static int range(int[] dataSet){
        return dataSet[dataSet.length - 1] - dataSet[0];
    }    

    /**
     * The range is the difference between the largest and the 
     * smallest values in the data set
     *  
     * @param dataSet data set
     * @return  the difference between the largest and the 
     * smallest values in the data set
     */
    public static double range(double[] dataSet){
        return roundOffDecimal(dataSet[dataSet.length - 1] - dataSet[0]);
    }
    
    /**
     * Returns the largest value in the data set
     *  
     * @param dataSet data set
     * @return  the largest value in the data set
     */
    public static int largest(int[] dataSet){
        Arrays.sort(dataSet);
        return dataSet[dataSet.length - 1];
    }

    /**
     * Returns the largest value in the data set
     *  
     * @param dataSet data set
     * @return  the largest value in the data set
     */
    public static double largest(double[] dataSet){
        Arrays.sort(dataSet);
        return dataSet[dataSet.length - 1];
    }

    /**
     * Returns the largest value in the data set
     *  
     * @param dataSet data set
     * @return  the largest value in the data set
     */
    public static int smallest(int[] dataSet){
        Arrays.sort(dataSet);
        return dataSet[0];
    }

    /**
     * Returns the largest value in the data set
     *  
     * @param dataSet data set
     * @return  the largest value in the data set
     */
    public static double smallest(double[] dataSet){
        Arrays.sort(dataSet);
        return dataSet[0];
    }

    /**
     * Returns the summation of all values in the data set
     * 
     * @param dataSet data set
     * @return the summation of all values in the data set
     */
    public static int sum(int[] dataSet){
        int result = 0;
        for (int i : dataSet) result += i;
        return result;
    }

    /**
     * Returns the summation of all values in the data set
     * 
     * @param dataSet data set
     * @return the summation of all values in the data set
     */
    public static double sum(double[] dataSet){
        double result = 0;
        for (double i : dataSet) result += i;
        return roundOffDecimal(result);
    }
}
