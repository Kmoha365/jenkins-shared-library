def call () {
    echo "Building package"
    sh "mvn clean -B install"
}
