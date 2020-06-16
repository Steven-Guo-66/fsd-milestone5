pipeline {
   agent any

   stages {
      stage('pull code') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/Steven-Guo-66/milestone-4.git']]])
         }
      }
      stage('build project') {
         steps {
            sh 'mvn clean install -f milestone-4/emart/emart-eureka/pom.xml -Dmaven.test.skip=true'
         }
      }
      stage('publish project') {
         steps {
            sh 'docker build -t eurekaservice -f Dockerfile .'
            sh 'docker run -d -p 8761:8761 eurekaservice'
            sh 'echo hello'
         }
      }
   }
}