/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Azkar
 */
public interface ChatClient3IF extends Remote{

	public void messageFromServer(String message) throws RemoteException;

	public void updateUserList(String[] currentUsers) throws RemoteException;
	
}
