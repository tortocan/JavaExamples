package com.lynda.upandrunningwithjava;
/**
 * 
 * @author george
 * You can pass argumets to your application with eclipse in Run Configuration\Arguments tab
 * the args must be delimited by space or wraped in quotes. 
 */
public class ArgsPassing {
	public static void main(String[] args) {
		System.out.println("Number of args: " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
