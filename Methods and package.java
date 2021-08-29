/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package tasks;

import java.util.Scanner;

/**

 *

 *

 */

public class Tasks {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // TODO code application logic here

        int mins;

        int years;

        int days;

        System.out.println("Enter no. of mins.");

        Scanner s = new Scanner(System.in);

        mins = s.nextInt();

        years = mins/525600;

        days = mins%525600;

        System.out.print("years :"+years);

        System.out.println("\tdays :"+days);

    }

    

}
