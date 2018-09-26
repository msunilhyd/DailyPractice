package com.linus.DailyPractice.vocab;

public class Vocab
{
	public static void main(String[] args) 
	{
		int count = 0;
		
		for(WordUbiquitous word : WordUbiquitous.values())
		{
			count = count +1;
		}
		System.out.println("Total number of vacab is : " + count);
	}
}


enum WordUbiquitous
{
	Ubiquitous,
	Impeccable,
	Pejorative,
	Impunity,
	Oxymoron,
	Cadence,
	Indelible,
	Malleable,
	Avarice,
	Trounce,
	Antithetical,
	Corroboration,
	Enunciate,
	Effecacious,
	Frantically,
	Elucidate,
	Eloquent,
	Vitiate,
	Sumptuous,
	Belligerent,
}

enum WordSetScrupulous
{
	Scrupulous,
	Implore,
	Reprimand;	
}