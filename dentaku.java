class dentaku{
  public static void main(String[] args){
    int val1 = 0;
    int val2 = 0;
    String ope = ""; //演算子

    if (args.length != 3){
      errDisp("演算子は: + - x / の4つです");
    }

    try{
      val1 = Integer.parseInt(args[0]);
      val2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("警告: 数値でない値が入力されています");
    }
    ope = args[1];

    String opeStr[] = {"+", "-", "x", "/"};
    boolean errFlag = true;

    for (int i = 0; i < 4; i++){
      if (ope.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      System.out.println("演算子は: + - x / の4つです");
      System.exit(0);
    }

    int kekka = keisan(val1, ope, val2);

    System.out.println("結果:" + val1 + " " + ope + " " + val2 + " = " + kekka);
  }

  private static void errDisp(String errStr){
    System.out.println("入力は: java dentaku 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);
  }

  private static int keisan(int val1, String ope, int val2){
    if (ope.equals("+")){
      return val1 + val2;
    }else if (ope.equals("-")){
      return val1 - val2;
    }else if (ope.equals("x")){
      return val1 * val2;
    }else{
      if (val2 == 0){
        System.out.println("警告: 0で割ろうとしました");
      }
      return val1 / val2;
    }
  }
}