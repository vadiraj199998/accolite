package com.accolite.au.pratice;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Classcompany {
	public static void main(String[] args) {
		String cit;
		int p;
		System.out.println("Enter the number of Developers");
		Scanner inc = new Scanner(System.in);
		Scanner ini = new Scanner(System.in);
		p=ini.nextInt();
		
		Softdev c[]=new Softdev[p];
			
			
			for (int i=0;i<p;i++)
			{
				String a;
				int b;
				int c;
				String e;
				String f;
				String g;
				String h;
				String ios;
				String j;
				int k;
				int m;
				
				Scanner in = new Scanner(System.in);
				Scanner ino = new Scanner(System.in);
				System.out.println("input Employ name");
				a=in.nextLine();
				System.out.println("input Employ id ");
				b = in.nextInt();
				System.out.println("input Employ age");
				c = in.nextInt();
				System.out.println("input Employ age");
				c = in.nextInt();
				System.out.println("input Employ companyname");
				e = in.nextLine();
				System.out.println("input Employ state");
				f = in.nextLine();
				System.out.println("input Employ Town");
				g = in.nextLine();
				System.out.println("input Employ landmark");
				h = in.nextLine();
				System.out.println("input Employ pincode");
				ios = in.nextLine();
				System.out.println("input Employ Designation");
				j = in.nextLine();
				System.out.println("input Employ salary");
				k = in.nextInt();
				System.out.println("input Employ hike");
				m = in.nextInt();
				c[i]=new Softdev(a,b,c,e,f,g,h,ios,j,k,m);
				
				}
			}
			
		
		}
		
				
		
					
