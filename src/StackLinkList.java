/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usman_Ghani_Mughal
 */
public class StackLinkList {
    private NodeStack top;
    private int size;
    StackLinkList()
    {
        this.size=0;
        this.top=null;
    }
    public void push(NodeImplementation d)
    {
        NodeStack temp = new NodeStack(d);
        temp.NEXT = this.top;
        this.top=temp;
        this.size++;
    }
    public NodeImplementation pop()
    {
       NodeStack temp = this.top;
       this.top = this.top.NEXT;
       this.size--;
       return temp.DATA;
    }
    public void display()
    {
        if(this.top==null)
        {
         System.out.println("Soryy Stack is Empty");
        }
        else
        {
            NodeStack move=this.top;
            while(move!=null)
            {
                Node move1 = move.DATA.START;
                while(move1!=null)
                {
                    System.out.print("  "+move1.data);
                    move1 = move1.next;
                }
                System.out.println("**********************");
                move=move.NEXT;
            }
        }
    }
    public int getSize()
    {
        return this.size;
    }
}


