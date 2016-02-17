
public class sudarshan1 
{
public static void main (String[] args)
{
	System.out.println(sudarshan1.processExpression("123"));
}
static int processExpression(String exp)
{
	String op = "+-/*";
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
		else if(op.indexOf(exp.charAt(i))!= -1)
		{
			if(num1.length()== 0)
	{
		num1 =num2;
		num2 ="";
		
	}
	else
	{
	

	
		
	
	


