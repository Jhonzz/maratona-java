package academy.devdojo.maratonajava.javacore.ZZKJunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MangaTest {
    Manga manga1;
    Manga manga2;

    @BeforeEach
    public void setup(){
        manga1 = new Manga("Kimetsu no Yaiba", 12);
        manga2 = new Manga("Kimetsu no Yaiba", 12);
    }

    @Test
    public void acessors_ReturnData_WhenInitialized(){
        Assertions.assertEquals("Kimetsu no Yaiba", manga1.name());
        Assertions.assertEquals(12, manga1.episodes());
    }
    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1, manga2);
    }
    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        Assertions.assertEquals(manga1.hashCode(), manga2.hashCode());
    }
    @Test
    public void contructor_ThrowNullPointerException_WhenNameIsNull(){
        Assertions.assertThrows(NullPointerException.class, () -> new Manga(null, 12));
    }
    @Test
    public void isRecord_ReturnTrue_WhenCalledFromManga(){
        Assertions.assertTrue(Manga.class.isRecord());
    }
}