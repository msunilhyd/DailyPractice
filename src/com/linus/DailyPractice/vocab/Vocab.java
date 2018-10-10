package com.linus.DailyPractice.vocab;

public class Vocab
{
	public static void main(String[] args) 
	{
		int count = 0;

		for(VocabUbiquitous word : VocabUbiquitous.values())
		{
			count = count +1;
		}
		for(VocabScrupulous word : VocabScrupulous.values())
		{
			count = count + 1;
		}
		System.out.println("Total number of vacab is : " + count);
	}
}

enum VocabUbiquitous
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
	Belligerent;	
}

enum VocabScrupulous
{
	Scrupulous,
	Implore,
	Reprimand,	
	Tepid,
	Beckon,
	Upcycle,
	Spectre,
	Epoch,
	Fervour,
	Chivalrous,
	Philistine,
	Slothful,
	Indolence,
	Antiquated,
	Ossify,
	Chagrin,
	Zealot,
	Laudable,
	Idyllic,
	Motley;
}

enum Unconscionable
{
	Unconscionable,
	Asunder,
	Nether,
	Subsistence,
	Fetter,
	Viscissitudes,
	Incisicve,
	Contentious,
	Scathing,
	Malevolent,
	Coercion;
}