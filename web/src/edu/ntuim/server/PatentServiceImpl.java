package edu.ntuim.server;

//import java.util.HashMap;

import java.util.HashMap;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import edu.ntuim.client.PatentService;
import ntu.im.bilab.panda.jacky.Patent;

@SuppressWarnings("serial")
public class PatentServiceImpl extends RemoteServiceServlet implements
		PatentService {
	private static Patent patent;
	private boolean patent_mutex = false;

	public HashMap<String, String> getInfo(String patentId) {
		//Patent patent = new Patent(patentId);
		if (patent == null || patent.getId() != patentId) {
			patent = new Patent (patentId);
			System.out.println("newed");
		}
		//patent.setInfo();
		return (HashMap<String, String>) patent.getInfo();
	}

	public HashMap<String, String> getParams(String patentId) {
		//Patent patent = new Patent(patentId);
		if (patent == null || patent.getId() != patentId) {
			patent = new Patent (patentId);
			System.out.println("newed");
		}
		//patent.setParams();
		return (HashMap<String, String>) patent.getParams();
	}

}
