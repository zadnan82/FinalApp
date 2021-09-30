package com.example.finalapp

object Constants2 {




init {
    getQuestionsMoney2()
    getQuestionsGeo2()
    getQuestionsCulture2()
    getQuestionsLanguage2()
}

    fun getQuestionsMoney2() : ArrayList<QuestionClass2> {
        val moneyQuestionsList2 = ArrayList<QuestionClass2>()

        val qus1 = QuestionClass2 ( 1, R.drawable.money1, "Which country was first to use printed paper currency?",
            "India", "China", "Germany", "Great Britain", 2)
        val qus2 = QuestionClass2 ( 2, R.drawable.money2, "What is the currency of Ecuador?",
            "Peso", "Tuman", "Dollar", "Rupie", 3)
        val qus3 = QuestionClass2 ( 3, R.drawable.money3, "Who was the first civilisation to issue regulated coins??",
            "Greece", "Persia", "Lydia", "Babylon", 3)
        val qus4 = QuestionClass2 ( 4, R.drawable.money4, "From what material was the currency in ancient Rome made?",
            "Gold", "Silver", "Wood", "Leather", 4)
        val qus5 = QuestionClass2 (5,  R.drawable.money5, "Which is the first independent credit card firm in the world",
            "Visa", "Diners Club", "Mastercard", "JCB", 2)
        val qus6 = QuestionClass2 ( 6, R.drawable.money11, "What is the most popular banknote in the world??",
            "50 Euro", "50 Pound Sterling", "100 US Dollar", "1000 Chinese Yen", 3)
        val qus7 = QuestionClass2 ( 7, R.drawable.money, "What material is no longer used for making coins?",
            "Bronze", "Gold", "Tin", "Copper", 3)
        val qus8 = QuestionClass2 ( 8, R.drawable.money8, "Who said: 'It costs a lot of money to look this cheap?",
            "Dolly Parton", "Warren Buffet", "Nicolas Cage", "Bill Gates", 1)
        val qus9 = QuestionClass2 ( 9, R.drawable.money9, "What is the most faked currency in the world?",
            "Pound Sterling", "US Dollar", "Euro", "Japanese Yen", 1)
        val qus10 = QuestionClass2 (10,  R.drawable.money10, "MAD is the official currency of which African country?",
            "Algeria", "Egypt", "Sudan", "Morocco", 4)

        moneyQuestionsList2.add(qus1)
        moneyQuestionsList2.add(qus2)
        moneyQuestionsList2.add(qus3)
        moneyQuestionsList2.add(qus4)
        moneyQuestionsList2.add(qus5)
        moneyQuestionsList2.add(qus6)
        moneyQuestionsList2.add(qus7)
        moneyQuestionsList2.add(qus8)
        moneyQuestionsList2.add(qus9)
        moneyQuestionsList2.add(qus10)

        return moneyQuestionsList2
    }


