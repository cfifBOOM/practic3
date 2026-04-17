package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AgeServiceTest {
    AgeService service = new AgeService();

    @Test
    void testCategories() {
        assertEquals("ребенок", service.getCategory(10));
        assertEquals("взрослый", service.getCategory(25));
        assertEquals("пенсионер", service.getCategory(70));
    }

    @Test
    void testBoundaries() {
        assertEquals("взрослый", service.getCategory(18));
        assertEquals("пенсионер", service.getCategory(65));
    }
}
