/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalyndach;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class HospitalyndaCh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        double medCharges = 0,labCharges = 0,hospitalCharges = 0,totalCost;
        String response = " ";
        do{
            if(checkForOverNight() == true)
            {
            System.out.println("Enter the cost of the hospital stay");
            hospitalCharges = in.nextDouble();
            }
            else{
                    hospitalCharges = 0;
                }
        System.out.println("Enter the meditation cost: ");
        medCharges = in.nextDouble();
        System.out.println("Enter the lab services cost: ");
        labCharges = in.nextDouble();
        totalCost = hospitalCharges + labCharges + medCharges;
        printTotal(totalCost);// Function
        System.out.println("Do you have another patient ? (y/n)");
        response = in.next();
        }while(response.equalsIgnoreCase("y"));
            }
        public static boolean checkForOverNight(){
            Scanner in = new Scanner (System.in);
            String response = "";
            System.out.println("Is this an Overnight stay (y/n)");
            response = in.next();
            if (response.equalsIgnoreCase("y")){
                return true;
            }else {
                return false;
            }
        }
        public static void printTotal(double totalCost){
            System.out.printf("The total cost for this patient is $%6.2f ",totalCost);
        }
    }
