def call() {
    withSonarQubeEnv('SonarQube') {
        sh '''
            mvn clean verify \
            org.sonarsource.scanner.maven:sonar-maven-plugin:sonar
        '''
    }
}
