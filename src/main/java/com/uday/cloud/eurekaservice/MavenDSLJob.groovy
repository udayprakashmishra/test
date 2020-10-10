job('First DSL Job') {
    logRotator(5, 5)
    scm {
        git('git@github.com:udayprakashmishra/test.git', 'main')
    }
    triggers {
        scm("* * * * *")
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}
