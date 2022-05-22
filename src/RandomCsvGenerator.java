import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomCsvGenerator {
    private final Random random = new Random();
    private final List<String> firstnames;
    private final List<String> surnames;
    private final List<String> dates;
    private final List<String> emails;
    private final List<String> streets;
    private final List<String> cities;
    private final List<String> zipcodes;
    private final List<String> jobs;


    public RandomCsvGenerator() {
        this.firstnames = createFirstnamesArray();
        this.surnames = createSurnamesArray();
        this.dates = createDates();
        this.emails = createEmails();
        this.streets = createStreets();
        this.cities = createCities();
        this.zipcodes = createZipcodes();
        this.jobs = createJobs();
    }

    public String getCsvDummyString(int lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines; ++i) {
            for (int j = 0; j < 9; ++j) {
                switch (j) {
                    case 0:
                        sb.append(this.firstnames.get(this.getRandomInteger())
                                .replace("ä", "ae")
                                .replace("ö", "oe")
                                .replace("ü", "ue"));
                        break;
                    case 1:
                        sb.append(this.surnames.get(this.getRandomInteger())
                                .replace("ä", "ae")
                                .replace("ö", "oe")
                                .replace("ü", "ue"));
                        break;
                    case 2:
                        sb.append(this.dates.get(this.getRandomInteger()));
                        break;
                    case 3:
                        String street = this.streets.get(this.getRandomInteger()) + " " + random.nextInt(50);
                        sb.append(street.replace("ä", "ae")
                                .replace("ö", "oe")
                                .replace("ü", "ue"));
                        break;
                    case 4:
                        sb.append(this.cities.get(this.getRandomInteger()).replace("ä", "ae")
                                .replace("ö", "oe")
                                .replace("ü", "ue"));
                        break;
                    case 5:
                        sb.append(this.zipcodes.get(this.getRandomInteger()).replace("ä", "ae")
                                .replace("ö", "oe")
                                .replace("ü", "ue"));
                        break;
                    case 6:
                        sb.append(this.jobs.get(this.getRandomInteger(this.jobs.size() - 1)));
                        break;
                    case 7:
                        sb.append(getRandomInteger(20000, 100000));
                    default:
                        break;
                }

                if (j < 7) {
                    sb.append(",");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private int getRandomInteger() {
        return random.nextInt(49);
    }

    private int getRandomInteger(int bound) {
        return random.nextInt(bound);
    }


    private int getRandomInteger(int min, int max) {
        return random.nextInt((max - min) + 1) + 20000;
    }

    private List<String> createFirstnamesArray() {
        return new ArrayList<>(Arrays.asList("Gloria", "Hortensia", "Raven", "Mozelle", "Bart", "Willetta", "Shawnee", "Jackie", "Jerica", "Domingo", "Douglass", "Katie", "Lezlie", "Johnette", "Temeka", "Nakia", "Paris", "Shirlene", "Nikole", "Ralph", "Catrice", "Bertie", "Mila", "Lisette", "Tricia", "Jon", "Yu", "Vanessa", "Luisa", "Romaine", "Yun", "Rhea", "Terrance", "Reuben", "Lucia", "Ok", "Lawanda", "Mamie", "Enola", "Cammy", "Lynnette", "Johna", "Lani", "Felipe", "Veta", "Marcella", "Tamisha", "Cleveland", "Aurora", "Signe"));
    }

    private List<String> createSurnamesArray() {
        return new ArrayList<>(Arrays.asList("Jacks", "Ivory", "Strong", "Mcnair", "Valerio", "Diaz", "Kellogg", "Meyer", "Reis", "Fellows", "Lamar", "Stanton", "Goetz", "Sturgill", "Furlong", "Tharp", "Minor", "Hoang", "Archibald", "Spicer", "Swann", "Foy", "Correia", "Sasser", "Lavigne", "Burrows", "Delgado", "Khan", "Fortin", "Ivey", "Durant", "Trask", "Thorpe", "Weaver", "Batchelor", "Wyatt", "Stclair", "Carter", "Klinger", "Carpenter", "Kenyon", "Dickens-Mccloud", "Willey-Kopp", "Berlin", "Keeling", "Rohr", "Reichert", "Gruber", "Herring", "Ammons"));
    }

    private List<String> createDates() {
        return new ArrayList<>(Arrays.asList("2013-07-02", "1995-12-16", "2017-05-20", "2015-09-05", "1985-05-25", "1989-12-23", "2020-06-26", "1985-04-27", "2006-08-11", "2004-05-06", "1971-09-29", "1974-02-22", "1992-04-30", "1973-02-08", "1975-03-14", "1977-04-22", "1972-05-21", "1983-04-24", "1989-06-23", "1996-06-12", "1993-05-02", "2018-11-20", "1990-02-15", "2016-08-26", "2006-09-05", "2010-03-04", "2000-06-22", "2000-08-22", "1977-06-28", "2011-01-25", "1985-12-27", "2005-01-25", "1983-12-10", "2004-06-04", "1989-12-06", "1993-10-09", "1974-12-08", "2008-05-21", "1977-11-22", "1997-05-24", "2007-10-23", "1982-12-26", "1987-12-02", "1973-05-18", "2015-08-17", "2016-06-23", "1993-08-17", "2010-05-04", "1986-10-25", "1974-12-15"));
    }

    private List<String> createEmails() {
        return new ArrayList<>(Arrays.asList("taisha.stowe64909@hotmail.com", "diann480@hotmail.com", "mertierains590@gmail.com", "bess436@yahoo.com", "starla_prince105@hotmail.com", "ferne1@packard.com", "takakoolive@hotmail.com", "leah.muir2@announcement.com", "dan049@gmail.com", "dudley763@hotmail.com", "cierra_mills@wondering.com", "michiko.lance4@gmail.com", "samual10005@yahoo.com", "simona.patton124@hotmail.com", "marilynn1@merge.com", "earlean.dupuis@gmail.com", "altagracia889@fy.com", "aurorestorey4589@november.com", "ira6@appreciated.com", "callie.barraza82@marina.com", "angelique-sparrow@declared.com", "jazminearnold45319@pa.com", "lurlene7041@firm.barrel-of-knowledge.info", "eleonora.rohr@yahoo.com", "bret2@hotmail.com", "arlena4@howard.com", "candra.langer@j.com", "ayanna.barber@execution.com", "terresa-leavitt3@gmail.com", "gerald_vanover4712@hotmail.com", "ermelinda.atwood66179@twisted.com", "treasa_cyr@hotmail.com", "mamie61650@mandatory.com", "garth_wilcox37221@rarely.com", "delsie-raynor-bagwell8476@yahoo.com", "danuta-carrico503@hotmail.com", "carey80@dance.com", "agueda_knight867@gmail.com", "mariah_phelan@gmail.com", "dorinda.weis0@humans.com", "ona_casteel1@designed.com", "laurie_ocampo12519@gmail.com", "franceneolvera93@hotmail.com", "natashia02@identical.com", "merrilee37624@gmail.com", "soila.mccorkle@gmail.com", "vicky823@drain.com", "sammie.elizondo661@hotmail.com", "kisha1@tmp.com", "arlyne.wilkins928@gmail.com"));
    }

    private List<String> createCities() {
        return new ArrayList<>(Arrays.asList("Siegburg", "Rotenburg", "Wittenberg", "Bremen", "Hanau", "Kiel", "Warendorf", "Burg", "Erlangen", "Günzburg", "Celle", "Neuruppin", "Gotha", "Marburg", "Eichstätt", "Hagen", "Miesbach", "Kirchheimbolanden", "Freiburg", "Halberstadt", "Hildburghausen", "Pirmasens", "Coesfeld", "Homburg", "Kronach", "Neunkirchen", "Heilbad Heiligenstadt", "Neunkirchen", "Heilbad Heiligenstadt", "Solingen", "Ebersberg", "Altenkirchen", "Sömmerda", "Lauf", "Merseburg", "Seelow", "Nordhorn", "Goslar", "Gütersloh", "Bremerhaven", "Tuttlingen", "Kronach", "Eschwege", "Heinsberg", "Offenbach", "Siegburg", "Balingen", "Lauf", "Augsburg", "Steinfurt"));
    }

    private List<String> createStreets() {
        return new ArrayList<>(Arrays.asList("Dorfstrasse", "Blumenweg", "Heuweg", "Blumenweg", "Dorfstrasse", "Bahnhofstrasse", "Hauptstrasse", "Heuweg", "Hauptstrasse", "Dorfstrasse", "Hauptstrasse", "Heuweg", "Hauptstrasse", "Feldweg", "Dorfstrasse", "Hauptstrasse", "Feldweg", "Hauptstrasse", "Hauptstrasse", "Hauptstrasse", "Gartenstrasse", "Blumenweg", "Bahnhofstrasse", "Bahnhofstrasse", "Hubertusstrasse", "Dorfstrasse", "Hubertusstrasse", "Bahnhofstrasse", "Feldweg", "Dorfstrasse", "Hubertusstrasse", "Blumenweg", "Feldweg", "Bahnhofstrasse", "Schulstrasse", "Schulstrasse", "Blumenweg", "Hauptstrasse", "Hubertusstrasse", "Heuweg", "Hubertusstrasse", "Dorfstrasse", "Dorfstrasse", "Gartenstrasse", "Hubertusstrasse", "Hubertusstrasse", "Dorfstrasse", "Blumenweg", "Gartenstrasse", "Hubertusstrasse"));
    }

    private List<String> createZipcodes() {
        return new ArrayList<>(Arrays.asList("90385", "77444", "60028", "58548", "74899", "56711", "96417", "89518", "92706", "60116", "42490", "71280", "47791", "70907", "68823", "68120", "48727", "15825", "90957", "56543", "56442", "61199", "87536", "03521", "84506", "43457", "23293", "97386", "00401", "59982", "75894", "99077", "48072", "42733", "24196", "60889", "62563", "31027", "57032", "98013", "61642", "33951", "14597", "46187", "77776", "60041", "09872", "94995", "76544", "78571"));
    }

    private List<String> createJobs() {
        return new ArrayList<>(
                Arrays.asList(
                        "Developer",
                        "Engineer",
                        "Manager",
                        "Craftsman",
                        "CEO",
                        "Laborer"
                )
        );
    }

}
