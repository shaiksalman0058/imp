def call() {

    echo 'Deploying application to Tomcat...'

    sh '''
        docker cp \
        target/SimpleCustomerApp-1.0-SNAPSHOT.war \
        tomcat:/usr/local/tomcat/webapps/SimpleCustomerApp.war

        echo "WAR deployed successfully."

        docker exec tomcat \
        ls -lh /usr/local/tomcat/webapps/SimpleCustomerApp.war
    '''

    echo 'Tomcat deployment completed successfully.'
}
