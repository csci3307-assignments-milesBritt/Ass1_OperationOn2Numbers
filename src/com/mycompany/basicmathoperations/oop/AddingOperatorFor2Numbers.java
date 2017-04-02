/**
 * 
 */
package com.mycompany.basicmathoperations.oop;

/**
 * @author Miles
 *
 */
public class AddingOperatorFor2Numbers extends OperatorFor2numbers implements Addition
{
	public AddingOperatorFor2Numbers(float _number1, float number2) 
	{
		super(_number1,number2);	// NOTE 1st the parent's constructor executes
		System.out.println("parent's number1 is " + super.number1);
		System.out.println("_number1:" + _number1);
		System.out.println("number2:" + number2);
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition(int, int)
	 */
	@Override
	public int addition(int num1, int num2) 
	{
		return num1 + num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition(float, float)
	 */
	@Override
	public float addition(float num1, float num2) 
	{
		return num1 + num2;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.basicmathoperations.oop.Addition#addition2numbers()
	 */
	@Override
	public float addition2numbers() 
	{
		return number1 + number2;
	}
}