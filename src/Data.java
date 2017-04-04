import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Data implements Serializable  {
	
	
	private static ArrayList<Data> list = new ArrayList<Data>();

	public ArrayList<Data> getList() {
		return list;
	}

	public void setList(ArrayList<Data> list) {
		this.list = list;
	}

	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom ;
	private int age ;
	
public Data(String nom , String prenom , int age){
	this.nom  = nom ; 
	this.prenom = prenom ; 
	this.age = age ;
	
}
public Data(){
	
	
}

public void addClient(Data c){
	this.list.add(c);
}
public String remplir(){
	Data d1 = new Data(this.nom , this.prenom , this.age);
	addClient(d1);
	return "client";
}
public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
