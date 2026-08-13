def call() {
    sh '''
        mvn clean install

        echo "Checking generated WAR file..."

        ls -lh target/
    '''
}
