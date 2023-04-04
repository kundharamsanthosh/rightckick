package array;

import java.util.ArrayList;
import java.util.List;

public class array_list {
	public static void main(String[] args) {
		List<Object>array1=new ArrayList<Object>();
		array1.add("hellow");
		array1.add(10);
		array1.add("10.123");
		array1.add('h');
		array1.add("livetech");
		int array1length=array1.size();
		System.out.println("the array1length is :"+array1length);
		for(int i=0;i<=5;i++)
		{
			System.out.println(array1.get(i));
		}
		
	}

}
