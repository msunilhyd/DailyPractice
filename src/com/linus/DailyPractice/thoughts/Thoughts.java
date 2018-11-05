package com.linus.DailyPractice.thoughts;

public class Thoughts 
{
	public static void main(String[] args) {
		Thought[] thoughtList;
		thoughtList = Thought.values();
		
		for(Thought s : thoughtList)
		{
			System.out.println(s.getQuote().toString());
		}
	}
}

enum Thought
{
	PAST("Past cannot be Changed."),
	OPINION("Opinions don't define your Reality."),
	JOURNEY("Everyone's Journey is Different."),
	TIME("Things always get better with Time."),
	JUDGEMENT("Judgements are confessions of one's Character."),
	OVERTHINKING("Overthinking will lead to Sadness."),
	HAPPINESS("Happiness is found Within."),
	POSITIVE("Positive thoughts create positive Things."),
	SMILES("Smiles are Contagious."),
	KINDNESS("Kindness is Free."),
	QUIT("You only Fail if you Quit."),
	AROUND("What goes around comes Around.");
	
	Thought(String quote)
	{
		this.quote = quote;
	}
	private String quote;
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
}
