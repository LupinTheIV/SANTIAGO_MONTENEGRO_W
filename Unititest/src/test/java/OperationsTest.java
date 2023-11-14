/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.unititest.Operations;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Santy
 */
public class OperationsTest {
    public OperationsTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //1
    @Test
    public void NextNumber_UserNumberGTown_AddedNumber(){
        //Arrange (setup <- que es lo que voy a usar)
        int userNumber = 10;
        int expectedResult = 11;
        //Act (metodos que voy a usar)
        int result = Operations.NextNumber(userNumber);
        //Assert
        assertEquals(11, result);
    }
    
    //2
    @Test
    public void RandomNumberIncreced_GeneratedRandomNumber_Increcedby30(){
        //Arrange
        int randomNumber = 166;
        double expectedNumber = 215.8;
        //Act
        double result = Operations.Random_by30(randomNumber);
        //Assert
        assertEquals(215.8,result);
    }
    //10
    @Test
    public void IsDivisible_UserNumberGtown_AddedNumber(){
        //Arrange
        int firstNumber = 5;
        int secNumber = 5;
        boolean result = true;
     
        //Act
        boolean methodResult = Operations.IsDivisible(firstNumber, secNumber);
        
        //Assert
        assertTrue(methodResult);
    } 
    //14
    @Test
    public void TypeOfTriangle_TriangleSides_TypeEquilateral(){
        //Arrange
        int side1 = 5;
        int side2 = 5;
        int side3 = 5;
        String expectedResult = "Equilateral";
        //Act
        String result = Operations.triangleType(side1, side2, side3);
        //Assert
        assertEquals(result, "Equilateral");
    }
    @Test
    public void TypeOfTriangle_TriangleSides_TypeIsoceles(){
        //Arrange
        int side1 = 5;
        int side2 = 5;
        int side3 = 9;
        String expectedResult = "Isosceles";
        //Act
        String result = Operations.triangleType(side1, side2, side3);
        //Assert
        assertEquals(result, "Isosceles");
    }
    @Test
    public void TypeOfTriangle_TriangleSides_TypeScalene(){
        //Arrange
        int side1 = 14;
        int side2 = 12;
        int side3 = 13;
        String expectedResult = "Scalene";
        //Act
        String result = Operations.triangleType(side1, side2, side3);
        //Assert
        assertEquals(result, "Scalene");
    }
    @Test
    public void TypeOfTriangle_TriangleSides_TypeUnknown(){
        //Arrange
        int side1 = 12;
        int side2 = 13;
        int side3 = 50;
        String expectedResult = "Unknown";
        //Act
        String result = Operations.triangleType(side1, side2, side3);
        //Assert
        assertEquals(result, "Unknown");
    }
}
