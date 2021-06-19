/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usman_Ghani_Mughal
 */
public class NodeStack {
    public NodeImplementation DATA;
    public NodeStack NEXT;
    NodeStack()
    {
       this.DATA=null;
       this.NEXT=null;
    }
    NodeStack(NodeImplementation d)
    {
        this.DATA=d;
        this.NEXT=null;
    }
}
