pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Python Script') {
            steps {
                sh 'python3 demo.py'
            }
        }

        stage('Compile and Run Java') {
            steps {
                sh '''
                    javac test.java
                    java test
                '''
            }
        }
    }
}
