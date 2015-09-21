
public class Login3rdParty {
	
	public static void main(String[] args){
		String url;
		url = "https://api2.iheart.com/api/v1/account/login3rdPartyexternalUuid=SDPUSc1411121523320232K%40uconnect.com&iheartradioversion=1.0.0&host=chrysler-tgt.auto.us&deviceName=chrysler-tgt&timeStamp=1425400761000&clienttype=auto&setCurrentStreamer=true&hash=fff102a274617ebc49893233aad922f9a17210c1&deviceType=chrysler-tgt.auto.us&osversion=13.48.3&deviceId=10&deviceid=1C3BDEBZ9DV000100";
		System.out.println("This list below will display what is contained in URL entered for: Login 3rd Party\n\n");
		System.out.println("deviceid   "+url.contains("deviceid || Host"));
		System.out.println("\nexternalUuid  "+url.contains("externalUuid"));
		System.out.println("\nhost  "+url.contains("host"));
		System.out.println("\ndeviceType  "+url.contains("deviceType"));
		System.out.println("\ndeviceId  "+url.contains("deviceId"));
		System.out.println("\niheartradioversion  "+url.contains("iheartradioversion"));
		System.out.println("\nsysId  "+url.contains("sysId"));
		System.out.println("\nuuid  "+url.contains("uuid"));
		System.out.println("\nclienttype  "+url.contains("clienttype"));
		System.out.println("\nsysinfo  "+url.contains("sysinfo"));
	}

}
