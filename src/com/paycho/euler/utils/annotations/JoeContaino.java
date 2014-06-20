
package com.paycho.euler.utils.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author Paycho <paycho@paycho.org>
 */
@Documented
@Target({ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, 
    ElementType.LOCAL_VARIABLE, ElementType.METHOD, ElementType.PACKAGE, ElementType.PARAMETER, 
    ElementType.TYPE, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
public @interface JoeContaino {
  JoeDrago[] value();
}
