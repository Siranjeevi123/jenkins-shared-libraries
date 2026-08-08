def call(String url,String branch){

	echo 'pulling the Code for GitHub Repo'
	git url: "${url}", branch:"${branch}"
    echo 'Repo Cloning Successful'

}
