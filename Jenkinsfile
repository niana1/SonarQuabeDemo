pipeline {
    agent any
    stages {
    
    	
		stage('Maven Compile'){
	
			steps{
	
				echo 'Project compile stage'
	
				bat label: 'Compilation running', script: '''mvn compile'''
	
		       	}
	
		}

		stage('Unit Test') {
	
		   steps {
	
				echo 'Project Testing stage'
	
				bat label: 'Test running', script: '''mvn test'''
	
		       
	
	       		}
	
	   	}

	  
		stage('Jacoco Coverage Report') {
	
	        steps{
	
	            jacoco()
	
			}
	
		}

        stage('build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    
		   bat label: '', script: '''mvn sonar:sonar\
		  -Dsonar.host.url=http://3.238.72.11:9000 \
		  -Dsonar.login=afef250893ecacecb9b07ba6a839698e8ff34871'''

                    
                }
            }
        }
        
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
          
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        
        stage('Maven Package'){

			steps{
	
				echo 'Project packaging stage'
	
				bat label: 'Project packaging', script: '''mvn package'''
	
			}

		} 	
    }
}
