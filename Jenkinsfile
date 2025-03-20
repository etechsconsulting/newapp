pipeline {
    agent any
    tools {
    maven 'maven 3.9.8'
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

