package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Board> list = new LinkedList<>();

        // Board 클래스의 인스턴스 5개를 생성하여 ArrayList에 추가
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        // ArrayList에 저장된 요소의 개수 출력
        System.out.println("총 객체 수: " + list.size());
        System.out.println();

        // 3번째 데이터를 추출하여 출력
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent()
                + "\t" + board.getWriter());
        System.out.println();

        // 일반 for문으로 순회하면서 리스트의 각 요소 출력
        for(int i = 0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent()
                    + "\t" + b.getWriter());
        }
        System.out.println();

        // 인덱스 2에 해당하는 요소 제거
        list.remove(2);

        // 인덱스 2에 해당하는 요소 제거
        list.remove(2);

        // 향상된 for문으로 순회하면서 리스트의 각 요소 출력
        for(Board b : list){
            System.out.println(b.getSubject() + "\t" + b.getContent()
                    + "\t" + b.getWriter());
        }
    }
}
