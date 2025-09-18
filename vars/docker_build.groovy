def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "This is Build the code"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "This Build code completed."
}
