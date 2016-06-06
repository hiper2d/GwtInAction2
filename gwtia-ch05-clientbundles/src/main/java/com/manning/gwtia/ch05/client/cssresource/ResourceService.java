package com.manning.gwtia.ch05.client.cssresource;

import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("CSSResourceService")
public interface ResourceService extends RemoteService {
    List<String> getThemes();
    HashMap<String, String> getTheme(String name);
}
