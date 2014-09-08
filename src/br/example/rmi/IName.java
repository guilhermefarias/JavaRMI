package br.example.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IName extends Remote {
	public String add(String add) throws RemoteException;
	public String delete(String add) throws RemoteException;
	public String list() throws RemoteException;
}
