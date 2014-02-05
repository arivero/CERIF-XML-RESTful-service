/**
 * 
 */
/**
 * @author danielebailo
 *
 */
package epos.cerif.webapi.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import javax.ws.rs.core.MediaType;

import epos.cerif.webapi.models.*;



// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//********** NEED SOME HELP?   GO HERE http://www.mkyong.com/webservices/jax-rs/jax-rs-queryparam-example/  */


//Sets the path to base URL + /hello
@Path("/search")
public class Search {
	
	// This method is called if TEXT_PLAIN is request
	//  @GET
	//  @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	//  public cfPers getcfPersXML() {
	//	  cfPers person=new cfPers();
	//	  person.query("parameters from get");
	//	  return person;
	//  }
	//
	//  // This method is called if XML is request
	//  @GET
	//  @Produces({MediaType.TEXT_XML})
	//  public cfPers getcfPersHTML() {
	//	  cfPers person=new cfPers();
	//	  person.query("parameters from get");
	//	  return person;
	//  }

	///     /search/cfPers?term=foo

	

	
	
	
	@Path("/cfPers")
	@GET	
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public CERIF getcfCERIFXML(	@QueryParam("term") String term	){
		CERIF cerifEntity=new CERIF();
		cerifEntity.CERIFcfPersQuery(term);
		return cerifEntity;
	}
	
	@Path("/cfPers")
	@GET
	@Produces({MediaType.TEXT_XML})
	public CERIF getcfCERIFHTML(	@QueryParam("term") String term	){
		CERIF cerifEntity=new CERIF();
		cerifEntity.CERIFcfPersQuery(term);
		return cerifEntity;
	}
}