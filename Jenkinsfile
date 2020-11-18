pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'The project is building....'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'The build is being tested...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'The code is being deployed...'
            }
        }

    }

}