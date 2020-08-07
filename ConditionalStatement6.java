import java.util.*;
import java.io.*;
public class ConditionalStatement6 
{
	public static void main(String[] args) 
{
	char c = '+'; int x = 12, y=30;
	if (c=='+')
	{
		++y;
		System.out.println(y);
	}
	else if (c=='-')
	{
	--y;
	System.out.println(y);
	}
	else
	System.out.println("Invalid Input");

	}
}