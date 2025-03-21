pipeline {
    agent any
    docker {
      image 'maven:3.9.8-sapmachine-21'
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

