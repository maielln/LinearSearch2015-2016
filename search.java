public class search
{
	private int[] a;
	private int num;
	public search(int[] b, int val)
	{
		a = b;
		num = val;
	}
	public int LinearSearchInt()
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == num)
				return i;
		}
		return -1;
	}
	public int LinearSearchString(String[] b, String phrase)
	{
		for(int i = 0; i < b.length; i++)
		{
			if(b[i].equals(phrase))
				return i;
		}
		return -1;
	}
}