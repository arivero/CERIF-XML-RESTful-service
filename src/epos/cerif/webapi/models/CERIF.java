package epos.cerif.webapi.models;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;



//imports for now() date method
import java.util.Calendar;
import java.text.SimpleDateFormat;


//import javax.xml.bind.annotation.XmlElement;

@XmlRootElement (name="CERIF")
public class CERIF {
	
	//attributes for xml init
	private String xmlns;
	private String xmlnsxsi;
	private String xsischemaLocation;
	private String release;
	private String date;
	private String sourceDatabase;	
	private CERIFcfPers cfPers=new CERIFcfPers(); //forse dovrei inizializzare la var nella resource
	public static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

	
	//setters and getters
	@XmlAttribute
	public String getXmlns() {
		return xmlns;
	}
	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}
	@XmlAttribute
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	@XmlAttribute
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@XmlAttribute
	public String getSourceDatabase() {
		return sourceDatabase;
	}
	public void setSourceDatabase(String sourceDatabase) {
		this.sourceDatabase = sourceDatabase;
	}
	public CERIFcfPers getcfPers() {
		return cfPers;
	}
	public void setcfPers(CERIFcfPers person) {
		this.cfPers = person;
	}
	@XmlAttribute(name="xmlns:xsi")
	public String getXmlnsxsi() {
		return xmlnsxsi;
	}
	public void setXmlnsxsi(String xmlnsxsi) {
		this.xmlnsxsi = xmlnsxsi;
	}
	@XmlAttribute(name="xsi:schemaLocation")
	public String getXsischemaLocation() {
		return xsischemaLocation;
	}
	public void setXsischemaLocation(String xsischemaLocation) {
		this.xsischemaLocation = xsischemaLocation;
	}
	

	
	//constructor
	public CERIF() {
		super();
		this.xmlns = "urn:xmlns:org:eurocris:cerif-1.5-1";
		this.xmlnsxsi = "http//www.w3.org/2001/XMLSchema-instance";
		this.xsischemaLocation="urn:xmlns:org:eurocris:cerif-1.5-1 	http://www.eurocris.org/Uploads/Web%20pages/CERIF-1.5/CERIF_1.5_1.xsd";
		this.release = "1.5";
		this.date = this.now();
		this.sourceDatabase = "EPOS catalogue";
	}

	
	
	//other methods
	public  String now() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		return sdf.format(cal.getTime());
		}
	


	public void CERIFcfPersQuery(String paramsForQuery) {
		this.cfPers.query(paramsForQuery);
	}
}
