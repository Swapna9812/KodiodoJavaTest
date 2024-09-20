package com.model;
import java.util.Scanner;
public class Q3Bank{

	int deposite;
	Scanner sc=new Scanner(System.in);
		public void deposite() {
			System.out.println("Enter Deposite Amount");
			int amount=sc.nextInt();
			
			if(amount >0) {
			deposite=deposite+amount;
			System.out.println("Deposite emp ="+deposite);
			}
			else {
				System.out.println("plese Enter positive number !!!");
			}
		}
		
		public static void main(String[] args) {
			
			Q3Bank dep=new Q3Bank();
			  dep.deposite();
		}
	}

	
