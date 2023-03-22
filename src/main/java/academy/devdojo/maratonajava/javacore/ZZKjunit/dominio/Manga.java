package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

import java.util.Objects;

 record Manga<T>(String name, int episodes) {

    public Manga {
        Objects.requireNonNull(name);
    }
}
