package Test;


import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class Test01
{	public static void main(String[] args)
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
			System.out.println( r.nextInt());
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
}