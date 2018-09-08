Air Traffic Control system (ATCS) Quickstart


REQUIREMENTS
------------

JDK 1.8
Any Application server ( wildfly-10.1.0.Final)


CONTENTS
--------

This sample zip contains:

    /readme.txt - this file
    /pom.xml - maven build files to compile and run the test code manually 
    /src - example code to execute ATCS APIs


DOCUMENTATION & SUPPORT
-----------------------
Sample Application is deployed on AWS cloud 

Demo Applcation deployed:http://ec2-13-127-164-214.ap-south-1.compute.amazonaws.com:8080/
or 
13.127.164.214:8080


RUNNING THE EXAMPLE
-------------------

1. Unzip the files contained in the ATCS.zip file to a folder on you hard drive.  
2. From the command line, run the build using maven
    a) "ant mvn clean install" to create required jar file
3. deploye required jar to application server
	a) copy ROOT.jar from target folder to {wildfly_Home)\standalone\deployments\
	b) start app server using command ./standalone.sh --server-config=standalone.xml & disown

4. url for application : http://localhost:8080/index.html

REST endPoints
--------------------- 

GET : http://localhost:8080/rest/atcs/aircrafts
DELETE : http://localhost:8080/rest/atcs/aircraft
POST: http://localhost:8080/rest/atcs/aircraft

Josn post body
 {
"id": 2,
"type": "Emergency",
"size": "Large"
}


  
