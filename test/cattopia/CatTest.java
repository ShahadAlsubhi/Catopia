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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        String expResult = "male";
        String result = instance.getSex();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSex method, of class Cat.
     */
    @Test
    public void testSetSex() {
        System.out.println("setSex");
        String sex = "female";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setSex(sex);
        String expResult = "female";
        String result = instance.getSex();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Cat.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        int expResult = 2;
        int result = instance.getAge();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAge method, of class Cat.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 3;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setAge(age);
        int expResult = 3;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBreed method, of class Cat.
     */
    @Test
    public void testGetBreed() {
        System.out.println("getBreed");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        String expResult = "sphynx";
        String result = instance.getBreed();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBreed method, of class Cat.
     */
    @Test
    public void testSetBreed() {
        System.out.println("setBreed");
        String breed = "exotic";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setBreed(breed);
        String expResult = "exotic";
        String result = instance.getBreed();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBound method, of class Cat.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        Cat expResult = null;
        Cat result = instance.getBound();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBound method, of class Cat.
     */
    @Test
    public void testSetBound() {
        System.out.println("setBound");
        Cat bound = null;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setBound(bound);
        Cat expResult = null;
        Cat result = instance.getBound();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBehavior method, of class Cat.
     */
    @Test
    public void testGetBehavior() {
        System.out.println("getBehavior");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        String expResult = "active";
        String result = instance.getBehavior();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBehavior method, of class Cat.
     */
    @Test
    public void testSetBehavior() {
        System.out.println("setBehavior");
        String behavior = "playful";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setBehavior(behavior);
        String expResult = "playful";
        String result = instance.getBehavior();
        assertEquals(expResult, result);
    }

    /**
     * Test of isDisabled method, of class Cat.
     */
    @Test
    public void testIsDisabled() {
        System.out.println("isDisabled");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        boolean expResult = false;
        boolean result = instance.isDisabled();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDisabled method, of class Cat.
     */
    @Test
    public void testSetDisabled() {
        System.out.println("setDisabled");
        boolean disabled = true;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setDisabled(disabled);
        boolean expResult = true;
        boolean result = instance.isDisabled();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMedicalHistory method, of class Cat.
     */
    @Test
    public void testGetMedicalHistory() {
        System.out.println("getMedicalHistory");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        String expResult = "none";
        String result = instance.getMedicalHistory();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setMedicalHistory method, of class Cat.
     */
    @Test
    public void testSetMedicalHistory() {
        System.out.println("setMedicalHistory");
        String medicalHistory = "allergic to milk";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setMedicalHistory(medicalHistory);
        String expResult = "allergic to milk";
        String result = instance.getMedicalHistory();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLikesCats method, of class Cat.
     */
    @Test
    public void testIsLikesCats() {
        System.out.println("isLikesCats");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        boolean expResult = true;
        boolean result = instance.isLikesCats();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLikesCats method, of class Cat.
     */
    @Test
    public void testSetLikesCats() {
        System.out.println("setLikesCats");
        boolean likesCats = false;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setLikesCats(likesCats);
        boolean expResult = false;
        boolean result = instance.isLikesCats();
        assertEquals(expResult, result);
    }

    /**
     * Test of isLikesChildrens method, of class Cat.
     */
    @Test
    public void testIsLikesChildrens() {
        System.out.println("isLikesChildrens");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        boolean expResult = true;
        boolean result = instance.isLikesChildrens();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLikesChildrens method, of class Cat.
     */
    @Test
    public void testSetLikesChildrens() {
        System.out.println("setLikesChildrens");
        boolean likesChildrens = false;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setLikesChildrens(likesChildrens);
        boolean expResult = false;
        boolean result = instance.isLikesChildrens();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdoptionState method, of class Cat.
     */
    @Test
    public void testGetAdoptionState() {
        System.out.println("getAdoptionState");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        String expResult = "for adoption";
        String result = instance.getAdoptionState();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAdoptionState method, of class Cat.
     */
    @Test
    public void testSetAdoptionState() {
        System.out.println("setAdoptionState");
        String adoptionState = "adopted";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "", 25);
        instance.setAdoptionState(adoptionState);
        String expResult = "adopted";
        String result = instance.getAdoptionState();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAdoptionReason method, of class Cat.
     */
    @Test
    public void testGetAdoptionReason() {
        System.out.println("getAdoptionReason");
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "young", 25);
        String expResult = "young";
        String result = instance.getAdoptionReason();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAdoptionReason method, of class Cat.
     */
    @Test
    public void testSetAdoptionReason() {
        System.out.println("setAdoptionReason");
        String adoptionReason = "too old";
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "young", 25);
        instance.setAdoptionReason(adoptionReason);
        String expResult = "too old";
        String result = instance.getAdoptionReason();
        assertEquals(expResult, result);
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
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "young", 25);
        int expResult = 25;
        int result = instance.getAdoptionFees();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAdoptionFees method, of class Cat.
     */
    @Test
    public void testSetAdoptionFees() {
        System.out.println("setAdoptionFees");
        int adoptionFees = 20;
        Cat instance = new Cat(123,"tommy", "male", 2,"sphynx",null,"active",false,"none",true,true,"for adoption", "young", 25);
        instance.setAdoptionFees(adoptionFees);
        int expResult = 20;
        int result = instance.getAdoptionFees();
        assertEquals(expResult, result);
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
