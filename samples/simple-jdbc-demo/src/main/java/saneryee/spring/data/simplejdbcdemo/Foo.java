package saneryee.spring.data.simplejdbcdemo;

import lombok.Builder;
import lombok.Data;

// Lombok @Data generates all the boilerplate that is normally associated with simple POJOs.
// Include:@ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor
// Lombok @Builder lets you automatically produce the code required to have your class be instantiable with code such as:
// Person.builder().name("Adam Savage").city("San Francisco").job("Mythbusters").job("Unchained Reaction").build();

@Data
@Builder
public class Foo {
    private Long id;
    private String bar;
}
