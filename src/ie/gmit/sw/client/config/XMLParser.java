package ie.gmit.sw.client.config;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLParser {
	private Parasator par;

	public XMLParser(Parasator par) {
		super();
		this.par = par;
	}
	
	public void init() throws Throwable{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(Parasator.CONF_FILE);
		
		
		
		Element root = doc.getDocumentElement(); //Get the root of the node tree
		NodeList children = root.getChildNodes(); 
		
		for (int i = 0; i < children.getLength(); i++){ //Loop over the child nodes
			Node next = children.item(i); //Get the next child
			
			if (next instanceof Element){ //Check if it is an element node. There are 12 different types of Node
				Element e = (Element) next; //Cast the general node to an element node
				
				if (e.getNodeName().equals("client-config")){ //Check if it is the element <database>
					NamedNodeMap atts = e.getAttributes(); //Get the attributes as a map of name/value pairs
					
					for (int j = 0; j < atts.getLength(); j++){ //Look over the attributes. This is similar to looping over a ket set in a Map
						if (atts.item(j).getNodeName().equals("username")){ //If host="127.0.0.1"
							par.setUsername(atts.item(j).getNodeValue()); //Update the contex object
						}else if  (atts.item(j).getNodeName().equals("host")){
							par.setUsername(atts.item(j).getNodeValue());
						}else if (atts.item(j).getNodeName().equals("port")){ //Any port in a storm...
							par.setPort(Integer.parseInt(atts.item(j).getNodeValue())); //Update the contex object
						}else if (atts.item(j).getNodeName().equals("schema")){ //Check for the schema
							par.setHost(atts.item(j).getNodeValue()); //Update the contex object
						}
					}//for loop	
				}
			}
		}		
	}

	public Parasator getPar() {
		return par;
	}

	public void setPar(Parasator par) {
		this.par = par;
	}
	
	

}
