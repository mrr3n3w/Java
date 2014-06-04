class Test implements Runnable{

Thread t;

public Test(){
t=new Thread(this);
t.start();
}

public void run(){
int int1 =1;
int int2 =2;
int count = 0;
while (int1 != int2) {
	int tp1c = int1 +1;
//textbox1.setText(""int1); // this is for testing.
	System.out.printf("count is %d\n", count);
	count++;
try
{
Thread.sleep( 1000);
}
catch( InterruptedException e )
{
}
}
}
public static void main(String arg[]){

new Test();
}

}
