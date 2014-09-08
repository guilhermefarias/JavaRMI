package br.example.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class NameServer {

	public NameServer() {
		try {
			LocateRegistry.createRegistry(1079); // Running at port 1079
			IName names = new NameImplement();
			Naming.rebind("rmi://127.0.0.1:1079/NamesService", names);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new NameServer();
	}
}
