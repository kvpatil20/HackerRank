import java.util.*;
import java.io.*;

public class RemoveLargestConsecutiveNumber {
	
	static Integer max;
	static ArrayList<Integer> clone;
	static ArrayList<Integer> numList;

	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		String num = in.readLine();
		char[] number = num.toCharArray();
		numList = new ArrayList<Integer>();
		
		for(int i = 0;i<number.length;i++)
		{
			numList.add(Integer.parseInt(Character.toString(number[i])));
		}
		clone = new ArrayList<>(numList);
		//display(0,2);
		discardMaxConsecutiveInt();
		
	}
	public static void discardMaxConsecutiveInt()
	{
		
		max = Collections.max(clone);
		clone.remove(clone.indexOf(max));
		int index1 , index2;
		
		Integer tempMax= Collections.max(clone); 
		boolean isConsecutive = nextMax(tempMax);
		if(isConsecutive)
		{
			index1= numList.indexOf(max);
			max = Collections.max(clone);
			clone.remove(clone.indexOf(max));
			index2=numList.indexOf(max);
			display(index1,index2);
		}
		else
		{
			discardMaxConsecutiveInt();
			
		}
		
	}
	public static void display(int index1,int index2)
	{
		for(int i=0;i<numList.size();i++)
		{
			if((i==index1)|| (i==index2))
			{
				continue;
			}
			else
				System.out.print(numList.get(i).toString());
		}
	}
	
	public static boolean nextMax(Integer temp)
	{
		if((temp+1)==max)
		{
			return true;
		}
		return false;
	}
}
