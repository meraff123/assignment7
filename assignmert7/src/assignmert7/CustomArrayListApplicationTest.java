package assignmert7;
import org.junit.Test;

public class CustomArrayListApplicationTest {

    @Test
    public void testExampleHulkHogan() {
        CustomList<Integer> hulkHoganList = new CustomArrayList<>();
        for (int i = 0; i < 20; i++) {
            hulkHoganList.add(i, i + 10);
        }
        hulkHoganList.add(1, 1000);

        assertEquals(21, hulkHoganList.getSize());
        assertEquals(1000, hulkHoganList.get(1));
        assertEquals(10, hulkHoganList.get(0));
        assertEquals(11, hulkHoganList.get(2));
        assertEquals(29, hulkHoganList.get(20));
    }

    @Test
    public void testExampleUndertaker() {
        CustomList<Integer> undertakerList = new CustomArrayList<>();
        for (int i = 0; i < 15; i++) {
            undertakerList.add(i, i * 2);
        }
        undertakerList.add(5, 20);

        assertEquals(16, undertakerList.getSize());
        assertEquals(20, undertakerList.get(5));
        assertEquals(0, undertakerList.get(0));
        assertEquals(4, undertakerList.get(4));
        assertEquals(14, undertakerList.get(15));
    }

    private void assertEquals(int i, int size) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testExampleStoneCold() {
        String[] stoneColdNames = { "Austin 3:16", "The Rattlesnake", "Stunner", "Broken Skull", "Texas Rattlesnake",
                "The Bionic elbow", "Cold Stone" };
        CustomList<String> stoneColdList = new CustomArrayList<>();
        for (int i = 0; i < stoneColdNames.length; i++) {
            stoneColdList.add(stoneColdNames[i]);
        }

        assertEquals(stoneColdNames.length, stoneColdList.getSize());
        for (int i = 0; i < stoneColdList.getSize(); i++) {
            assertEquals(stoneColdNames[i], stoneColdList.get(i));
        }
    }

    private void assertEquals(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	@Test
    public void testExampleTheRock() {
        CustomList<Integer> theRockData = new CustomArrayList<>();

        // Add numbers to the list
        for (int i = 1; i <= 5; i++) {
            theRockData.add(i * 10);
        }

        // Get numbers at indexes in the list
        for (int i = 0; i < theRockData.getSize(); i++) {
            assertEquals(i * 10 + 10, theRockData.get(i));
        }
        assertEquals(5, theRockData.getSize());
        assertEquals(40, theRockData.get(3));
    }
}
