
package org.com;

public class SampleJava {
	  static int count=0;
		public static void main(String[] args) {
			for (int i = 0; i <=20; i++) {
				if (i%2==0) {
					count=count+i;
					
				}
			}
			System.out.println(count);
		}
	}
