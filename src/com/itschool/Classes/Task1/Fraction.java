package com.itschool.Classes.Task1;

public class Fraction
{
	private int numerator; // числитель
	private int denominator; //знаменатель

	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public Fraction()
	{
		this.numerator = 0;
		this.denominator = 1;
	}

	public static Fraction BackFraction(Fraction fraction)
	{
		if (fraction.numerator == 0) {
			return new Fraction(fraction.denominator, 1);
		}
		else {
			return new Fraction(fraction.denominator, fraction.numerator);
		}
	}

	public static Fraction BackFraction(int numerator, int denominator)
	{
		if (numerator == 0) {
			return new Fraction(denominator, 1);
		}
		else {
			return new Fraction(denominator, numerator);
		}
	}

	public static Fraction ReduceFraction(Fraction fraction)
	{
		Fraction newFraction = new Fraction();
		int a = fraction.numerator < fraction.denominator ? fraction.numerator : fraction.denominator;
		int b = fraction.numerator > fraction.denominator ? fraction.numerator : fraction.denominator;

		for (int i = b; i >= 2; ) {
			if ((a % i == 0) && (b % i == 0)) {
				a /= i;
				b /= i;
			}
			else { i--; }
		}
		return new Fraction(b, a);
	}

	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}

	public Fraction BackFraction()
	{
		if (this.numerator == 0) {
			return new Fraction(this.denominator, 1);
		}
		else {
			return new Fraction(this.denominator, this.numerator);
		}
	}

	public void ReveseFraction()
	{
		if (this.numerator == 0) {
			this.numerator = denominator;
			this.denominator = 1;
		}
		else {
			int numerator = this.numerator;
			this.numerator = this.denominator;
			this.denominator = numerator;
		}
	}

	@Override
	public String toString()
	{
		return "\t" + numerator +
				"\n---------\n\t"
				+ denominator + "\n";
	}

	public void Add(Fraction fraction) { // as StringBuilder
		Fraction newFraction = new Fraction(
				this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator,
				this.denominator * fraction.getDenominator());
		this.numerator = newFraction.getNumerator();
		this.denominator = newFraction.getDenominator();

		this.numerator = Fraction.ReduceFraction(newFraction).numerator;
		this.denominator = Fraction.ReduceFraction(newFraction).denominator;
	}

	public static Fraction Add(Fraction fraction1, Fraction fraction2) {
		return new Fraction(
				fraction1.numerator * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.denominator,
				fraction1.denominator * fraction2.getDenominator());
	}

	public Fraction Sum(Fraction fraction) { // as String
		if (this.denominator == fraction.denominator) {
			return new Fraction(this.numerator + fraction.numerator, this.denominator);
		} else {
			return new Fraction(
					this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator,
					this.denominator * fraction.getDenominator());
		}
	}

}