    fun getQuestionsGeo2() : ArrayList<QuestionClass2> {
        val geoQuestionsList2 = ArrayList<QuestionClass2>()

        val qus1 = QuestionClass2 ( 1, R.drawable.geo, "What is the capital of Malta?",
            "Malta", "Valetta", "Limasol", "Split", 2)
        val qus2 = QuestionClass2 ( 2, R.drawable.iquazu1, "What is the name of this beauty?",
            "Niagara Falls", "Iguazu Falls", "Victoria Falls", "Horseshoe Falls", 2)
        val qus3 = QuestionClass2 ( 3, R.drawable.pompeii, "What is the name of these ruins?",
            "Petra", "Acropolis", "Palmyra", "Pompeii", 4)
        val qus4 = QuestionClass2 ( 4, R.drawable.babylon, "Where is The Hanging Garden located?",
            "Cairo", "Aleppo", "Babylon", "Ur", 3)
        val qus5 = QuestionClass2 (5,  R.drawable.sacrec, "What is the name of this building?",
            "The Dome Church", "Notre Dame", "Segrada Familia", "Sacre Cour", 4)
        val qus6 = QuestionClass2 ( 6, R.drawable.hooverdam, "What dam is this?",
            "Theodore Roosevelt Dam", "Three Gorges Dam", "Tarbela Dam", "Hoover Dam", 4)
        val qus7 = QuestionClass2 ( 7, R.drawable.galapagos, "Galapagos belongs to which country?",
            "Mexico", "Ecuador", "Colombia", "Panama", 2)
        val qus8 = QuestionClass2 ( 8, R.drawable.bluemosque, "What is the name of this mosque?",
            "Sultan Ahmet", "The grand mosque", "Hagia Sofia", "The dome", 1)
        val qus9 = QuestionClass2 ( 9, R.drawable.culture1, "What African country has the largest population?",
            "Nigeria", "South Africa", "Egypt", "Kenya", 1)
        val qus10 = QuestionClass2 (10,  R.drawable.geo, "What is the largest desert in the world?",
            "Mojave Desert", "Thar Desert", "Sahara Desert ", "Antarctica", 4)

        geoQuestionsList2.add(qus1)
        geoQuestionsList2.add(qus2)
        geoQuestionsList2.add(qus3)
        geoQuestionsList2.add(qus4)
        geoQuestionsList2.add(qus5)
        geoQuestionsList2.add(qus6)
        geoQuestionsList2.add(qus7)
        geoQuestionsList2.add(qus8)
        geoQuestionsList2.add(qus9)
        geoQuestionsList2.add(qus10)

        return geoQuestionsList2
    }
    fun getQuestionsCulture2() : ArrayList<QuestionClass2> {
        val cultureQuestionsList2 = ArrayList<QuestionClass2>()

        val qus1 = QuestionClass2 ( 1, R.drawable.cul1, "Which country is known as “the land of no rivers”?",
            "Tunisia", "Saudi Arabia", "Singapore", "Jew", 2)
        val qus2 = QuestionClass2 ( 2, R.drawable.cul2, "How many Star Wars movies are there?",
            "7", "8", "6", "9", 4)
        val qus3 = QuestionClass2 ( 3, R.drawable.cul3, "Who was Walt Disney’s favorite princess?",
            "Rapunzel", "Pocahontas", "Cinderella", "Snow White", 3)
        val qus4 = QuestionClass2 ( 4, R.drawable.cul1, "Who was the first actor to portray James Bond?",
            "Barry Nelson", "Pierce Brosnan", "Daniel Craig", "Clint Eastwood", 1)
        val qus5 = QuestionClass2 (5,  R.drawable.cul2, "What is the biggest religion in the world?",
            "Islam", "Christianity", "Hinduism", "Budism", 2)
        val qus6 = QuestionClass2 ( 6, R.drawable.cul3, "What is the highest-grossing romantic comedy?",
            "Monster in law", "My Big Fat Greek Wedding", "Love Actually", "The proposal", 2)
        val qus7 = QuestionClass2 ( 7, R.drawable.cul1, "Which Country’s flag includes a Cedar Tree?",
            "Jordan", "Tunisia", "Lebanon", "Pakistan", 4)
        val qus8 = QuestionClass2 ( 8, R.drawable.cul2, "IWhat is the name of the family dog on Full House?",
            "Jackie", "Teddy", "Billy", "Comet", 4)
        val qus9 = QuestionClass2 ( 9, R.drawable.cul3, "What was Ross's pet monkey name on Friends?",
            "Jack", "Ben", "Marcel", "Tony", 3)
        val qus10 = QuestionClass2 (10,  R.drawable.cul1, "What movie has the best-selling soundtrack ever?",
            "The Body Guard", "Titanic", "Frozen", "James Bond", 1)

        cultureQuestionsList2.add(qus1)
        cultureQuestionsList2.add(qus2)
        cultureQuestionsList2.add(qus3)
        cultureQuestionsList2.add(qus4)
        cultureQuestionsList2.add(qus5)
        cultureQuestionsList2.add(qus6)
        cultureQuestionsList2.add(qus7)
        cultureQuestionsList2.add(qus8)
        cultureQuestionsList2.add(qus9)
        cultureQuestionsList2.add(qus10)


        return cultureQuestionsList2
    }
    fun getQuestionsLanguage2() : ArrayList<QuestionClass2> {
        val languageQuestionsList2 = ArrayList<QuestionClass2>()

        val qus1 = QuestionClass2 ( 1, R.drawable.lang1, "What is the most popular language in the world??",
            "Arabic", "English", "Chinese", "Spanish", 3)
        val qus2 = QuestionClass2 ( 2, R.drawable.lang2, "Which of the following is not a Germanic language?",
            "Swedish", "Dutch", "French", "Icelandic", 3)
        val qus3 = QuestionClass2 ( 3, R.drawable.lang3, "Which of the following languages has no alphabet?",
            "Thai", "Korean", "Japanese", "Chinese", 4)
        val qus4 = QuestionClass2 ( 4, R.drawable.lang1, "Which continent has the most languages?",
            "Asia", "Europe", "Africa", "South America", 1)
        val qus5 = QuestionClass2 (5,  R.drawable.lang2, "How many national languages are there in Switzerland?",
            "2", "4", "3", "5", 2)
        val qus6 = QuestionClass2 ( 6, R.drawable.lang3, "Which country has up to 16 official languages?",
            "Zimbabwe", "South Africa", "India", "China", 1)
        val qus7 = QuestionClass2 ( 7, R.drawable.lang1, "The writing form of languages originated from?",
            "India", "Mesopotamia", "Egypt", "Maya", 2)
        val qus8 = QuestionClass2 ( 8, R.drawable.lang2, "Which of the following languages uses the Latin alphabet?",
            "Thai", "Japanese", "Chinese", "Vietnamese", 3)
        val qus9 = QuestionClass2 ( 9, R.drawable.lang3, "What is the language spoken in Brazil?",
            "Spanish", "Portugese", "English", "French", 2)
        val qus10 = QuestionClass2 (10,  R.drawable.lang1, "Which language has the largest number of words?",
            "Chinese", "English", "Arabic", "French", 2)

        languageQuestionsList2.add(qus1)
        languageQuestionsList2.add(qus2)
        languageQuestionsList2.add(qus3)
        languageQuestionsList2.add(qus4)
        languageQuestionsList2.add(qus5)
        languageQuestionsList2.add(qus6)
        languageQuestionsList2.add(qus7)
        languageQuestionsList2.add(qus8)
        languageQuestionsList2.add(qus9)
        languageQuestionsList2.add(qus10)

        return languageQuestionsList2
    }
}
