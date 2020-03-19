plugins {
    id("io.toolebox.git-versioner")
}

versioner {
    startFrom {
        major = 1
        minor = 1
        patch = 1
    }
    match {
        major = "major"
        minor = "minor"
        patch = "patch"
    }
    tag {
        prefix = "x"
    }
}
