/*
   - Get environment variables from configuration file
   - Pass resource file name as input
*/

def call(Map envConfig = [:]) {

    	def varMap = []
	def varValue

    	if( envConfig.nodeName == 'jenkins-agent-01' ){
        	varMap 	 = readFileAsList(name: "abinitioEnvAgent01.env")
		varValue = mymap."${envConfig.variableName}"
    	}
    	else {
        	varMap 	 = readFileAsList(name: "abinitioEnvAgent02.env")
		varValue = mymap."${envConfig.variableName}"
    	}

 return varValue
}



