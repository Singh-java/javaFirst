package MultiThreading;

class BlockState implements Runnable 
{
   String res1 = new String ("Shri Ram ");
   String res2 = new String ("Mohit Singh");
   String res3 = new String ("Last Person");
   //String res4 = new String ("Rohan Singh");
    public void run()
    {
        String name = Thread.currentThread().getName();
        if(name.equals("Student1"))
        {
            try
            {
                 Thread.sleep(3000);
                 synchronized(res1)
                 {
                    System.out.println("Student1 talk to  "+res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student1 met "+res2);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("Student1 hired "+res3);
                            Thread.sleep(3000);
                           
                        }
                    }
                 }
                 
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong plz check");
            }
        }
        else
        {
            try
            {
                 Thread.sleep(3000);
                 synchronized(res1)
                 {
                    System.out.println("Student2 talk to  "+res3);
                    Thread.sleep(3000);
                    synchronized(res3)
                    {
                        System.out.println("Student2 met "+res1);
                        Thread.sleep(3000);
                        synchronized(res3)
                        {
                            System.out.println("Student2 hired "+res2);
                            Thread.sleep(3000);
                            
                        }
                    }
                 }
                 
            }
            catch(Exception e)
            {
                System.out.println("Something went wrong plz check");
            } 
        }
    }
}

public class DeadLock {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub


        BlockState bt = new BlockState ();
        Thread t1 = new Thread (bt);
        Thread t2 = new Thread (bt);

        t1.setName("Student1");
        t2.setName("Student2");
        
        t1.start();
        t2.start();
	}

}
