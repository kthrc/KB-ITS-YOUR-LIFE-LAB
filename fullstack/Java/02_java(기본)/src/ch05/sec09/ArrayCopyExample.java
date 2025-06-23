package ch05.sec09;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        // System.arraycopy 을 이용해 복사
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        // for문 출력
        for(int i=0; i<newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
    }
}
