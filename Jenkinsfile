pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git credentialsId: 'github-credentials',
                    branch: 'main',
                    url: 'https://github.com/ivbellamkonda/Selenium.git'
            }
        }
        stage('Build') {
            steps {
                bat 'echo Building the project...'  // Change 'sh' to 'bat'
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'echo Running tests...'  // Change 'sh' to 'bat'
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'echo Deploying the project...'  // Change 'sh' to 'bat'
            }
        }
    }
}
