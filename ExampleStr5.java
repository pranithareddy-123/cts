package com;

public class ExampleStr5 {

	public static void main(String[] args) {
		int len1,len2,i,flag=1;
		String s1="pranitha";
		String s2="pranitha";
		len1=s1.length();
		len2=s2.length();
		char Str1[]=s1.toCharArray();
		char Str2[]=s2.toCharArray();
		if(len1==len2)
		{
			for(i=0;i<len1;i++) {
				if(Str1[i]!=Str2[i]){
					flag=0;
					break;
					
				}
			}
		}
	
				else
				
					if(flag==1)
					{
						System.out.println("strings are equal");
					}
					else {
						System.out.println("strings are not equal");
					}
						
	}
	}

				
			

	


				
			
		

		
		
		
		

