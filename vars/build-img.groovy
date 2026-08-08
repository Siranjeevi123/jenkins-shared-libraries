def call(String img) {
    echo "Building the Docker image"
    sh "docker build -t ${img} ."
    echo "Build successful ..."
}
