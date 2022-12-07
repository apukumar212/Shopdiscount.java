package com.pack1;

/*Q-A shop will give discount of 10% it the cost of purchased quantity is equal to (or) more than 100. Take a parameterized method which gives the quantity (units)
suppose, One unit will cost 100. judge and print Total cost for user*/
public class Shopdiscount
{
void bill(int units)
{
	int finalcost=units*100;
	if(finalcost>=1000)
	{
		int discount=(finalcost*10)/100;
		System.out.println("YOUR FINAL BILL IS:"+(finalcost-discount));
		System.out.println("Congratulation!! You saved:"+discount+"/rs");
	}
	else
	{
		System.out.println("Your Final Bill is:"+finalcost);
		System.out.println("You will receive 10% discount if you purchase more:"+(100-finalcost)+"/rs");
	}
}

	public static void main(String[]args)
	{
		new Shopdiscount().bill(9);
	}
}
