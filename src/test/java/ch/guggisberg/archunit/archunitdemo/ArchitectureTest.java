package ch.guggisberg.archunit.archunitdemo;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

public class ArchitectureTest {

    @Test
    public void service_should_only_be_accessed_by_presentation() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("ch.guggisberg.archunit.archunitdemo");

        ArchRule rule = classes().that().resideInAPackage("..service..").should().onlyBeAccessed().byAnyPackage(
                "..service..", "..controller.."
        );

        rule.check(importedClasses);
    }

}
