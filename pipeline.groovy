pipeline {
    agent { label 'slave' }
    stages {
        stage('git-pull-stage') {
            steps {
                git branch: 'main', credentialsId: '691340f6-7c87-4747-9182-f7730eb78a15', url: 'https://github.com/abhayt7/student-ui-app.git'
            }
        }
         stage('build-stage') {
            steps {
                sh '/opt/maven/bin/mvn clean package'
            }
        }
         stage('tesr-stage') {
            steps {
                echo 'code test sucessfully'
            }
        }
         stage('deploy-stage') {
            steps {
                echo 'code deploy sucessfully'
            }
        }
    }
}
