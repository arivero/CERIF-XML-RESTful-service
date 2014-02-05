/**
 * 
 */
/**
 * @author danielebailo
 *
 */
package epos.cerif.webapi.models;

//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.XmlElement;



// JAX-RS supports an automatic mapping from JAXB annotated class to XML and JSON
// Isn't that cool?
public class CERIFcfPers {
	private String cfBirthdate;
	private String cfGender;
	private String searchParams;


	public String getcfBirthdate() {
		return cfBirthdate;
	}
	public void setcfBirthdate(String birthdate) {
		this.cfBirthdate = birthdate;
	}

	public String getcfGender() {
		return cfGender;
	}
	public void setcfGender(String gender) {
		this.cfGender = gender;
	}

	public String getsearchParams() {
		return searchParams;
	}
	public void setsearchParams(String params) {
		this.searchParams = params;
	}

	public void query(String paramsForQuery){
		//here query is launched and properties of the class filled in
		this.setcfBirthdate("28/05/1978");
		this.setcfGender("m");
		this.setsearchParams(paramsForQuery);
	}


} 