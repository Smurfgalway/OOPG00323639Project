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
		
		
		
		Element root = doc.getDocumentElement(); 
		NodeList children = root.getChildNodes(); 
		
		for (int i = 0; i < children.getLength(); i++){ 
			Node next = children.item(i); 
			
			if (next instanceof Element){ 
				Element e = (Element) next; 
				
				if (e.getNodeName().equals("client-config")){ 
					NamedNodeMap atts = e.getAttributes(); 
					
					for (int j = 0; j < atts.getLength(); j++){ 
						if (atts.item(j).getNodeName().equals("username")){
							par.setUsername(atts.item(j).getNodeValue()); 
						}
					}//for loop	
				}else if  (e.getNodeName().equals("server-host")){
					par.setHost(e.getFirstChild().getNodeValue());
				}else if (e.getNodeName().equals("server-port")){ 
					par.setPort(Integer.parseInt(e.getFirstChild().getNodeValue())); 
				}else if (e.getNodeName().equals("download-dir")){ 
					par.setDir(e.getFirstChild().getNodeValue()); 
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
