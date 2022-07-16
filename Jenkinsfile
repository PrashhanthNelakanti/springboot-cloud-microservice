pipeline {
    agent any
    stages {
        stage('npm') {
            steps {
                sh 'npm --version'
            }
        }
        stage('ng') {
            steps {
                sh 'ng --version'
            }
        }
       stage('install service-reg') {
            steps {
                dir("${env.WORKSPACE}/service-registry"){
                sh "mvn clean install"
                sh "ls"
               }
            }
        }
       stage('run service-reg') {
           steps {
               dir("${env.WORKSPACE}/service-registry/target"){
               sh "java -jar *.jar"
             }
           }
       }
    }
       post {
         always {
             //mail bcc: '', body: "<b>Profile Project</b><br>Project: ${env.JOB_NAME} <br>Build Number: ${env.BUILD_NUMBER} <br> URL de build: ${env.BUILD_URL}", cc: '', charset: 'UTF-8', from: '', mimeType: 'text/html', replyTo: '', subject: "ERROR CI: Project name -> ${env.JOB_NAME}", to: "prashhanth.nelakanti@gmail.com";
             cleanWs notFailBuild: true
         }
       }
}


//aws elasticbeanstalk update-environment --environment-name Prashhanth-env-1 --application-name spring-security --version-label v2
//aws elasticbeanstalk create-application-version --application-name $AWS_EB_APP_NAME --version-label $AWS_EB_APP_VERSION --source-bundle S3Bucket=$AWS_S3_BUCKET,S3Key=$ARTIFACT_NAME