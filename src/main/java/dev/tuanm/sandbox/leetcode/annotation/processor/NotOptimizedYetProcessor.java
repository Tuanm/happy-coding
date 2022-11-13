package dev.tuanm.sandbox.leetcode.annotation.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

import com.google.auto.service.AutoService;

import dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet;

@SupportedAnnotationTypes("dev.tuanm.sandbox.leetcode.annotation.NotOptimizedYet")
@AutoService(Processor.class)
public final class NotOptimizedYetProcessor extends AbstractProcessor {
    private static final String DEFAULT_MESSAGE = "The solution has not been optimized yet.";

    @Override
    public boolean process(Set<? extends TypeElement> typeElements, RoundEnvironment roundEnvironment) {
        Messager messager = processingEnv.getMessager();
        for (TypeElement typeElement : typeElements) {
            for (Element element : roundEnvironment.getElementsAnnotatedWith(typeElement)) {
                NotOptimizedYet annotation = element.getAnnotation(NotOptimizedYet.class);
                String message = annotation.comment().isBlank()
                        ? DEFAULT_MESSAGE
                        : annotation.comment();
                messager.printMessage(Kind.NOTE, message, element);
            }
        }
        return true;
    }
}
