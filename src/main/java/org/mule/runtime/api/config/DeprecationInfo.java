package org.mule.runtime.api.config;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


@Documented
@Retention(SOURCE)
@Target({TYPE, FIELD, METHOD, CONSTRUCTOR, PACKAGE})
public @interface DeprecationInfo {

  MuleRuntimeFeature feature();

}
