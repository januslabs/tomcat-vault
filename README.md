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
http://vaultproject.io

Bintray:

Grab the latest binary (0.0.1) [here] (https://bintray.com/artifact/download/nandhusriram/tomcat-vault/org/januslabs/tomcat-vault/0.0.1/tomcat-vault.jar).

Building
==========
Java Version: 1.8

Basic Compile and Test
======================
$ mvn clean install

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
 TODO