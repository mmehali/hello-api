pipeline {
   agent any

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
