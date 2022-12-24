package TP2;

import java.net.*;

import java.io.*;


public class Arene extends Thread{
	
	private int port;
	
	public Arene(int port) {
		this.port = port;
	}
	
	
	public void run() {
		try {
			//Création du socket server
			ServerSocket serverSocket = new ServerSocket(port);
			
			while (true) {
				//Acceptation de la connexion entrente d'un client
				Socket clientSocket = serverSocket.accept();
				
				//Creation d'un thread de client pour gérer la connexion avec ce client
				
				DresseurClientHandler ch = new DresseurClientHandler(clientSocket);
				
			
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}