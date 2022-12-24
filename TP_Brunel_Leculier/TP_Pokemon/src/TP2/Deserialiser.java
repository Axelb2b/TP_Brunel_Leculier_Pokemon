package TP2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialiser {
private int i;
public Deserialiser() {


}
public int getI() {
	return this.i;
}
public void setI(int i) {
	this.i=i;
}

public Object deserialisation() throws IOException, ClassNotFoundException {
	FileInputStream fichier = new FileInputStream("C:\\Users\\lluca\\Desktop\\POO\\dresseur.txt");

	ObjectInputStream flux = new ObjectInputStream(fichier);

	Object objet = (Object) flux.readObject();
	
	return objet;
}}