package com.example.mymovielist;

import android.view.View;

public class Movies {


    private String name = "";
    private String description = "";
    private String director = "";
    private String cast = "";
    private int imageId = 0;
    private static final int CATEGORY_ID = 0;

    public static Movies[] StarWars = {
            new Movies("Star Wars",
                    "The collector edition",
                    "George Lucas",
                    "Mark Hamill, Carrie Fisher, Harrison Ford",
                    R.drawable.starwars)
    };
    public static Movies[] Dunkirk = {
            new Movies("DUNKIRK",
                    "The British retreat during world war 2",
                    "Christopher Nolan",
                    "Harry Styles, Mark Rylance, Fionn Whitehead, Tom Hardy, Cillian Murphy",
                    R.drawable.dunkirk)
    };
    public static Movies[] TopicThunder = {
            new Movies("Topic Thunder",
                    "A band of actors trying to make a movie when things goes wrong...",
                    "Ben Stiller",
                    "Rober Downey Jr. , Jack Black, Kay Baruchel, Brandon T.Jackson, Ben Stiller",
                    R.drawable.tropicthunder)
    };
    public static Movies[] BandofBrothers = {
            new Movies("Band of Brothers",
                    "A true story from the 101 airborn division",
                    "Steven Spielberg",
                    "Damian Lewis, Michael Fassbender, Rock Gomez, Micheal Cudlitz, Ron Livingston",
                    R.drawable.bandofbrothers)
    };
    public static Movies[] Venom = {
            new Movies("Venom",
                    "an foreign Alien that need a host",
                    "Ruben Fleisher",
                    "Tom Hardy, Michelle Williams, Riz Ahmed",
                    R.drawable.venom)
    };
    public static Movies[] DeadPool = {
            new Movies("DeadPool",
                    "the man with the red suit, people he doesn't want people to see him bleed",
                    "Tim Miller",
                    "Ryan Reynolds, Karan Soni, Ed Skrein",
                    R.drawable.deadpool)
    };
    public static Movies[] IronMan = {
            new Movies("IronMan",
                    "I man that builds an Iron suit and became IronMan",
                    "Jon Favreau",
                    "Robert Downey Jr., Terrence Howard, Jeff Bridges",
                    R.drawable.ironman)
    };
    public static Movies[] GuardiansoftheGalaxy2 = {
            new Movies("Guardians of the Galaxy 2",
                    "They call him the Star Lord",
                    "James Gunn", "Chris Pratt, Zoe Saldana, Dave Bautista",
                    R.drawable.guardians)
    };
    public static Movies[] It = {
            new Movies("It",
                    "a clown that kills children",
                    "Andy Muschietti",
                    "Jaeden Martell, Jeremy Ray Taylor, Sophia Lillis",
                    R.drawable.it)
    };
    public static Movies[] Fury = {
            new Movies("Fury",
                    "A story about a tanker in world war 2",
                    "David Ayer",
                    "Brad Pitt, Shia LaBeouf, Logan Lerman",
                    R.drawable.fury)
    };
    public static Movies[] TheDictator = {
            new Movies("The Dictator",
                    "The last dictator that came to America and changed his life",
                    "Larry Charles",
                    "Sasha Baron Cohen",
                    R.drawable.borat)
    };
    public static Movies[] ShawnoftheDead = {
            new Movies("Shawn of the Dead",
                    "When the Zombies take over, count on Shaun to save the day",
                    "Edgar Wright",
                    "Simon Pegg, Kate Ashfield, Nick Frost",
                    R.drawable.shawnofthedead)
    };


    public Movies(String name, String description, String director, String cast, int imageId) {
        this.name = name;
        this.description = description;
        this.director = director;
        this.cast = cast;
        this.imageId = imageId;
    }


    public String getName() {return name;}

    public String getDescription() {return description;}

    public String getDirector() {return director;}

    public String getCast() {return cast;}

    public int getImageId() {return imageId;}

    public static int getCategoryId(View v) {

        int categoryId = 0;
        int buttonId = v.getId();
        int starwarsId = 1;
        int dunkirkId = 2;
        int tropicthunderId = 3;
        int bandofbrothersId = 4;
        int venomId = 5;
        int deadpoolId = 6;
        int ironmanId = 7;
        int guardiansofthegalaxy2Id = 8;
        int itId = 9;
        int furyId = 10;
        int thedictatorId = 11;
        int shawnofthedeadId = 12;
/*
        switch(buttonId) {
            case R.id.btn_starwars:
                categoryId = starwarsId;
                break;
            case R.id.btn_dunkirk:
                categoryId = dunkirkId;
                break;
            case R.id.btn_tropicthunder:
                categoryId = tropicthunderId;
                break;
            case R.id.btn_bandofbrothers:
                categoryId = bandofbrothersId;
                break;
            case R.id.btn_venom:
                categoryId = venomId;
                break;
            case R.id.btn_deadpool:
                categoryId = deadpoolId;
                break;
            case R.id.btn_ironman:
                categoryId = ironmanId;
                break;
            case R.id.btn_guardianofthegalaxy2:
                categoryId = guardiansofthegalaxy2Id;
                break;
            case R.id.btn_it:
                categoryId = itIdt;
                break;
            case R.id.btn_fury:
                categoryId = furyId;
                break;
            case R.id.btn_thedictator:
                categoryId = thedictatorId;
                break;
            case R.id.btn_shawnofthedead:
                categoryId = shawnofthedeadId;
                break;
        }

        */
return categoryId;
    }
    public static Movies[] getCategoryMovies(int categoryId) {
        Movies[] categoryMovies = null;
        switch (categoryId) {
            case 1:
                ;
                categoryMovies = Movies.StarWars;
                break;
            case 2:
                ;
                categoryMovies = Movies.Dunkirk;
                break;
            case 3:
                ;
                categoryMovies = Movies.TopicThunder;
                break;
            case 4:
                ;
                categoryMovies = Movies.BandofBrothers;
                break;
            case 5:
                ;
                categoryMovies = Movies.Venom;
                break;
            case 6:
                ;
                categoryMovies = Movies.DeadPool;
                break;
            case 7:
                ;
                categoryMovies = Movies.IronMan;
                break;
            case 8:
                ;
                categoryMovies = Movies.GuardiansoftheGalaxy2;
                break;
            case 9:
                ;
                categoryMovies = Movies.It;
                break;
            case 10:
                ;
                categoryMovies = Movies.Fury;
                break;
            case 11:
                ;
                categoryMovies = Movies.TheDictator;
                break;
            case 12:
                ;
                categoryMovies = Movies.ShawnoftheDead;
                break;
        }
        return categoryMovies;
    }

    @Override
    public String toString() {return name; }
}
