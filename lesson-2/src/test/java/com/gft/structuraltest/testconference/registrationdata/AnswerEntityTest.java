package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;


public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
		AnswerEntity an3 = new AnswerEntity();
		
		// creating object of class Frank
		Frank fr = new Frank();
		
		//Checking if objecj of class AnswerEntity equals null
        assertFalse(an1.equals(an2));
		
		//Checking if object equals himself
		assertTrue(an1.equals(an1));
		
		//Checking if object of class 'AnserEntity' equals object of class 'Frank'
		assertFalse(an1.equals(fr));
		
		//Checking if an1 and an3 are objects of the same class
		assertTrue(an1.equals(an3));
		
		//an1 AnswerText is null, an3 AnserText is not null
		an3.setAnswerText("Test");
		assertFalse(an1.equals(an3));
		
		//an1 AnswerText is not null but it's different than AnswerText of object an3
		an1.setAnswerText("Test1");
		assertFalse(an1.equals(an3));
		
		// objects an1 and an3 have the same AnswerText
		an1.setAnswerText("Test");
		assertTrue(an1.equals(an3));
		
		//an1 have Id == null but an3 have Id==666
		long belzebub = 666;
		an3.setId(belzebub);
		assertFalse(an1.equals(an3));
		
		//an1 have Id value of 95 but and have Id == 666
		long vault95 = 95;
		an1.setId(vault95);
		assertFalse(an1.equals(an3));
		
		//an1 and an3 have the same Id
		belzebub = 95;
		an3.setId(belzebub);
		assertTrue(an1.equals(an3));
		
		// an1 have null Question variable, an3 Question is not null
		an1.setQuestion(null);
		QuestionEntity q3 = new QuestionEntity();
		an3.setQuestion(q3);
		assertFalse(an1.equals(an3));
		
		// an1 and an3 have not null Question variable but they are not the same
		an1.setQuestion(new QuestionEntity());
		assertFalse(an1.equals(an3));
		
		// an1 and an3 have the same Question variable
		an1.setQuestion(q3);
		assertTrue(an1.equals(an3));
		
		//Getting question variable from an1
		an1.getQuestion();
		
		//Converting an1 to String
		an1.toString();
		
		//Playing hashCode in an1
		an1.hashCode();
		
		//Playing hashCode in an4, where variables are null
		AnswerEntity an4 = new AnswerEntity();
		an4.hashCode();
    }
    
}