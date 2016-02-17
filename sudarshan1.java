
public class sudarshan1 
{
public static void main (String[] args)
{
	System.out.println(sudarshan1.processExpression("123")+1);
}
static int processExpression(String exp)
{
	String ops = "+-/*";
	String digits = "0123456789";
	String num1 = "";
	String num2 = "";
	char currOp =  '?';
	for(int i=0; i<exp.length();i++)
	{
		if(digits.indexOf(exp.charAt(i))!= -1)
		{
			num2 = num2 + exp.charAt(i);
			
		}
		else if(ops.indexOf(exp.charAt(i))!= -1)
		{
			if(num1.length()== 0)
	{
		num1 =num2;
		num2 ="";
		
	}
	else
	{
		if(currOp == '+')
	
	{
	num1 = "" + (Integer.parseInt(num1)+ Integer.parseInt(num2));
}
		else if(currOp == '-')
		{
			num1 = "" + (Integer.parseInt(num1)- Integer.parseInt(num2));
		}
		else if (currOp == '*')
		{
			num1 = "" + (Integer.parseInt(num1)* Integer.parseInt(num2));
		}
		else if(currOp == '/')
		{
			num1 = "" + (Integer.parseInt(num1)/ Integer.parseInt(num2));
		}
		 num2 = "";
		 
	}
			currOp = exp.charAt(i);
		}
	}
	if (currOp == '?')
		{
		return Integer.parseInt(num1);
		
		}}}
	

	
		
	
	


