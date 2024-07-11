package ch.guggisberg.archunit.archunitdemo;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = "ch.guggisberg.archunit.archunitdemo")
public class Architecture2Test {

    @ArchTest
    public static final ArchRule service_should_only_be_accedded_by_controller = classes().that().resideInAPackage("..service..")
            .should().onlyBeAccessed().byAnyPackage("..controller..", "..service..");

}
