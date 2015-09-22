/**
 *
 * @author Chad Weireter
 */


import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;



public class Lab04 {

 
    public static void main(String[] args) throws FileNotFoundException  {
        
        Scanner inFile = new Scanner(new FileReader("input.txt"));
        
        double x1, x2, x3, x4,x5;
        
      
        x1= inFile.nextDouble();
        x2= inFile.nextDouble();
        x3= inFile.nextDouble();
        x4= inFile.nextDouble();
        x5= inFile.nextDouble();
        
        double Mean;
        double Deviation;
        
        Mean = computeMean(x1,x2,x3,x4,x5);
        Deviation = computeStandardDeviation(x1,x2,x3,x4,x5);
        
        System.out.println("Mean of the 5 values is " + Mean);
        System.out.println("Standard deviation of the 5 values is " +Deviation);
        
      
    }
    
    public static double computeMean(double a, double b, double c, double d, double e)
    {
        double average;
        average = (a+b+c+d+e)/5;
        return(average);
    }
    
    public static double computeStandardDeviation(double a, double b, double c, double d, double e)
    {
        double avg = (a+b+c+d+e)/5;
        double v,w,x,y,z,sd;
        
        v = Math.pow(2.0, (a - avg));
        w = Math.pow(2.0, (b - avg));
        x = Math.pow(2.0, (c - avg));
        y = Math.pow(2.0, (d - avg));
        z = Math.pow(2.0, (e - avg));
        sd = Math.sqrt((v+w+x+y+z)/5);
        return(sd);
    }
    
}
