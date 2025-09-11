package com.bridgelabz.oops.leveltwo;

class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public boolean isPalindrome() {
        String cleanText = text.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }
    public void displayResult() {
        if (isPalindrome())
            System.out.println("The text \"" + text + "\" is palindrome");
        else
            System.out.println("The text \"" + text + "\" is not palindrome");
        
    }
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("abcdcba");
        PalindromeChecker checker2 = new PalindromeChecker("varsha");
        checker1.displayResult();
        checker2.displayResult();
    }
}
