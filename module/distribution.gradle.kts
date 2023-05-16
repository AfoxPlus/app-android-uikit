version = obtainVersion(ConfigureApp.version)

fun obtainVersion(version: String): String {
    val version = generateVersion(ConfigureApp.version)
    printSignature()
    printVersionModule(version)
    printDependencyModule(version)
    return version
}

fun generateVersion(version: String): String {
    val branchName = getBranchName()
    val isReleaseBranch = branchName[0].equals('R') && branchName[1].equals('C')
    if (isReleaseBranch) {
        return version
    }
    val sb: StringBuilder = StringBuilder()
    sb.append(version)
    sb.append("-")
    sb.append(branchName)
    sb.append("-")
    sb.append("SNAPSHOT")
    return sb.toString()
}

fun getBranchName(): String {
    val process = Runtime.getRuntime().exec("git rev-parse --abbrev-ref HEAD")
    val sb: StringBuilder = StringBuilder()
    while (true) {
        val valueTemp = process.inputStream.read()
        if (valueTemp == -1) break
        sb.append(valueTemp.toChar())
    }
    return sb.toString().trim().replace("\n", "")
}

fun printSignature() {
    println(
        """
            __            _____  _           
     /\    / _|          |  __ \| |          
    /  \  | |_ _____  __ | |__) | |_   _ ___ 
   / /\ \ |  _/ _ \ \/ / |  ___/| | | | / __|
  / ____ \| || (_) >  <  | |    | | |_| \__ \
 /_/    \_|_| \___/_/\_\ |_|    |_|\__,_|___/
        """.trimIndent()
    )
}

fun printVersionModule(version: String) {
    println("Version: $version")
}

fun printDependencyModule(version: String) {
    println("Module: ${ConfigureApp.groupId}:${ConfigureApp.artifactId}:$version")
}
