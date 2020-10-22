library('piper-lib-os')

pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
               abapEnvironmentRunATCCheck script: this
            }
        }
        
    }
}

