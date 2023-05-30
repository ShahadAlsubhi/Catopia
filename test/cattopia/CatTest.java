/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cattopia;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shaha
 */
public class CatTest {
    
    public CatTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCatId method, of class Cat.
     */
    @Test
    public void testGetCatId() {
        System.out.println("getCatId");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"non",true,true,"for adoption", "", 25);
        int expResult = 123;
        int result = instance.getCatId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCatId method, of class Cat.
     */
    @Test
    public void testSetCatId() {
        System.out.println("setCatId");
        int catId = 122;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"non",true,true,"for adoption", "", 25);
        instance.setCatId(catId);
        int expResult = 122;
        int result = instance.getCatId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCatName method, of class Cat.
     */
    @Test
    public void testGetCatName() {
        System.out.println("getCatName");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"non",true,true,"for adoption", "", 25);
        String expResult = "tommy";
        String result = instance.getCatName();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCatName method, of class Cat.
     */
    @Test
    public void testSetCatName() {
        System.out.println("setCatName");
        String catName = "lala";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"non",true,true,"for adoption", "", 25);
        instance.setCatName(catName);
        String expResult = "lala";
        String result = instance.getCatName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSex method, of class Cat.
     */
    @Test
    public void testGetSex() {
        System.out.println("getSex");
        Cat instance = null;
        String expResult = "";
        String result = instance.getSex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSex method, of class Cat.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "";
        Cat instance = null;
        instance.setSex(sex);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class Cat.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Cat instance = null;
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class Cat.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        Cat instance = null;
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBreed method, of class Cat.
     */
    @Test
    public void testGetBreed() {
        System.out.println("getBreed");
        Cat instance = null;
        String expResult = "";
        String result = instance.getBreed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBreed method, of class Cat.
     */
    @Test
    public void testSetBreed() {
        System.out.println("setBreed");
        String breed = "";
        Cat instance = null;
        instance.setBreed(breed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBound method, of class Cat.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        Cat instance = null;
        Cat expResult = null;
        Cat result = instance.getBound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBound method, of class Cat.
     */
    @Test
    public void testSetBound() {
        System.out.println("setBound");
        Cat bound = null;
        Cat instance = null;
        instance.setBound(bound);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBehavior method, of class Cat.
     */
    @Test
    public void testGetBehavior() {
        System.out.println("getBehavior");
        Cat instance = null;
        String expResult = "";
        String result = instance.getBehavior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBehavior method, of class Cat.
     */
    @Test
    public void testSetBehavior() {
        System.out.println("setBehavior");
        String behavior = "";
        Cat instance = null;
        instance.setBehavior(behavior);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isDisabled method, of class Cat.
     */
    @Test
    public void testIsDisabled() {
        System.out.println("isDisabled");
        Cat instance = null;
        boolean expResult = false;
        boolean result = instance.isDisabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDisabled method, of class Cat.
     */
    @Test
    public void testSetDisabled() {
        System.out.println("setDisabled");
        boolean disabled = false;
        Cat instance = null;
        instance.setDisabled(disabled);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMedicalHistory method, of class Cat.
     */
    @Test
    public void testGetMedicalHistory() {
        System.out.println("getMedicalHistory");
        Cat instance = null;
        String expResult = "";
        String result = instance.getMedicalHistory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMedicalHistory method, of class Cat.
     */
    @Test
    public void testSetMedicalHistory() {
        System.out.println("setMedicalHistory");
        String medicalHistory = "";
        Cat instance = null;
        instance.setMedicalHistory(medicalHistory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLikesCats method, of class Cat.
     */
    @Test
    public void testIsLikesCats() {
        System.out.println("isLikesCats");
        Cat instance = null;
        boolean expResult = false;
        boolean result = instance.isLikesCats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLikesCats method, of class Cat.
     */
    @Test
    public void testSetLikesCats() {
        System.out.println("setLikesCats");
        boolean likesCats = false;
        Cat instance = null;
        instance.setLikesCats(likesCats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isLikesChildrens method, of class Cat.
     */
    @Test
    public void testIsLikesChildrens() {
        System.out.println("isLikesChildrens");
        Cat instance = null;
        boolean expResult = false;
        boolean result = instance.isLikesChildrens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLikesChildrens method, of class Cat.
     */
    @Test
    public void testSetLikesChildrens() {
        System.out.println("setLikesChildrens");
        boolean likesChildrens = false;
        Cat instance = null;
        instance.setLikesChildrens(likesChildrens);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdoptionState method, of class Cat.
     */
    @Test
    public void testGetAdoptionState() {
        System.out.println("getAdoptionState");
        Cat instance = null;
        String expResult = "";
        String result = instance.getAdoptionState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdoptionState method, of class Cat.
     */
    @Test
    public void testSetAdoptionState() {
        System.out.println("setAdoptionState");
        String adoptionState = "";
        Cat instance = null;
        instance.setAdoptionState(adoptionState);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdoptionReason method, of class Cat.
     */
    @Test
    public void testGetAdoptionReason() {
        System.out.println("getAdoptionReason");
        Cat instance = null;
        String expResult = "";
        String result = instance.getAdoptionReason();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdoptionReason method, of class Cat.
     */
    @Test
    public void testSetAdoptionReason() {
        System.out.println("setAdoptionReason");
        String adoptionReason = "";
        Cat instance = null;
        instance.setAdoptionReason(adoptionReason);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdoptionUpdates method, of class Cat.
     */
    @Test
    public void testGetAdoptionUpdates() {
        System.out.println("getAdoptionUpdates");
        Cat instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAdoptionUpdates();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdoptionUpdates method, of class Cat.
     */
    @Test
    public void testSetAdoptionUpdates() {
        System.out.println("setAdoptionUpdates");
        ArrayList adoptionUpdates = null;
        Cat instance = null;
        instance.setAdoptionUpdates(adoptionUpdates);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdoptionFees method, of class Cat.
     */
    @Test
    public void testGetAdoptionFees() {
        System.out.println("getAdoptionFees");
        Cat instance = null;
        int expResult = 0;
        int result = instance.getAdoptionFees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdoptionFees method, of class Cat.
     */
    @Test
    public void testSetAdoptionFees() {
        System.out.println("setAdoptionFees");
        int adoptionFees = 0;
        Cat instance = null;
        instance.setAdoptionFees(adoptionFees);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterByBreed method, of class Cat.
     */
    @Test
    public void testFilterByBreed() {
        System.out.println("FilterByBreed");
        String breed = "";
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterByBreed(breed);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterByAge method, of class Cat.
     */
    @Test
    public void testFilterByAge() {
        System.out.println("FilterByAge");
        int age = 0;
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterByAge(age);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterByGender method, of class Cat.
     */
    @Test
    public void testFilterByGender() {
        System.out.println("FilterByGender");
        String gender = "";
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterByGender(gender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterByBehavior method, of class Cat.
     */
    @Test
    public void testFilterByBehavior() {
        System.out.println("FilterByBehavior");
        String behavior = "";
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterByBehavior(behavior);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterDisabled method, of class Cat.
     */
    @Test
    public void testFilterDisabled() {
        System.out.println("FilterDisabled");
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterDisabled();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterLikesChildren method, of class Cat.
     */
    @Test
    public void testFilterLikesChildren() {
        System.out.println("FilterLikesChildren");
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterLikesChildren();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FilterLikesCats method, of class Cat.
     */
    @Test
    public void testFilterLikesCats() {
        System.out.println("FilterLikesCats");
        ArrayList<Cat> expResult = null;
        ArrayList<Cat> result = Cat.FilterLikesCats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Searchbound method, of class Cat.
     */
    @Test
    public void testSearchbound() {
        System.out.println("Searchbound");
        String boundName = "";
        Cat instance = null;
        Cat expResult = null;
        Cat result = instance.Searchbound(boundName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewCattoDatabase method, of class Cat.
     */
    @Test
    public void testAddNewCattoDatabase() {
        System.out.println("addNewCattoDatabase");
        Cat cat = null;
        Cat instance = null;
        instance.addNewCattoDatabase(cat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
