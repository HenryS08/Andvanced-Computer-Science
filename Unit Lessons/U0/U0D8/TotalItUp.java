public class TotalItUp  
{
   private int numOne, numTwo, answer;
	 
   public void setNums(int n1, int n2) {
        numOne = n1;
        numTwo = n2;
    }

    public int add() {
        answer = numOne + numTwo;
        return answer;
    }

    public void print() {
        System.out.println(numOne + " + " + numTwo + " = " + answer);
}
}
