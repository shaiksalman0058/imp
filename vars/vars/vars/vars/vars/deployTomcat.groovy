def call() {
    sh '''
        echo "Deploying WAR to Tomcat..."

        docker cp \
        target/SimpleCustomerApp-1.0-SNAPSHOT.war \
        tomcat:/usr/local/tomcat/webapps/SimpleCustomerApp.war

        echo "Deployment completed."

        docker exec tomcat \
        ls -lh /usr/local/tomcat/webapps/SimpleCustomerApp.war
    '''
}
