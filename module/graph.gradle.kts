import com.vanniktech.dependency.graph.generator.DependencyGraphGeneratorExtension
import guru.nidi.graphviz.attribute.Color
import guru.nidi.graphviz.attribute.Style

plugins.apply("com.vanniktech.dependency.graph.generator")

configure<DependencyGraphGeneratorExtension> {
    generators.create("${ConfigureApp.artifactId}Libraries") {
        include =
            { dependency -> dependency.moduleGroup.startsWith("") }
        children = { true }
        dependencyNode = { node, dependency ->
            if (dependency.moduleGroup.startsWith(ConfigureApp.groupId)) {
                node.add(
                    Style.FILLED,
                    Color.rgb("#EC4A0A"),
                    Color.WHITE.font()

                )
            } else {
                node.add(
                    Style.SOLID,
                    Color.rgb("#000000")
                )
            }
        }
    }
}