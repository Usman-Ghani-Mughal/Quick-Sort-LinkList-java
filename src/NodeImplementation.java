/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usman_Ghani_Mughal
 */
class NodeImplementation
{
    Node START;
    Node Last;
    int SIZE;
    StackLinkList stack;
   static NodeImplementation result = new NodeImplementation();
    NodeImplementation()
    {
     this.START=null;
     this.SIZE=0;
     this.stack= new StackLinkList();
     this.Last = null;
    }
    public void insertionAtLast(int data)
    {
       Node temp=new Node(data);
        if(START==null)
        {
            START=temp;
            Last = temp;
            SIZE++;
        }
        else
        {
            this.Last.next = temp;
            temp.pre = this.Last;
            this.Last = temp;
//            Node move=START;
//            while(move.next!=null)
//            {
//                move=move.next;
//            }
//            move.next=temp;
//            temp.pre=move;
              SIZE++;
        }
    }
    public void insertionAtFirst(int data)
    {
        Node temp=new Node(data);
        if(START==null)
        {
            
            START=temp;
            Last=temp;
            SIZE++;
        }
        else
        {
            
            temp.next=START;
            START.pre=temp;
            START=temp;
           SIZE++;
        }
    }
    public void insertionAtPosition(int da,int pos)
    {
        
        if(pos==1)
        {
            this.insertionAtFirst(da);
        }
        else if(pos==this.SIZE+1)
        {
            this.insertionAtLast(da);
        }
        else if((pos>1)&&(pos<=this.SIZE))
        {
            Node t=new Node(da);
            Node temp=this.START;
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next=t;
            this.SIZE++;
            System.out.println("=>*****Congragulation Data is Inserted*****<=");
        }
        else
        {
            System.out.println("Sorry!!!!!!! you chose wrong Position!!!!");
        }
    }
    public void deletionAtLast()
    {
        if(this.START==null)
        {
            System.out.println("=>!!!!! Sorry list is alredy Empty !!!!!<=");
        }
        else if(this.SIZE==1)
        {
            this.START=null;
            this.SIZE--;
            System.out.println("=>*****Congragulation Data is Deleted*****<=");
        }
        else
        {
            Node temp=this.START;
            for(int i=1;i<this.SIZE-1;i++)
            {
                temp=temp.next;
            }
            temp.next=null;
            this.SIZE--;
            System.out.println("=>*****Congragulation Data is Deleted*****<=");
        }
    }
    public void deletionAtfirst()
    {
        if(this.START==null)
        {
            System.out.println("Sorry!!!!!! list is already empty!!!!!!");
        }
        else
        {
            this.START=this.START.next;
            this.SIZE--;
            System.out.println("=>*****Congragulation Data is Deleted*****<=");
        }
    }
    public void deletionAtPos(int pos)
    {
        if(this.START==null)
        {
            System.out.println("Sorryy!!!!! lis is alredy Empty!!!!!");
        }
        else if(pos==1)
        {
            this.deletionAtfirst();
        }
        else if(pos==this.SIZE)
        {
            this.deletionAtLast();
        }
        else if(pos>1&&pos<this.SIZE)
        {
            Node temp=this.START;
            int i=2;
            while(i!=pos)
            {
                temp=temp.next;
                i++;
            }
           temp.next=temp.next.next;
            this.SIZE--;
            System.out.println("=>*****Congragulation Data is Deleted*****<=");
        }
        else
        {
            System.out.println("=>!!!!!Sorry you chosse Wrong position for Deletion!!!!!<=");
        }
    }
    public boolean isEmpties()
    {
        return this.START==null;
    }
    public void showList()
    {
         Node temp;
        temp=this.START;
        if(this.isEmpties())
        {
            System.out.println("=>!!!! List is empty !!!!<=") ;
        }
        else
        {
          
           while(temp!=null)
           {
               System.out.print(" "+temp.data);
               temp=temp.next;
           }
           
        }
        
    }
    public int  getSize()
    {
        return this.SIZE;
    }
    public void put_stack(NodeImplementation list)
    {
        this.stack.push(list);
    }
    public void displayStack()
    {
        this.stack.display();
    }
    public void quickSort() {
        this.stack.push(this);
        Node left =null;
        Node right =null;
        Node pivot =null;
        Node start_temp;
        Node last_temp;
        while(this.stack.getSize()!=0)
        {
            NodeImplementation temp = this.stack.pop();
            if(temp.SIZE>1)
            {
                left = temp.START;
                start_temp = temp.START;
                
                right = temp.Last;
                last_temp = temp.Last;
                
                pivot = temp.START;
            System.out.println("\n Staring :*** ");    
            System.out.println(" left : "+left.data);
            System.out.println(" Right : "+right.data);
            System.out.println(" Pivot : "+pivot.data);
            while(left!=right)
            {
                  while(pivot.data <= right.data && right!=pivot)
                {
                    right = right.pre;
                }
                if (pivot == right) {
               // return;
                }
                else if (pivot.data > right.data) {
                int temp_d;
                temp_d = pivot.data;
                pivot.data = right.data;
                right.data = temp_d;
                pivot = right;
                }
                while (left.data <= pivot.data && left!=pivot) {
                left = left.next;
                }
                if (left == pivot) {
               // return;
                System.out.println("Gya tha");
                }
                else if ( pivot.data < left.data) {
                int temp_d;
                temp_d = pivot.data;
                pivot.data = left.data;
                left.data = temp_d;
                pivot = left;
                } 
            }
             
            temp.showList();
            System.out.println(" left : "+left.data);
            System.out.println(" Right : "+right.data);
            System.out.println(" Pivot : "+pivot.data);
            
            if(pivot==start_temp)
            {
                System.out.println("Yes for if pivot is at one");
                
                NodeImplementation l1 = new NodeImplementation();
                l1.insertionAtFirst(pivot.data);
                this.stack.push(l1);
                
                NodeImplementation l3 = new NodeImplementation();
                while(pivot!=last_temp)
                {
                    pivot = pivot.next;
                    l3.insertionAtLast(pivot.data);
                }
            this.stack.push(l3);
                
            }
            else
            {
              NodeImplementation l1 = new NodeImplementation();
            while(start_temp!=pivot)
            {
                l1.insertionAtLast(start_temp.data);
                start_temp = start_temp.next;
            }
            this.stack.push(l1);
            
            NodeImplementation l2 = new NodeImplementation();
            l2.insertionAtFirst(pivot.data);
            this.stack.push(l2);
            
            NodeImplementation l3 = new NodeImplementation();
            while(pivot!=last_temp)
            {
                l3.insertionAtLast(pivot.next.data);
                pivot = pivot.next;
            }
            this.stack.push(l3);  
            }
            
            System.out.println("+++_TEMP_+++");
            temp.showList();
            System.out.println("+++_TEMP_+++");
             
        }
            else
            {
                if(temp.SIZE==1)
                {
                    System.out.println("this is single : "+temp.START.data);
                    result.insertionAtFirst(temp.START.data);
                }
            }
        }
    }
}


