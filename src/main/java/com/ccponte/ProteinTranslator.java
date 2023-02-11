package com.ccponte;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ProteinTranslator {

//    Solution using enum
//    private enum Rna {
//        AUG("Methionine"),
//        UUU("Phenylalanine"),
//        UUC("Phenylalanine"),
//        UUA("Leucine"),
//        UUG("Leucine"),
//        UCU("Serine"),
//        UCC("Serine"),
//        UCA("Serine"),
//        UCG("Serine"),
//        UAU("Tyrosine"),
//        UAC("Tyrosine"),
//        UGU("Cysteine"),
//        UGC("Cysteine"),
//        UGG("Tryptophan"),
//        UAA("STOP"),
//        UAG("STOP"),
//        UGA("STOP");
//
//        private String value;
//
//        Rna(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return this.value;
//        }
//
//    }
//
//    List<String> translate(String rnaSequence) {
//
//        List<String> proteinList = new ArrayList<>();
//
//        for (int i = 0; i < rnaSequence.length(); i = i + 3) {
//            String codon = rnaSequence.substring(i, i + 3);
//            String protein = Rna.valueOf(codon).getValue();
//
//            if (protein.equals("STOP")) {
//                break;
//            } else {
//                proteinList.add(protein);
//            }
//        }
//
//        return proteinList;
//    }


//    Solution using HashMap
    private Map<String, String> codons = new HashMap<>(
            Map.ofEntries(Map.entry("AUG", "Methionine"),
                          Map.entry("UUU", "Phenylalanine"),
                          Map.entry("UUC", "Phenylalanine"),
                          Map.entry("UUA", "Leucine"),
                          Map.entry("UUG", "Leucine"),
                          Map.entry("UCU", "Serine"),
                          Map.entry("UCC", "Serine"),
                          Map.entry("UCA", "Serine"),
                          Map.entry("UCG", "Serine"),
                          Map.entry("UAU", "Tyrosine"),
                          Map.entry("UAC", "Tyrosine"),
                          Map.entry("UGU", "Cysteine"),
                          Map.entry("UGC", "Cysteine"),
                          Map.entry("UGG", "Tryptophan"),
                          Map.entry("UAA", "STOP"),
                          Map.entry("UAG", "STOP"),
                          Map.entry("UGA", "STOP")
            )
    );

    List<String> translate(String rnaSequence) {

        List<String> proteinList = new ArrayList<>();

        //  Solution using Matcher and while
        Matcher codon = Pattern.compile("\\w\\w\\w").matcher(rnaSequence);
        while (codon.find()) {
            String protein = codons.get(codon.group());

        //  Solution using for and substring
//        for (int i = 0; i < rnaSequence.length(); i = i + 3) {
//            String codon = rnaSequence.substring(i, i + 3);
//            String protein = codons.get(codon);

            if (protein.equals("STOP")) {
                break;
            } else {
                proteinList.add(protein);
            }
        }

        return proteinList;
    }

}
