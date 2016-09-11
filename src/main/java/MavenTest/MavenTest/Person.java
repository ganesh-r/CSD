package MavenTest.MavenTest;

public class Person
	{
		String name;
		String email;
		String phone;
		
		public Person(String name, String email, String phone){
			this.name = name;
			this.email = email;
			this.phone = phone;
		}
		
		public String getName()
			{
				return this.name;
			}
		
		public String getEmail()
			{
				return this.email;
			}
		
		public String getPhone()
			{
				return this.phone;
			}
		
	}
