def call() {
    echo 'Starting SonarQube analysis...'

    withSonarQubeEnv('SonarQube') {
        sh '''
            mvn clean verify \
            org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
        '''
    }

    echo 'SonarQube analysis completed.'
}
