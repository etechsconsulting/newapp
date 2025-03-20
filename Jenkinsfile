pipeline {
    agent any
    tools {
    maven 'maven3'
    }

    stages {
        stage('build') {
            steps {
                echo 'building application'
                sh 'mvn package'
            }
        }
    }
}

