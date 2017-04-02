/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Miles
 *
 */
public class SubtractionOperatorFor2Numbers extends OperatorFor2numbers implements Subtraction 
{
	public SubtractionOperatorFor2Numbers(float _number1, float number2)
	{
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1:" + _number1);
		System.out.println("number2:" + number2);
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtraction#subtraction(int, int)
	 */
	@Override
	public int subtraction(int num1, int num2)
	{
		return num1 - num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtraction#subtraction(float, float)
	 */
	@Override
	public float subtraction(float num1, float num2) 
	{
		return num1 - num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Subtraction#subtraction2numbers()
	 */
	@Override
	public float subtraction2numbers() 
	{
		System.out.println("_Number 1 is: " + number1);
		System.out.println("Number 2 is: " + number2);
		return number1 - number2;
	}
}

/*
public MultiplyOperatorFor2numbers() 
{
//	super();	// NOTE ilker if you don't call parent's constructor in a child class' constructor, java will automagically call default constructor of parent
}

public MultiplyOperatorFor2numbers(float _number1, float number2) 
{
	super(_number1,number2);	// NOTE 1st the parent's constructor executes
	System.out.println("parent's number1 is " + super.number1);
	System.out.println("_number1:" + _number1);
	System.out.println("number2 Sabrina says whatever:" + number2);
}

public MultiplyOperatorFor2numbers(float number1, float number2, String junk) 
{
	this(number1, number2);	// NOTE 1st the constructor above runs
	Float someJunk = this.multiply2numbers();
//	super(number1,number2);
//	System.out.println("number1:" + number1);
//	System.out.println("number2: Sabrina says whatever:" + number2);
	System.out.println("junk:" + junk);
}

@Override
public int multiply(int num1, int num2) 
{
	return num1 * num2;
}

@Override
public float multiply(float num1, float num2) 
{
	return num1 * num2;
}

@Override
public float multiply2numbers() 
{
//	System.out.println("parent's number1 is" + super.getNumber1());
	return number1 * number2;
} */

