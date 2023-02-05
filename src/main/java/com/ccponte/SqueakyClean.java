package com.ccponte;

class SqueakyClean {
    static String clean(String identifier) {

        StringBuilder newIdentifier = new StringBuilder();

        for (int i = 0; i < identifier.length(); i++) {

            char charIdentifier = identifier.charAt(i);

            if (Character.isSpaceChar(charIdentifier)) {
                newIdentifier.append("_");
            } else if (Character.isISOControl(charIdentifier)) {
                newIdentifier.append("CTRL");
            } else if ('-' == charIdentifier) {
                i++;
                if (Character.isLetter(identifier.charAt(i))) {
                    newIdentifier.append(String.valueOf(identifier.charAt(i)).toUpperCase());
                }
            } else if (Character.isLetter(charIdentifier) &&
                       !String.valueOf(charIdentifier).matches("[α-ω]")) {
                newIdentifier.append(charIdentifier);
            }
        }

        return newIdentifier.toString();
    }

}
