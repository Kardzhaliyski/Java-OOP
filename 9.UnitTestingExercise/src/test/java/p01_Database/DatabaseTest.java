package p01_Database;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private static final Integer[] NUMBERS = {29 , 17, 3, 69, 83};
    private static final Integer NUMBER = 33;
    private Database database;

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.database = new Database(NUMBERS);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testDatabaseShouldThrowIfCratedWithNullElements() throws OperationNotSupportedException {
        Database database = new Database(new Integer[]{null, null, null});
    }


    @Test
    public void testDatabaseIsCreatedWithTheSameElements() {
        Integer[] databaseElements = database.getElements();

        Assert.assertEquals(NUMBERS.length, databaseElements.length);

        for (int index = 0; index < databaseElements.length; index++) {
            Assert.assertEquals(NUMBERS[index], databaseElements[index]);
        }
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenMoreThenSixteenElements() throws OperationNotSupportedException {
        new Database(new Integer[17]);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenLessThenOneElement() throws OperationNotSupportedException {
        new Database(new Integer[0]);
    }

    @Test
    public void testAddMethodShouldAddElementToTheDatabase() throws OperationNotSupportedException {
        database.add(NUMBER);
        Assert.assertEquals(NUMBERS.length + 1, database.getElements().length);
    }

    @Test
    public void testAddMethodShouldAddElementAtTheLastCell() throws OperationNotSupportedException {
        database.add(NUMBER);
        Integer lastElement = database.getElements()[database.getElements().length - 1];
        Assert.assertEquals(NUMBER, lastElement);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testAddMethodShouldThrowWhenProvidedNullElement() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveMethodShouldRemoveAnElement() throws OperationNotSupportedException {
        database.remove();
        Assert.assertEquals(NUMBERS.length - 1, database.getElements().length);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testRemoveMethodShouldThrowWhenDatabaseIsEmpty() throws OperationNotSupportedException {
        while (this.database.getElements().length > 0) {
            database.remove();
        }

        database.remove();
    }

    @Test
    public void testRemoveMethodShouldRemoveTheLastElement() throws OperationNotSupportedException {
        Integer lastElement = database.getElements()[database.getElements().length - 1];
        database.remove();
        for (Integer element : database.getElements()) {
            Assert.assertNotEquals(lastElement, element);
        }
    }


}