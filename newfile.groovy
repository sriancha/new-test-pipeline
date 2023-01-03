pipeline {
    agent any
    stages{

        stage("build"){
            steps {
                println "here i will run build commands"
                println "mvn clean package"
            }
        }
        stage("depoly"){
            steps{
                println "here i will depoly the code"
            }
        }
    }
}