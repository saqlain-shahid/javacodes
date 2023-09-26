class Arr{
  void sumArr(){
      int[] age={1,2,6,9,84,45};
      int sum=0;
      for(int i=0;i<age.length;i++){
          sum=sum+age[i];
      }
      System.out.println(sum);
  }

  void MaxArr(){
      int [] age={1,2,6,5,54,5,5454,6,456};

      int ans=0;
      for (int i = 0; i < age.length; i++) {
          if (age[i]>ans){
              ans=age[i];
          }
      }
      System.out.println(ans);
  }
  void SearchArr(){
      int [] age={1,2,6,5,54,5,5454,6,456};
      int x=46;
      int ans=-1;
      for (int i = 0; i < age.length; i++) {
          if (age[i]==x){
              ans=i;
          }

      }
      System.out.println("Found " + x + " at" + " " + ans);
  }
}


public class Array {
    public static void main(String[] args) {
    Arr obj = new Arr();
//    obj.sumArr();
//      obj.MaxArr();
//      obj.SearchArr();

}

}