package edu.eci.cvds.tdd.registry;
import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void testResgiterOfPersonWhitMaleGenderResultVALID() {
        Person person = new Person("Nombre Uno", 1001, 20, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testResgiterOfPersonWhitFemaleGenderResultVALID() {
        Person person = new Person("Nombre Dos", 1002, 25, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testResgiterOfPersonWhitUnidentifiedGenderResultVALID() {
        Person person = new Person("Nombre Tres", 1003, 76, Gender.UNIDENTIFIED, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testResgiterOfAlivePersonResultVALID() {
        Person person = new Person("Nombre Cuatro", 1004, 40, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testResgiterOfDeadPersonResultDEAD() {
        Person person = new Person("Nombre Cinco", 1005, 18, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void testResgiterOfUPersonWhitAgeEqualToVotingAgeResultVALID() {
        Person person = new Person("Nombre Seis", 1006, Registry.VOTING_AGE, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void testResgiterOfUPersonWhitAgeEqualTo1ResultUNDERAGE() {
        Person person = new Person("Nombre Siete", 1007, 1, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void testResgiterOfUPersonWhitAgeEqualToVotingAgeMinus1ResultUNDERAGE() {
        Person person = new Person("Nombre Ocho", 1008, Registry.VOTING_AGE-1, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void testResgiterOfUPersonWhitNegativeAgeResultINVALID_AGE() {
        Person person = new Person("Nombre Diez", 1010, -20, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void testResgiterOfUPersonWhitAgeEqualTo0ResultINVALID_AGE() {
        Person person = new Person("Nombre Once", 1011, 0, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void testResgiterOfUPersonOlderThanTheEstablishedMaximumAgeResultINVALID_AGE() {
        Person person = new Person("Nombre Doce", 1012, Registry.MAX_AGE+1, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void testResgiterOfPersonWithAResgisteredIDResultDUPLICATED() {
        Person person = new Person("Nombre Trece", 1013, 20, Gender.MALE, true);
        registry.registerVoter(person);
        Person person2 = new Person("Nombre Catorce", 1013, 20, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void testResgiterOfPersonWithTheSameNameAsAPersonWhoAlreadyVotedResultVALID() {
        Person person = new Person("Nombre Quince", 1015, 20, Gender.MALE, true);
        registry.registerVoter(person);
        Person person2 = new Person("Nombre Quince", 1016, 28, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person2);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases
}