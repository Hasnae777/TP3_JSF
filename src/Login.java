import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name="client";
	private String pass= "client";
	
	
	public Login(){
		this.name = "client" ;
		this.pass ="client";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPass() {
		return pass;
	}

	public String action(){
		String s = null;
	
		if(this.name.equals("client")&&this.pass.equals("client")){
			s= "client" ;
		}
		else{s="erreur";}
		
		return s;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
