package org.januslabs;

import org.apache.tomcat.util.IntrospectionUtils.PropertySource;

import lombok.extern.java.Log;
import se.jhaals.Vault;
import se.jhaals.VaultResponse;

@Log
public class VaultPropertySource implements PropertySource {

  private Vault vault=null;
  
  /* Retrieves the secret from consul, by default key name begins with secret
   * expects Vault running locally and token retrieved from env named $VAULT_TOKEN
   * and address retrieved from $VAULT_ADDR
   * (non-Javadoc)
   * @see org.apache.tomcat.util.IntrospectionUtils.PropertySource#getProperty(java.lang.String)
   */
  @Override
  public String getProperty(String key)
  {
      if(key.startsWith("secret"))
      {
          log.info("Looking up a value from vault with the key " + key);
          vault=new Vault();
          
          VaultResponse result = vault.read(key);
          String value= result.getData().get("value");
          log.info("Lookup completed for the key "+ value);
          return value;
      }
      else
          return null;
  }

}
