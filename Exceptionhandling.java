package com.chulin;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   try{
		          int  b[]=/*new int[4]*/ null;
		             b[2]=6;
		            int a=6;
		            int v=3;
		           int r=a/v;
		            System.out.println("answer is="+r);
		        }
		        catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
		            System.out.println("error");
		        }
		   /*
		        catch(ArrayIndexOutOfBoundsException e){
		            System.out.println("Array limited");
		            }
		            */
		   catch(Exception e) {
			 System.out.println("gg");
		   }
		        
		        finally{
		        System.out.println("Welcome to Online IDE!! Happy Coding :)");
		    }
		}
		}
