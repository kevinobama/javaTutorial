package kevinGates;

import java.util.HashMap;
import java.util.Map;

public class SettingsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> robotsHash = new HashMap<String, String>();
		robotsHash.put("robotName", "one");
		robotsHash.put("strategy", "two");
		robotsHash.put("status", "run");
		
		echo(settingsBodyHtml(robotsHash,"kevin"));
	}
	
	public static String settingsBodyHtml(Map<String, String> robotsHash,String userName) {		
		StringBuilder tbody = new StringBuilder();
		tbody.append("<tr>");
		tbody.append("<th scope=\"row\">"+robotsHash.get("robotName")+"</th>");
		tbody.append("<td>"+robotsHash.get("robotName")+"</td>");
		tbody.append("<td>"+robotsHash.get("robotName")+"</td>");
		tbody.append("<td width=\"15%\"><a href=\"/settings/"+userName+"/"+robotsHash.get("robotName")+"?block=strategy\" class=\"btn btn-info btn-sm\"><span class=\"glyphicon glyphicon-edit\"></span> 编辑</a> </td>");
		tbody.append("<td width=\"15%\"><a href=\"/settings/"+userName+"/"+robotsHash.get("robotName")+"?block=monitor\" class=\"btn btn-info btn-sm\"> <span class=\"glyphicon glyphicon-edit\"></span> 编辑</a></td>");
		tbody.append("<td width=\"20%\"> ");
		tbody.append("<a href=\"/settings/updateString/"+userName+"_"+robotsHash.get("robotName")+"_status_set/run\" class=\"btn btn-success\">运行</a>");
		tbody.append("<a href=\"/settings/updateString/"+userName+"_"+robotsHash.get("robotName")+"_status_set/pause\" class=\"btn btn-warning\">暂停</a>");
		tbody.append("<a href=\"/settings/updateString/"+userName+"_"+robotsHash.get("robotName")+"_status_set/stop\" class=\"btn btn-danger\">终止</a>");
		tbody.append("</td>");

		tbody.append("</tr>");
		
		return tbody.toString();
	}
	
	public static void echo(Object any) {
		System.out.println(any);
	}
		
}
