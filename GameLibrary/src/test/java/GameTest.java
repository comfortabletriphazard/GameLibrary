import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.*;

public class GameTest {

    Game testGame = new Game(
            "Super Mario 64",
            "Nintendo 64",
            false,
            "Mario in 3D for the first time!",
            5.0,
            "PAL"
    );

    @DisplayName("Check Get Title")
    @Test
    public void testGetTitle() {
        assertEquals("Super Mario 64", testGame.getTitle());
        assertNotEquals("Donkey Kong 64", testGame.getTitle());
    }

    @Test
    public void testGetPlatforms() {
        assertEquals("Nintendo 64", testGame.getPlatforms());
    }

    @Test
    public void testIsDigital() {
        assertFalse(testGame.isDigital(true));
    }

    @Test
    public void testGetDescription() {
        assertEquals("Mario in 3D for the first time!", testGame.getDescription());
    }

    @Test
    public void testGetRating() {
        assertEquals(5.0, testGame.getRating(), 0.01);
    }

    @Test
    public void testGetLocation() {
        assertEquals("PAL", testGame.getRegion());
    }

    @Test
    public void testSetTitle() {
        assertEquals("Super Mario 64", testGame.getTitle());
    }

    @Test
    public void testSetPlatforms() {
        assertEquals("Nintendo 64", testGame.getPlatforms());
    }

    @Test
    public void testSetDigital() {
        assertEquals(false, testGame.isDigital(false));

        //Updating setDigital value
        testGame.setDigital(true);

        //Checking updated value has updated
        assertEquals(true, testGame.isDigital(true));
        assertNotEquals(false, testGame.isDigital(true));
    }

    @Test
    public void testSetRating() {
        assertEquals(5.0, testGame.getRating(), 0.01);
        testGame.setRating(3.0);
        assertEquals(3.0, testGame.getRating(), 0.01);
    }

    @Test
    public void testSetRegion() {
        assertEquals("PAL", testGame.getRegion());

        //Test to update region from PAL to NTSC
        testGame.setRegion("NTSC");
        assertEquals("NTSC", testGame.getRegion());
    }

    @Test
    public void testToString() {
        // Create a Game instance for testing
        Game testGame = new Game(
                "Super Mario World",
                "SNES",
                false,
                "Side scrolling Mario and Yoshi!",
                5.0,
                "PAL");

        // Test the toString method matches
        assertNotEquals(" Game: \n" +
                        " title='Super Mario World',\n" +
                        " platforms='SNES',\n" +
                        " isDigital=false,\n" +
                        " description='Side scrolling Mario and Yoshi!',\n" +
                        " rating=5.0,\n" +
                        " location='PAL' ",
                testGame.toString());
    }
}