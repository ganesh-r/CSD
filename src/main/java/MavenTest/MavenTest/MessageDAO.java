package MavenTest.MavenTest;

import java.util.List;

public class MessageDAO
	{
		public MessageService messageService;
		public List <Person> personList;
		
		public MessageService getMessageService()
			{
				return messageService;
			}
		public void setMessageService( MessageService messageService )
			{
				this.messageService = messageService;
			}
		public List <Person> getPersonList()
			{
				return personList;
			}
		public void setPersonList( List <Person> messages )
			{
				this.personList = messages;
			}
		
		
	}
