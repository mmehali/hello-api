pipeline {
   agent any
   tools{
     maven 'Maven 3.8.4'
     jdk 'jdk8'
   }
   
   stages {
      stage('Build') {
         steps {
            echo '- Get the repository from GitHub'
            git 'https://github.com/mmehali/hello-api.git'

            echo '- Run Maven clean' 
            sh "mvn clean exec:java"
            
            echo '- Run maven install'
            sh "mvn install exec:java"            
         }
      }
   }
}
