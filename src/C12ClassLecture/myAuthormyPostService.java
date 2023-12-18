package C12ClassLecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myAuthormyPostService {
    public static void main(String[] args) {
        List<myAuthor> authors = new ArrayList<>();
        List<myPost> posts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원가입 3.회원 목록조회 4. 회원 상세 조회 5.게시글 상세 조회 ");
            int number = sc.nextInt();
            //회원가입
            sc.nextLine();
            switch (number) {
                case 1:
                    System.out.println("회원가입 하실 이름, 비번,이메일 2 글쓰기");
                    String name = sc.nextLine();
                    String password = sc.nextLine();
                    String email = sc.nextLine();
                    myAuthor member = new myAuthor(name, password, email);
                    System.out.println("가입한 사용자의 id는 " + member.getId() + "이름은 " + member.getName() +
                            "이메일은" + member.getEmail());
                    authors.add(member);
                    break;
                    // 게시글 작성
                case 2:
                    System.out.println("email 입력해라");
                    String author_email = sc.nextLine();
                    myAuthor temp_author = null;
                    for (myAuthor a : authors) {
                        if (a.getEmail().equals(author_email)) {
                            temp_author = a;
                        }
                    }
                    if (temp_author == null){
                        System.out.println("없는 사용자 입니다.");
                        continue;
                    }
                    System.out.println("글쓰기 제목, 내용 적어라");
                    String title = sc.nextLine();
                    String contents = sc.nextLine();
                    myPost post1 = new myPost(temp_author, title, contents);
                    System.out.println("작성한 글 제목은" + post1.getTitle());
                    posts.add(post1);
                    temp_author.posts_add(post1);

                    break;
                    //회원 목록 조회
                case  3:
                    System.out.println("회원의 정보들을 보여드릴게요");
                    for (myAuthor a : authors) {
                        System.out.println(a.getmyAuthorInfo());
                    }
                    break;
                    // 회원 상세조회
                case  4:
                    System.out.println("회원 이메일을 입력해라, 회원명, 회원 email, 회원이 작성한 글 수를 보여줄게");
                    String author_email4 = sc.nextLine();
                    //회원 아이디로 post에서 author_id가 회원아이디랑 같으면 count수가 올라감
                    myAuthor temp_author4 = null; //temp에 객체 그 자체의 주소가 담김
                    for (myAuthor author : authors) {
                        if (author.getEmail().equals(author_email4)) {
                            temp_author4 = author;
                        }
                    }
                    if (temp_author4 == null){
                        System.out.println("사용자가 없습니다.");
                        continue;
                    }
                    System.out.println("글쓴이 이름은" + temp_author4.getName() + "글쓴이 이메일은 "
                            + temp_author4.getEmail() + "작성한 글 갯수는" + temp_author4.getpost().size());
                    break;
//                 == 같은 거다.
//                System.out.println("너가 작성한 게시글 " + count);
//                for (myAuthor a : authors) {
//                    System.out.println("너가 작성 이메일" + a.getEmail() + "너의 이름" + a.getName());
//                }
                    ///게시글 상세 조회
                case  5:
                    System.out.println("이메일을 적어봐라 게시글 뭐썼는지 보여드림");
                    String temp_email5 = sc.nextLine();
                    myPost temp_author5 = null;
                    for (myPost post: posts) {
                        if (post.getEmail().equals(temp_email5)) {
                            temp_author5 = post;
                            System.out.println("너가쓴 글의 제목은" + temp_author5.getTitle());
                        }
                    }
                    if(temp_author5 == null){
                        System.out.println("없는 사용자 입니다.");
                        continue;
                    }
                    break;
//        회원 명, 회원 이메일 목록 출력하기
//
//        회원 상세 조회: id가지고 - 회원 명, 회원 email, 회원 작성글 수
//        게시글 상세 조회 - id가지고 제목, 작성자 email주소 나오게

            }
        }
    }
}
class myAuthor {
    //    Ntt역할 - 객체 생성만 하는것, DB에서의 테이블,
//    자바의 인스턴스 객체 == DB의 컬럼
    private Long id;
    private String name;
    private String password;
    private String email;
    static Long static_id = 0L;
    //DB 의 auto incre같은 기능을
    private List<myPost> posts;
    
    public myAuthor(String name, String password, String email) {
        static_id+=1;
        this.name = name;
        this.password = password;
        this.email = email;
        this.id = static_id;
        posts = new ArrayList<>();
    }
    public void posts_add(myPost post){
        this.posts.add(post);
    }
    public List<myPost> getpost(){
        return posts;
    }
    public Long getId() {
        return id; //get에서는 this 빼도 됨
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getmyAuthorInfo(){
        String info = "";
        info += this.email;
        info += this.name;
        info += this.id;
        return info;
    }

}

class myPost {
    private Long id;
    private String title;
    private String contents;
    private myAuthor author;

    public String getAuthorInfo(){
        return this.author.getmyAuthorInfo();
    }

    public String getmyPostInfo(){
        return this.author.getEmail() + this.title + this.contents;
    }
    static Long static_id = 0L; //Long은 초깃값이 null이라 초깃값 설정해야함

    public myPost(myAuthor author, String title, String contents) {
        static_id +=1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
    }

    public Long getId() {
        return id;
    }

    public String getEmail(){
        return this.author.getEmail();
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }
}

