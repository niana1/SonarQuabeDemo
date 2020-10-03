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
	
	            jacoco()
	
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
