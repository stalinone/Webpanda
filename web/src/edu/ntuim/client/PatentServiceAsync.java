package edu.ntuim.client;

import java.util.HashMap;
import com.google.gwt.user.client.rpc.AsyncCallback;


public interface PatentServiceAsync {
	void getInfo(String patentId, AsyncCallback<HashMap<String, String>> callback);
}
