node ('opsschool-slaves'){
    currentBuild.result = "SUCCESS"
    stage('Test'){
        //sh 'ruby app/tc_ruby_app.rb'
        print 'ls -ltrh'
    }

}