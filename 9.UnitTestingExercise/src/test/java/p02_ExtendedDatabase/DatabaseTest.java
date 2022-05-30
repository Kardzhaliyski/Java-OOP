package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private static final int DATABASE_SIZE_LIMIT = 16;
    Database database;

    @Before
    public void setUp() throws Exception {
        Person person1 = new Person(1, "One");
        Person person2 = new Person(2, "Two");
        Person person3 = new Person(3, "Three");
        this.database = new Database(person1, person2, person3);
    }

    @Test
    public void testAddMethodShouldAddElementToDatabase() throws OperationNotSupportedException {
        Person person = new Person(5, "Five");

        int initialLength = database.getElements().length;
        database.add(person);
        int finalLength = database.getElements().length;

        Assert.assertEquals(initialLength + 1, finalLength);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testAddMethodShouldThrowWhenAddedNull() throws OperationNotSupportedException {
        database.add(null);
    }

    @Test
    public void testRemoveMethodShouldRemoveTheLastElement() throws OperationNotSupportedException {
        Person[] initialDatabaseElements = database.getElements();
        database.remove();
        Person[] finalDatabaseElements = database.getElements();

        Assert.assertEquals(initialDatabaseElements.length - 1, finalDatabaseElements.length);

        Person lastElement = initialDatabaseElements[initialDatabaseElements.length - 1];
        for (Person element : finalDatabaseElements) {
            Assert.assertNotEquals(lastElement.getId(), element.getId());
        }
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testRemoveMethodShouldThrowIfDatabaseIsEmpty() throws OperationNotSupportedException {
        while (database.getElements().length > 0) {
            database.remove();
        }

        database.remove();
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowIfInstantiatedWithMoreThenSixteenElements() throws OperationNotSupportedException {
        new Database(new Person[DATABASE_SIZE_LIMIT + 1]);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorShouldThrowWhenNoParamAreGiven() throws OperationNotSupportedException {
        new Database();
    }

    @Test
    public void testFindByIdMethodShouldReturnPersonById() throws OperationNotSupportedException {
        long id = 1L;
        Person person = database.findById(id);
        Assert.assertEquals(id, person.getId());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByIdMethodShouldThrowIfGivenNonExistingId() throws OperationNotSupportedException {
        long id = -1;
        Person person = database.findById(id);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByIdMethodShouldThrowWhenThereAreMultiplePeopleWithSameID() throws OperationNotSupportedException {
        Person person1 = new Person(1, "Test1");
        Person person2 = new Person(1, "Test2");
        database.add(person1);
        database.add(person2);

        database.findById(1);
    }

    @Test
    public void testFindByUsernameShouldReturnPersonByGivenUsername() throws OperationNotSupportedException {
        String username = database.getElements()[1].getUsername();
        Person person = database.findByUsername(username);
        Assert.assertEquals(username, person.getUsername());
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByUsernameShouldThrowWhenGivenUsernameIsNull() throws OperationNotSupportedException {
        database.findByUsername(null);
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByUsernameMethodShouldThrowWhenThereAreMultiplePeopleWithSameID() throws OperationNotSupportedException {
        Person person1 = new Person(1, "Test1");
        Person person2 = new Person(2, "Test1");
        database.add(person1);
        database.add(person2);

        database.findByUsername("Test1");
    }

    @Test (expected = OperationNotSupportedException.class)
    public void testFindByUsernameMethodShouldThrowWhenTheUsernameDoesNotExistInDatabase() throws OperationNotSupportedException {
        database.findByUsername("unknown");
    }

}