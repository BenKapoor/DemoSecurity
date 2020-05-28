package eu.ensup.demosecurityjava13.lanceur;

import java.security.Provider;
import java.security.Security;

public class DemoProviders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Obtenir la liste des providers pour cette version de JRE
		Provider[] providers = Security.getProviders();
		
		// Obtenir des informaitons sur chaque Provider : Nom + Version
		for(Provider provider: providers) {
			System.out.println("Provider: " + provider.getName() + "version: " + provider.getVersion());
		}
		
	}

}
