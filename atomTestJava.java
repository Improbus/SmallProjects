class test{

  public static void main(String[] args) {
      System.out.println("Hello World!" + " " + args[0] + " " +  args[1] + " " +  addStuff(1,2) + " " + createSentence()); // Display the string.
      iAmAVoid();
    }

  public static int addStuff(int x, int y){
    return x+y;
  }

  public static String createSentence(){
    return "I am a String";
  }

  public static void iAmAVoid(){
    System.out.println("I AM A VOID");
  }

}
