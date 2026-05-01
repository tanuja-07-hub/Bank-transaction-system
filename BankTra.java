import java.lang.*;
import java.util.*;
class Check{
Boolean check  ()
{
	int PN=1245;
Boolean k;
int i,c=0;
k=false;
Scanner s = new Scanner(System.in);
for(i=0;i<3;i++){
System.out.println("Enter pin");
int pn=s.nextInt();
if(PN==pn){
k=true;
break;
}
else{
	c++;
}
}
if(c==3){
	System.out.println("Blocked");
}
return k;
}
}

class Withdraw{
float withdraw(float ba){
System.out.println("Enter the amount");
int amount;
Scanner s=new Scanner(System.in);
amount=s.nextInt();
if(amount>0&&amount%100==0){
if(ba>amount){
System.out.println("Amount withdrawn"+amount);
ba=ba-amount;
System.out.println("Transaction Successful");
}
}
return ba;
}
}
class Payment{
float payment(float ba){
System.out.println("Enter the amount");
float amount;
Scanner s=new Scanner(System.in);
amount=s.nextFloat();
if(amount>0){
System.out.println("Payment successful");
ba=ba-amount;
}
return ba;
}
}
class Deposit{
float deposit(float ba){
System.out.println("Enter the amount");
int amount;
Scanner s=new Scanner(System.in);
amount=s.nextInt();
if(amount>0&&amount%100==0){
if(ba>amount){
System.out.println("Amount deposited");
ba=ba+amount;
}
}
return ba;
}
}
class Display{
float display(float ba){
System.out.println("Balance amount"+ba);
return ba;
}
}
class BankTra{
public static void main(String[]args){
int pn,cho;
boolean choice;
float ba=25000.0f;
Scanner s = new Scanner(System.in);
Check ch=new Check();
Boolean x = ch.check();
if(x==true){
while(true){
	System.out.println("1.Withdraw\n2.Payment\n3.Deposit\n4.Display");
System.out.println("Enter the choice");
cho=s.nextInt();
switch(cho){
case 1 : Withdraw w = new Withdraw();
		ba=w.withdraw(ba);
	break;
case 2 : Payment p = new Payment();
	 	ba=p.payment(ba);
	break;
case 3 : Deposit d = new Deposit();
		ba=d.deposit(ba);
	break;
case 4 : Display di = new Display();
		ba= di.display(ba);
	break;
case 5 : System.exit(0);
default: System.out.println("Invalid choice");
	break;
}
}
}
}
}