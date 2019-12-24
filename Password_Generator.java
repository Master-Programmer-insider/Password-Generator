import java.util.*;

public class PasswordGenerator
{
	static char[] GeekPassword(int len)
	{
		System.out.println("Generating Password : ");
		System.out.println("Your new Password is : \n");

		String capitalChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String simpleChars = "abcdefghijklmnopqrstuvwxyz";
		String number = "0123456789";
		String symbols = "!@#$%^&*_==-/.?<>";

		String values = capitalChars + simpleChars + number + symbols;

		Random rndmMethod = new Random();
		char[] password = new char[len];

		for(int i = 0; i < len; i++)
		{
			password[i] = values.charAt(rndmMethod.nextInt(values.length()));
		}
		return password;
	}

	public static void main(String[] args)
	{
		int length = 10;
		System.out.println(GeekPassword(length));
	}
}
