pipeline {
    agent any
    
    stages {
        stage('Copie') {
            steps {
                git([url: 'https://github.com/TwitsTeen/Jenkins.git', branch: 'main'])
            }
        }
        
        stage('Compiler') {
            steps {
                echo 'Compilation du projet Java...'
                sh 'javac Factorial.java'
                sh 'javac -cp .:junit-platform-console-standalone-1.9.3.jar FactorialTest.java'
            }
        }
    }
    
    post {
        success {
            echo 'Build réussi !'
        }
        failure {
            echo 'Build échoué !'
        }
    }
}
