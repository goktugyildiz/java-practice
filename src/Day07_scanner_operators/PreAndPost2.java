package Day07_scanner_operators;

public class PreAndPost2 {
	public static void main(String[] args) {
	
		int messages = 10;
		messages++;
		++messages;
		
		System.out.println("Messages: " +messages);
		
		int readMessages = --messages;
		System.out.println("ReadMessages: " +readMessages);
		System.out.println("Messages: " +messages);
		
		
		int unreadMessages = readMessages--;
		System.out.println("UnreadMessages: "+ unreadMessages);
		System.out.println("ReadMessages: "+ readMessages);
		
		int total = unreadMessages++ -readMessages--;
		System.out.println("UnreadMessages: "+ unreadMessages);
		System.out.println("ReadMessages: "+ readMessages);
		System.out.println("Total: "+total);
		
		int count =20;
		int count2 = 10;
		int totalCount = ++count + --count2;
		System.out.println("Count:"+count);
		System.out.println("Count2: "+ count2);
		System.out.println("Totalcount: "+totalCount);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
