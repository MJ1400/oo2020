class Thread1 extends Thread{  
 public void run(){  
   for (int i = 0; i <= 10; i++) {
       System.out.println("Thread1: " + i);
       try {
		sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   } 
 }  
}  
  
class Thread2 extends Thread{   
 public void run(){  
   for (int i = 10; i > 0; i--) {
       System.out.println("Thread2: " + i);
       try {
		sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   } 
 }  
}

class Thread3 extends Thread{  
 public void run(){  
   for (int i = 97; i <= 107; i++) {
       System.out.println("Thread3: " + (char)i);
       try {
		sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }
 }  
}  

class Thread4 extends Thread{  
 public void run(){  
  for (int i = 97; i <= 107; i++) {
       System.out.println("Thread4: " +(char)i);
       try {
		sleep(200);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
   }  
 }  
}  
  
 class TestMultitasking3{  
 public static void main(String args[]){  
  Thread1 t1=new Thread1();  
  Thread2 t2=new Thread2();
  Thread3 t3=new Thread3();   
  Thread4 t4=new Thread4(); 
  
  t1.start();  
  t2.start();
  t3.start(); 
  t4.start(); 
 }  
}  