def call(String nexusUrl, String nexusRepo) {

    echo "Uploading artifact to Nexus..."

    nexusArtifactUploader(
        nexusVersion: 'nexus3',
        protocol: 'http',
        nexusUrl: nexusUrl,
        groupId: 'com.javatpoint',
        version: '1.0-SNAPSHOT',
        repository: nexusRepo,
        credentialsId: 'nexus',
        artifacts: [
            [
                artifactId: 'SimpleCustomerApp',
                classifier: '',
                file: 'target/SimpleCustomerApp-1.0-SNAPSHOT.war',
                type: 'war'
            ]
        ]
    )

    echo "Nexus upload completed successfully."
}
