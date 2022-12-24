package TP2;

import java.io.PrintWriter;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class DresseurClient {
    
	private String host;
	private int port;
	private Dresseur dresseur;
	
	public DresseurClient(String host,int port,Dresseur dresseur) {
		this.host = host;
		this.port = port;
		this.dresseur = dresseur;
	}
	
	
	public void run() {
		try {
			//Creation du socket de client et connexion au serveur
			Socket socket = new Socket(host,port);
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			//Ajouter les méthodes pour envoyer pv et type de Pokemon pour le combat
			for(int i = 0;i>dresseur.getEquipeActive().size();i++) {
				out.write(dresseur.getEquipeActive().get(i).getPv());
				out.write(dresseur.getEquipeActive().get(i).getPc());
				out.writeUTF(dresseur.getEquipeActive().get(i).getTypes().get(0));
				if(dresseur.getEquipeActive().get(i).getTypes().get(1) != null) {
					out.writeUTF(dresseur.getEquipeActive().get(i).getTypes().get(1));
				}
				}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}