package com.ktech.structure.structural;

public class BinaryGap {

	public static void main(String[] args) {
		BinaryGap binaryGap = new BinaryGap();		
		int num = binaryGap.solution(32);
		System.out.println(num);
	}
	
	public int solution(int N) {
    Integer gap = 0;
	Integer gap1 = 0;
	Integer index2 = 0;
	int index1 = 0;
	String str = intToBinary(N);
	System.out.println(str);
	for (int i = 0; i < str.length(); i++) {
		index1 = str.indexOf('1',index2);
		index2 = str.indexOf('1',index1+1);
		gap = index2-(index1+1);
		if(gap > gap1) {
			gap1 = gap;
		}
		
	}
	return gap1;
	}
	private String intToBinary(int n){
        String str="";
        while(n > 0){
            str = ((n%2==0)?"0":"1")+str;
            n = n/2;
        }
        return str;
    }

}
