
 LONG POLLING – IMPLEMENTATION – WEBSOCKET4J [CLIENT]

   Long polling is a variation of the traditional polling technique and allows emulation of an information push from a server to a client. With long polling, the client requests information from the server in a similar way to a normal poll .

  About the Implementation

     Its a simple client and server implementation to implement long polling [comet] . This project is as Proof Of Concept [POC] to demonstrate long polling using websocket in Java ,also since these is a test assignment with time constraint . A production quality implementation is out of scope of this implementation.Mars.2 Release (4.5.2)

  Technology stack used

1. OS : Windows 10 64 bit
2. JavaSE – 1.8.0_74
3. IDE : Eclipse Mars.2 Release (4.5.2)
4. To run the client : Windows command prompt  
  
  API used for Implementation : 
  
    websocket4j – Its an open sourced GNU licensed API [ https://launchpad.net/websocket4j ]
    
websocket_client_master.zip

	This contains the code necessary to implement a websocket4j client. It contains the client program  WebSocketMessageClient.java  and the websocket4j jar file required to run the client. 

   Main Class :  WebSocketMessageClient.java

  Steps to run client

Extract the zip file into any directory, eg : c:\websocket_client
Take command prompt , go to <install_dir> , eg : c:\websocket_client
Compile  WebSocketMessageClient.java using the command :

 	       javac -cp websocket4j-1.3.jar WebSocketMessageClient.java

Run the client : java -cp websocket4j-1.3.jar;. WebSocketMessageClient <username> (optional) , where user names can be user1,user2,user3,user4 and user5 . If no username is entered , it will be treated as a guest user . This has been done to differentiate the users and to verify and confirm the messages are send to the correct user. If there is any parameter entered and if it is not between user1....user5 , then the server will reject the request and close the connection.
		
	        Run the client for other users as well in separate command prompt using the same java 		run command

	Eg:  Run each of these below commands in separate command prompts

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient user1

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient user2

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient user3

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient user4

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient user5

	c:\websocket_client > java -cp websocket4j-1.3.jar;. WebSocketMessageClient (for guest user)
