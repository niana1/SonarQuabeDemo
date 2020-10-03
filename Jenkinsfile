pipeline {
    agent any
    stages {
    
    	
		stage('Maven Compile'){
			steps{
	
				echo 'Project compile stage'
	
				sh 'mvn compile'
	
		       	}
	
		}

		stage('Unit Test') {
	
		   steps {
	
				echo 'Project Testing stage'
	
				sh 'mvn test'
	
		       
	
	       		}
	
	   	}

	  
		stage('Jacoco Coverage Report') {
	
	        steps{
	        	
	        	sh 'mvn verify'
	            jacoco()
	
			}
	
		}
	    
	    stage('SonarQube'){

	         steps{
			 withSonarQubeEnv('SonarQube2') {
	
	            sh '''mvn sonar:sonar \
					 -Dsonar.host.url=http://35.175.103.228:9000 \
	 				-Dsonar.login=5623afa01d36ee21531aade59a92bcf60e4c212d'''
	
          			}	
	   		 }

		}


        
        stage('Maven Package'){

			steps{
	
				echo 'Project packaging stage'
	
				sh 'mvn package'
	
			}

		} 	
    }
}
