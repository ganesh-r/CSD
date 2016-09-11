package MavenTest.MavenTest;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.mockito.Mockito;


public class TestMessageTester extends TestCase
	{
		MessageDAO messageDAO;
		MessageService messageService;
		
		
		public void testInit(){
			messageDAO = new MessageDAO();
			messageService = Mockito.mock( MessageService.class );
			messageDAO.setMessageService( messageService );
			System.out.println("Invoked");
			messageService();
		}
		
		public void messageService()
			{
				List <Person> personList = new ArrayList <Person>();
				Person firstUser = new Person("Ganesh","gar@a-cti.com","9994040277");
				Person secondUser = new Person("Raju","raj@a-cti.com","9956755461");
				
				personList.add( firstUser );
				personList.add( secondUser );
				
				messageDAO.setPersonList( personList );
				
				Mockito.when(messageService.printMessage( firstUser )).thenReturn( "Hi" );
				Mockito.when(messageService.printMessage( secondUser )).thenReturn( "Hello" );
				
				printMessage();
				
			}
		
		public void printMessage()
			{
				List <Person> personList = messageDAO.getPersonList();
				for(Person message : personList){
					System.out.println(message.getName()+" has posted "+messageDAO.getMessageService().printMessage( message ));
				}
			}
	}
