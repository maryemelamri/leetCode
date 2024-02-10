String solution(String s) {
     char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        char[] tmp = s.toCharArray();
        s = "";

        // iterate through the string and determine if each char is
        // a vowel, consonant, or wildcard. Replace vowels and
        // consonants with known characters to simplify processing
        // in our next step
        for (char c : tmp) {
            if (c == '?') {
                s += c;
            } else if (contains(vowels, c)) {
                s += 'v';
            } else {
                s += 'c';
            }
        }

        // create a list of all permutations of the string
        List<String> mutated = mutate(s);
        int goodCount = 0;
        int badCount = 0;

        // iterate through all of the permutations
        for (String word : mutated) {
            // look for 3 vowels or 5 consonants, and increment badCount if there are any
            // otherwise increment goodCount
            if (word.contains("vvv") || word.contains("ccccc")) {
                badCount++;
            } else {
                goodCount++;
            }
        }

        // if there are both bad and good strings, then it is classified as 'mixed'.
        // If there are only bad strings, then it is classified as 'bad'.
        // If there are only good strings, then it is classified as 'good'.
        if (badCount > 0 && goodCount > 0) {
            return "mixed";
        } else if (badCount > 0) {
            return "bad";
        }
        return "good";
    }

    static List<String> mutate(String s) {
        // recursively mutate the string one wildcard at a time.

        // cache of words generated
        List<String> words = new ArrayList<>();

        // Find the first index of a wildcard character in the string.
        int index = s.indexOf('?');

        // if there are no wildcards left, simply return a list
        // containing only this string.
        if (index == -1) {
            words.add(s);
            return words;
        }

        // Variables to hold the two permutations
        char[] vowels = s.toCharArray();
        char[] cons = s.toCharArray();

        // Create a permutation that replaced the wildcard with a vowel
        vowels[index] = 'v';
        // Create a permutation that replaced the wildcard with a consonant
        cons[index] = 'c';

        // re-evaluate the strings to generate more permutations until there are
        // no more wildcard characters left.
        words.addAll(mutate(new String(vowels)));
        words.addAll(mutate(new String(cons)));

        return words;
    }

    static boolean contains(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;

}
/*
You categorize strings into three types: good, bad, or mixed. 
If a string has 3 consecutive vowels or 5 consecutive consonants, 
or both, then it is categorized as bad. Otherwise it is categorized as good. 
Vowels in the English alphabet are ["a", "e", "i", "o", "u"]
and all other letters are consonants.
The string can also contain the character ?,which can be replaced by either a vowel or a consonant. 
This means that the string "?aa" can be bad if ? is a vowel or good if it is a consonant.
This kind of string is categorized as mixed.
Implement a function that takes a string s and returns its category: good, bad, or mixed.
*/
