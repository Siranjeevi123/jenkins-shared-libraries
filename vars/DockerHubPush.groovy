def call(String img){
	echo "pushing the Docker img to DockerHub"
     withCredentials([usernamePassword(
		 credentialsId: 'DockerHubCred',
         usernameVariable: 'DOCKER_USER',
		 passwordVariable: 'DOCKER_PASS'
	 )]){
         sh "docker login -u ${env.DOCKER_USER} -p ${DOCKER_PASS}"
		 sh "docker push ${img}"
     }


}
