package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;

    @BeforeEach
    public void setUp() {
        manga1 = new Manga("Kimetsu no Yaiba", 24);
        manga1 = new Manga("Kimetsu no Yaiba", 24);
    }

    @Test
    public void shouldReturnDataWhenInitialized() {
        assertEquals("Kimetsu no Yaiba", manga1.name());
        assertEquals(24, manga1.episodes());
    }

    @Test
    public void shouldReturnTrueWhenObjectsAreTheSame() {
        assertEquals(manga1, manga2);
    }

    @Test
    public void shouldHashCodeReturnTrueWhenObjectsAreTheSame() {
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }

    @Test
    public void constructorThrowNullPointerExceptionWhenNameIsNull() {
        assertThrows(NullPointerException.class,
                () -> new Manga(null, 23));
    }

    @Test
    public void isRecordReturnTrueWhencalledFromManga() {
        assertTrue(Manga.class.isRecord());
    }
}