package CentralTendencyPackage;

public class test {
    
    public static void main(String[] args) {
        int[] intArr = new int[] {
            9, 10, 12, 13, 13, 13, 15, 15, 
            16, 16, 18, 22, 23, 24, 24, 25
        };

        System.out.println("mean: " + CentralTendency.mean(intArr));
        System.out.println("median: " + CentralTendency.median(intArr));
        System.out.println("mode: " + CentralTendency.mode(intArr));
        System.out.println("range: " + CentralTendency.range(intArr));
        System.out.println("largest: " + CentralTendency.largest(intArr));
        System.out.println("smallest: " + CentralTendency.smallest(intArr));
        System.out.println("sum: " + CentralTendency.sum(intArr));

        System.out.println();
        
        double[] doubleArr = new double[] {
            89.20, 98.58, 86.35, 93.54, 94.56, 87.41, 89.13, 92.45, 
            85.32, 86.7, 95.36, 86.78, 94.25, 87.68, 82.95, 99.63
        };

        System.out.println("mean: " + CentralTendency.mean(doubleArr));
        System.out.println("median: " + CentralTendency.median(doubleArr));
        System.out.println("mode: " + CentralTendency.mode(doubleArr));
        System.out.println("range: " + CentralTendency.range(doubleArr));
        System.out.println("largest: " + CentralTendency.largest(doubleArr));
        System.out.println("smallest: " + CentralTendency.smallest(doubleArr));
        System.out.println("sum: " + CentralTendency.sum(doubleArr));
    }   
}
