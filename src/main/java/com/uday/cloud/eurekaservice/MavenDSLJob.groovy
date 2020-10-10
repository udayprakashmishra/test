job('First DSL Job') {
    logRotator(5, 5)
    scm {
        git('https://github.com/udayprakashmishra/test.git', 'main')
    }
    triggers {
        scm("* * * * *")
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.jar')
    }
}
