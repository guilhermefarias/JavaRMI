package br.example.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.util.Scanner;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class NameClient {
	public static void main(String[] args) {
		try {
			int option = 10;
			Scanner s = new Scanner(System.in);
			IName names = (IName) Naming.lookup("//127.0.0.1:1079/NamesService");

			while(option != 0){
				System.out.println("What you want to do?");
				System.out.println("1 - Add name");
				System.out.println("2 - List name");
				System.out.println("3 - Remove name");
				System.out.println("0 - Exit");
				option = s.nextInt();

				if(option == 1){
					System.out.println("Enter the name you want to add?");
					String name = s.next();
					System.out.println(names.add(name));
				} else if(option == 2){
					System.out.println(names.list());
				} else if(option == 3){
					System.out.println("Enter the name you want to remove?");
					String name = s.next();
					System.out.println(names.delete(name));
				}
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}
}
