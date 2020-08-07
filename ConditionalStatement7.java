import java.util.*;
import java.io.*;
public class ConditionalStatement7 
{
	public static void main(String[] args) 
{
	char ch = 'Z';
	switch(ch)
	{
	case 'a':
	case 'A':
	System.out.println("First Letter");break;
	case 'z':
	case 'Z':
	System.out.println("Last Letter");break;
	default:
	System.out.println("Letter");break;
	}
}
}