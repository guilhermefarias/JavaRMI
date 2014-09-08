package br.example.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class NameImplement extends UnicastRemoteObject implements IName {
	ArrayList names = new ArrayList();

	protected NameImplement() throws RemoteException {
		super();
	}

	public String add(String name) throws RemoteException {
		this.names.add(name);
		return "Added successfully!";
	}

	public String delete(String name) throws RemoteException {
		this.names.remove(name);
		return "Successfully removed!";
	}

	public String list() throws RemoteException {
		return this.names.toString();
	}
}
