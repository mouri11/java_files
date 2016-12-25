/* Implement the Producer-Consumer concept using synchronized and avoiding deadlock.
 */
import java.io.*;
import java.util.*;
class Queue
{
    int a;
    //int arr[];//=new int[2];
    boolean value=false;
    synchronized int get()
    {
	while(!value){
	    try{
		wait();
	    }
	    catch(InterruptedException e){
		System.out.println("InterruptedException caught!!");
	    }
	}
	value=false;
	int i=0;
	System.out.println(a+" is consumed!!");
	notify();
	return a;
    }
    synchronized void put(int n)
    {
	int i=0;
	while(value){
	    //if(i>=arr.length)System.out.println("Queue is full!!");
	    try{
		wait();
	    }	
	    catch(InterruptedException e){
		System.out.println("InterruptedException caught!!");
	    }
	}
	a=n;
	System.out.println(n+" is produced!!");
	value=true;
	notify();
    }
}
class Producer implements Runnable
{
    Queue q;
    Producer(Queue q)
    {
	this.q=q;
	new Thread(this,"Producer").start();
    }
    public void run()
    {
	int i=0;
	while(i<=10){
	    q.put(i++);
	}
    }
}
class Consumer implements Runnable
{
    Queue q;
    Consumer(Queue q)
    {
	this.q=q;
	new Thread(this,"Consumer").start();
    }
    public void run()
    {
	int i=0;
	while(true)q.get();
    }
}
class prodCon
{
    public static void main(String[]args)
    {
	Queue q=new Queue();
	Producer p=new Producer(q);
	Consumer c=new Consumer(q);
	Thread pThread=new Thread(p,"Producer");
	Thread cThread=new Thread(c,"Consumer");
	/*pThread.start();
	cThread.start();
	/*new Producer(q);
	new Consumer(q);*/
	System.out.println("Press Ctrl+C to continue...");
    }
}

