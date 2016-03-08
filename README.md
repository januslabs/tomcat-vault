<a href='https://bintray.com/nandhusriram/tomcat-vault/tomcat-vault/_latestVersion'><img src='https://api.bintray.com/packages/nandhusriram/tomcat-vault/tomcat-vault/images/download.svg'></a>

Vault for your Tomcat
================================
Tomcat vault is an utility that retrieves secrets at  runtime from the vault. Tomcat Vault is implemented using HashiCorp's Vault.

TODO: Wiki page


Required Frameworks
===================
Vault Client

Installation
=============
The easiest way to get started with this starter project is to fork, clone or download from the link below.

git clone https://github.com/januslabs/tomcat-vault.git 

You will also need to install Vault. This starter project assumes that you have a basic understanding of Vaults's operations.

http://vaultproject.io

Bintray:

Grab the latest binary (0.0.1) [here] (https://bintray.com/artifact/download/nandhusriram/tomcat-vault/org/januslabs/tomcat-vault/0.0.1/tomcat-vault-0.0.1.jar).

Building
==========
Java Version: 1.8

Basic Compile and Test
======================
$ mvn clean install package

###Maven:

```xml

<dependencies>
    <dependency>
     	<groupId>org.januslabs</groupId>
		<artifactId>tomcat-vault</artifactId>
		<version>0.0.1</version>
    </dependency>
   
</dependencies>

<repositories>
    <repository>
        <snapshots>
            <enabled>false</enabled>
        </snapshots>
        <id>central</id>
        <name>bintray</name>
        <url>http://jcenter.bintray.com</url>
    </repository>
</repositories>
```
Configuration
=============
 
Please update the catalina.properties to include the property source like this.
 
catalina.properties:
====================
 
org.apache.tomcat.util.digester.PROPERTY_SOURCE=org.januslabs.VaultPropertySource
 
Secret Lookup Example
======================
 
 Looking up the  secret from Vault  for tomcat manager user.
 
###tomcat-users.xml:
 
 ```xml
 
<user username="manager" password="${secret/manager/password}" roles="tomcat,manager-gui"/>
 
 ```
 