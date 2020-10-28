node{
    stage('Initialize'){
        withCredentials([sshUserPrivateKey(credentialsId: 'jenkins-master-ssh-key', keyFileVariable: 'SSHKEY', passphraseVariable: '', usernameVariable: 'SSHUSERNAME')]) {
            sh '''
                    ssh -i $SSHKEY ec2-user@100.25.163.218 yum install epel-release -y
                '''
        }
    } 
}

