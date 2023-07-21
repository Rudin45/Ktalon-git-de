
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "mfa.readMFA.GetMFAToken"() {
    (new mfa.readMFA()).GetMFAToken()
}


def static "databases.PostgressDB.connectDB"(
    	String url	
     , 	String dbname	
     , 	String port	
     , 	String username	
     , 	String password	) {
    (new databases.PostgressDB()).connectDB(
        	url
         , 	dbname
         , 	port
         , 	username
         , 	password)
}

 /**
	 \* execute a SQL query on database
	 \* @param queryString SQL query string
	 \* @return a reference to returned data collection, an instance of java.sql.ResultSet
	 */ 
def static "databases.PostgressDB.executeQuery"(
    	String queryString	) {
    (new databases.PostgressDB()).executeQuery(
        	queryString)
}


def static "databases.PostgressDB.closeDatabaseConnection"() {
    (new databases.PostgressDB()).closeDatabaseConnection()
}


def static "mfa.readMFA.GetMFAToken"() {
    (new mfa.readMFA()).GetMFAToken()
}
