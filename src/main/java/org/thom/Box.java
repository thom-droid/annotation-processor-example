package org.thom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // interface, class, enum
@Retention(RetentionPolicy.SOURCE)
public @interface Box {
}
