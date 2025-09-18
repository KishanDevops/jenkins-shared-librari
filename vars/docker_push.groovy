def call(String ProjectName, String ImageTag, String dockerHubUser){
  echo "This is Push the image to DockerHub..."
  // this is env Global credentials in Jenkins
  withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubpassword', usernameVariable: 'dockerHubuser')])
  {
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPassword}"
    sh "docker push ${dockerHubUser}/${ProjectName}:${ImageTag}"
  }
    echo "Push image DockerHub completed."
}
