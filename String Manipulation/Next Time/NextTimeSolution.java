
import java.util.*;

class NextTime {
    public static HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    
    public static void main(String args[])
    {
    	NextTime ob1 = new NextTime();
    	String s = ob1.solution("14:56");
    	System.out.println(s);
    }
    public String solution(String S) {
        
    	
        
        for(int i=0;i<S.length();i++)
		{
			char ch = S.charAt(i);
			if(ch==':')
			    continue;
		    if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
        
		int hh = Integer.parseInt(Character.toString(S.charAt(0))+Character.toString(S.charAt(1)));
		
		int mm = Integer.parseInt(Character.toString(S.charAt(3))+Character.toString(S.charAt(4)));
		
		NextTime ob = new NextTime();
		
		int arr[] = new int[2];
		arr = ob.nextNumber(hh,mm);
		
		while(!ob.checkDigitsMatch(arr[0],arr[1]))
		{
		    arr= ob.nextNumber(arr[0],arr[1]);
		  
		}
		
		String str_hh = Integer.toString(arr[0]);
		String str_mm = Integer.toString(arr[1]);
		if(str_hh.length()==1)
        {
            str_hh = "0"+str_hh;
        }
        if(str_mm.length()==1)
        {
            str_mm = "0"+str_mm;
        }
        
        return (str_hh+":"+str_mm);
		
	
		
		
    }
    
    public int[] nextNumber(int hh, int mm)
    {
        mm++;
			if(mm==60)
			{
				
				hh++;
				mm=0;
				if(hh==24)
				{
					hh=0;
				}
			}
		int hhmm[] =new int[2];
		hhmm[0]=hh;
		hhmm[1]=mm;
		return hhmm;
    }
    
    public boolean checkDigitsMatch(int hh,int mm)
    {
        String str_hh = Integer.toString(hh);
        String str_mm = Integer.toString(mm);
        
        if(str_hh.length()==1)
        {
            str_hh = "0"+str_hh;
        }
        if(str_mm.length()==1)
        {
            str_mm = "0"+str_mm;
        }
        
        HashMap<Character, Integer> clone = new HashMap<Character, Integer>();
		
		String time = str_hh+str_mm;
		for(int i=0;i<time.length();i++)
		{
			char ch = time.charAt(i);
		    if(!clone.containsKey(ch))
			{
				clone.put(ch, 1);
			}
			else
			{
				clone.put(ch, clone.get(ch)+1);
			}
		}
		
		
		return clone.equals(map);
		
    }
}
