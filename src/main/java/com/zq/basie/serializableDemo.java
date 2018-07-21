package com.zq.basie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * 
 * 
 * @author Administrator
 *
 */
public class serializableDemo {

	
	 public static void main(String[] args) {
		
		 user user = new user();
		 user.setName("lay");
		 user.setAge(18);
		 System.out.println(user);
		 //
		 ObjectOutputStream oos= null;
		 
		 try {
			oos = new ObjectOutputStream(new FileOutputStream("tempfile"));
		    oos.writeObject(user);
		 
		 } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(oos ==null){
				try {
					oos.close();
				} catch (IOException e) {
				}
			}
		}
		 
		 //Read Obj from File
	        File file = new File("tempfile");
	        ObjectInputStream ois = null;
	        try {
	            ois = new ObjectInputStream(new FileInputStream(file));
	            user newUser = (user) ois.readObject();
	            System.out.println(newUser);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } finally {
	        	if(ois ==null){
					try {
			            ois.close();
					} catch (IOException e) {
					}
	        }
	 
	    }
		 
	}
	 
}
