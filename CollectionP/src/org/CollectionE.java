package org;
import java.util.*;

public class CollectionE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList();
		arr.add(34);
		arr.add(89);
		ArrayList<Integer> brr=new ArrayList();
		brr.add(100);
		brr.add(101);
		arr.addAll(brr);
		System.out.println(arr);
		arr.remove(2);
		System.out.println(arr);

	}

}
