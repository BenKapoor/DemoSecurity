package eu.ensup.demosecurity.lanceur;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Provider.Service;
import java.security.PublicKey;
import java.security.Security;

public class DemoProviderSunJCE {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Obtenir un fournisseur de sécurité particulier
		Provider provider = Security.getProvider("SunJCE");
		
		// Obtenir des informations sur ce fournisseur
		for(Service service: provider.getServices()) {
			System.out.println("\t" + service.getType() + " " + service.getAlgorithm() + "\t -----> Class :"
					+ service.getClassName());
		}
		
		
	}

}
