package edu.ntuim.client;

import java.util.HashMap;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("patent")
public interface PatentService extends RemoteService {
	HashMap<String, String> getInfo(String patentId);
	HashMap<String, String> getParams(String patentId);
}
