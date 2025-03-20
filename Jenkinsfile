pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'building application'
                sh 'mvn package'
            }
        }
    }
}

