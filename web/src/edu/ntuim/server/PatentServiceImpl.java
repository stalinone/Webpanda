package edu.ntuim.server;

//import java.util.HashMap;

import java.util.HashMap;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ntuim.client.PatentService;
import ntu.im.bilab.panda.jacky.Patent;

@SuppressWarnings("serial")
public class PatentServiceImpl extends RemoteServiceServlet implements PatentService {
	public HashMap<String,String> getInfo(String patentId) {
		Patent patent = new Patent(patentId);
		patent.setInfo();
		return (HashMap<String,String>)patent.getInfo();
	}


}
