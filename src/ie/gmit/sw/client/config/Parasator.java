package ie.gmit.sw.client.config;


public class Parasator { // class has basic set up for the parsing the xml doc
	public static final String CONF_FILE="config.xml";
	private String username;
	private String host;
	private int port;
	private String dir;
	
	
	public Parasator() {
		super();
	
	}

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "par [username=" + username +" host=" + host + ", port=" + port + ", dir =" + dir +"]";
	}
	
	
}
