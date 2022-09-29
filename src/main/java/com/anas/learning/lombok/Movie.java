package com.anas.learning.lombok;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.NonFinal;

/**
 * @author <a href="https://github.com/anas-elgarhy">Anas Elgarhy</a>
 * @version 1.0
 * @since 29/09/2022
 */
@AllArgsConstructor(access = AccessLevel.PUBLIC) // its a public by default
@NoArgsConstructor
@Getter
@Setter // or @Getter(AccessLevel.PUBLIC) @Setter(AccessLevel.PUBLIC)
@ToString // we can exclude some fields from toString() by using @ToString(exclude = {"name", "description"})
@EqualsAndHashCode
// we can exclude some fields from equals() and hashCode() by using @EqualsAndHashCode(exclude = {"name", "description"})
public class Movie {
    @NonNull // this field can't be null
    private String name;
    @NonFinal // this field can't be final
    private String description;
    private int year;
    private String director;
    private String[] actors;
    private float rating;

    // We can customize the access level of the generated getter and setter methods for each field
    @Getter(AccessLevel.PACKAGE) // we can use @Getter(AccessLevel.NONE) to not generate getter
    private final String[] genres = {"Crime", "Drama"};

    @Setter(AccessLevel.PRIVATE) // we can use @Setter(AccessLevel.NONE) to not generate setter
    @Getter(AccessLevel.PROTECTED)
    private String[] tags;

    @Accessors(chain = true) // we can use @Accessors(fluent = true) to generate fluent setters
    // the chain means that we can chain setters like this: movie.setName("name").setDescription("description")
    // the fluent means that we can use setters like this: movie.name("name").description("description")
    private Actor[] act;

    @Accessors(fluent = true) // we can add the chain = true parameter to make it chainable
    private String name2;

    @Accessors(
            fluent = true, // make it fluent (name("name"))
            chain = true // make it chainable (name("name").description("description"))
    )
    private String name3;

    public void printNames() {
        System.out.println("name: " + name);
        System.out.println("name2: " + name2);
        System.out.println("name3: " + name3);
    }
}
