/*
 * Copyright (c) 2017, Joeri Damian; Communication, Visual Art & Music 
 * MIT-License
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without 
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 * *The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software
 * *THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE. 


/*
 * Copyright (c) 2010, Oracle.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  * Neither the name of Oracle nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT 
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED 
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
 */

/* Anagram Game Application */

package com.toy.anagrams.lib;

/**
 * Implementation of the logic for the Anagram Game application.
 */
final class StaticWordLibrary extends WordLibrary {

    private static final String[] WORD_LIST = {
        "seitan",
        "tempeh",
        "tofu",
        "beans",
        "chickpeas",
        "circumstance",
        "combination",
        "consequently",
        "vegan",
        "paver",
        "dependency",
        "B12",
        "dynamic",
        "plantbased",
        "equivalent",
        "expression",
        "facilitate",
        "fragment",
        "hexadecimal",
        "implementation",
        "indistinguishable",
        "inheritance",
        "internet",
        "falafel",
        "localization",
        "hoummus",
        "navigation",
        "optimization",
        "water",
        "smoothie",
        "pickle",
        "fruits",
        "rigorously",
        "simultaneously",
        "recipe",
        "structure",
        "lexical",
        "likewise",
        "management",
        "manipulate",
        "mathematics",
        "cocunut",
        "soy",
        "almondmilk",
        "gluten"};

    private static final String[] SCRAMBLED_WORD_LIST = {
        "itsean",
        "tmpeeh",
        "otfu",
        "bsean",
        "cckpehias",
        "cicumtancrse",
        "tioncombina",
        "quentlyconse",
        "ganve",
        "erpav",
        "dependency",
        "2B1",
        "cdnamiy",
        "lpantbased",
        "teuiqvlaen",
        "erpessionx",
        "facilitate",
        "rfgament",
        "xehdaecimal",
        "implementatino",
        "idnsitiungishbael",
        "inheritance",
        "itnenrte",
        "alfalfe",
        "localization",
        "homumsu",
        "navigatnio",
        "potimiaziton",
        "awtre",
        "mosotihe",
        "pickle",
        "fruits",
        "rigorously",
        "isumltaneuosly",
        "ericep",
        "sutcrture",
        "lexical",
        "ilkeiwse",
        "nmnaagemet",
        "mapnuliate",
        "mathematics",
        "cucunto",
        "yso",
        "lmndamilko",
        "gutenl"
    };
    
    final static WordLibrary DEFAULT = new StaticWordLibrary();

    /**
     * Singleton class.
     */
    private StaticWordLibrary() {
    }

    /**
     * Gets the word at a given index.
     * @param idx index of required word
     * @return word at that index in its natural form
     */
    public String getWord(int idx) {
        return WORD_LIST[idx];
    }

    /**
     * Gets the word at a given index in its scrambled form.
     * @param idx index of required word
     * @return word at that index in its scrambled form
     */
    public String getScrambledWord(int idx) {
        return SCRAMBLED_WORD_LIST[idx];
    }

    /**
     * Gets the number of words in the library.
     * @return the total number of plain/scrambled word pairs in the library
     */
    public int getSize() {
        return WORD_LIST.length;
    }

    /**
     * Checks whether a user's guess for a word at the given index is correct.
     * @param idx index of the word guessed
     * @param userGuess the user's guess for the actual word
     * @return true if the guess was correct; false otherwise
     */
    public boolean isCorrect(int idx, String userGuess) {
        return userGuess.equals(getWord(idx));
    }

}
