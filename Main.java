class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphas= "abcdefghijklmnopqrstuvwxyz";
        for(char c:alphas.toCharArray()){
            if(sentence.indexOf(c)==-1) return false; // sentence.indexOf(c)==-1 suggests that the character 'c' doesn't lie in the given string.
        }
        return true;
    }
}
