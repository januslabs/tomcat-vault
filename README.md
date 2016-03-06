Vault for your Tomcat
================================
Tomcat vault is an utility that retrieves the password runtime from the vault. Vault is a Hashicorp product for managing secrets.

TODO: Wiki page


Required Frameworks
===================
Vault Client

Installation
=============
http://vaultproject.io

Bintray:

Grab the latest binary (0.0.1) [here] ().

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