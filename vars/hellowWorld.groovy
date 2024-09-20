 def call() {
//sh"docker build -t image:latest ."
 // sh "docker images"
  //sh "pwd"
  //sh "ls"
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}

  
}
