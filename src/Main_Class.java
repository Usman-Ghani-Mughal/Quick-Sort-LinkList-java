
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *1
 * @author Usman_Ghani_Mughal
 */
public class Main_Class {
    public static void main(String args[])
    {
        Scanner take_input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        NodeImplementation obj=new NodeImplementation();
        NodeImplementation objj=new NodeImplementation();
        int ch,val;
        while(true)
        {
            System.out.println("\nPress 1 for insert");
            System.out.println("Press 7 for inset at last");
            System.out.println("Press 2 for display");
            System.out.println("Press 3 for put in satck");
            System.out.println("Press 4 for show stack");
            System.out.println("Press 5 for Sort");
            ch=take_input.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter the value you want to add for l1 : ");
                    val=take_input.nextInt();
                    obj.insertionAtFirst(val);
//                    System.out.print("Enter the value you want to add for l2 : ");
//                    val=take_input.nextInt();
//                    objj.insertionAtFirst(val);
                    break;
                }
                case 2:
                {
                    obj.showList();
                    //System.out.println("_*_*_*_*");
                   // objj.showList();
                    break;
                }
                case 3:
                {
                    obj.put_stack(objj);
                    obj.put_stack(obj);
                    break;
                }
                case 4:
                {
                    obj.displayStack();
                    break;
                }
                case 5:
                {
                    obj.quickSort();
                    break;
                }
                case 6:
                {
                    NodeImplementation.result.showList();
                    break;
                }
                case 7:
                {
                    System.out.print("Enter the value you want to add for l1 : ");
                    val=take_input.nextInt();
                    obj.insertionAtLast(val);
                    break;
                }
                default:
                {
                    System.out.println("You Gave Wrong Input");
                }
            }
        }
    }
}
