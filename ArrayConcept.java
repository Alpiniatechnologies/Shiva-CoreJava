package javapackage;


public class ArrayConcept 
{
	/*
	ArrayConcept() // Not only constructor i can use method also
	{
		int arr[];
		arr = new int[10000]; // 1st way
		
		int arr1[] = new int[5000]; // 2nd way  "(BEST WAY)"
		
		int arr2[] = {5,6,9,4,9,8,7,3,5,60}; // 3rd way
		
		int arr3[] = new int[]{3,4,9,6,8,6,9}; // 4th way
		
		
		String s = "Java is Awesome";
		
		System.out.println("arr Length===>"+arr.length);  ]
		System.out.println("arr1 Length===>"+arr1.length);
		System.out.println("arr2 Length===>"+arr2.length);
		System.out.println("arr3 Length===>"+arr3.length);  // These are "Length Variable".
		
		System.out.println("arrString Length===>"+s.length()); // For String we need to use "length()method".
	}	
	public static void main(String[] args) 
	{
		new ArrayConcept();		
	}
	*/
	
	boolean meth2(int arr[])
	{
		if(arr[0]!=2 && arr[1]!=3)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}
	public static void main(String[] args) 
	{
		ArrayConcept obj = new ArrayConcept();
		int arr[] = {2,3};
		boolean result = obj.meth2(arr);
		System.out.println(result);
	}
}
