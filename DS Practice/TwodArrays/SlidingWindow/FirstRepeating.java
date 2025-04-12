package SlidingWindow;


class FirstRepeating {
  static int NO_OF_CHARS = 256;
  static int firstRepeating(char[] str) {
    int[] firstIndex = new int[NO_OF_CHARS];
    for (int i = 0; i < str.length; i++) {
      firstIndex[str[i]]++;
    }
    for (int i = 0; i < str.length; i++) {
      if (firstIndex[str[i]] > 1) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    char[] str = "aababacdef".toCharArray();
    int index = firstRepeating(str);
   System.out.println(str[index]);
  }
}
