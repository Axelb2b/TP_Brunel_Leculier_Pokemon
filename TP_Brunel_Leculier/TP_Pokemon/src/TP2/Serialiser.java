package TP2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialiser {
private int i;
public Serialiser() {


}
public int getI() {
	return this.i;
}
public void setI(int i) {
	this.i=i;
}

public void serialisation(Object objet) throws IOException {
	FileOutputStream fichier = new FileOutputStream("C:\\Users\\lluca\\Desktop\\POO\\dresseur.txt");

	ObjectOutputStream flux = new ObjectOutputStream(fichier);

	flux.writeObject(objet);
}}
