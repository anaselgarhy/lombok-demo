package com.anas.learning.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
@Builder
@Getter
//@Accessors(fluent = true)
@ToString
public class Person {
    private String name;
    private String email;
    private int age;
    private String address;
    private String phone;
    private double salary;

/*
    // The static fields is not included in the generated  builder by default
    // To include it, you need to add the @Builder.Default
    @Builder.Default
    private static String staticField = "static field";
*/
/*
    // We can use the @Singular annotation to make the builder add items to a collection field instead of overwriting it.
    @Singular("hobby")
    private List<String> movies;*/
}
