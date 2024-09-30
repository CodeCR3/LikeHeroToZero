
import jakarta.inject.Named;
import jakarta.enterprise.context.*;

@Named
@RequestScoped 
public class User {

		private String name = "Wurst Salsa Lat";
		
		public User() {
			System.out.println("inininininininini");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
}
