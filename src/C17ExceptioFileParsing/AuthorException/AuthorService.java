package C17ExceptioFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;

    AuthorService() {
        authorRepository = new AuthorRepository();
    }

    void register(Author author) throws IllegalArgumentException {
//        만약에 password가 5자리 이하이면 예외 발생(IllegalArgu)
        if (author.getPassword().length() <= 5) {
            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
        }
//        기존에 같은email있는지도 체크
        Optional<Author> author1 = authorRepository.getAuthorByEmail(author.getEmail());
        if (author1.isPresent()) {
            throw new IllegalArgumentException("이미 같은 회원이 존재합니다.");
        }
        authorRepository.register(author);
    }

    public Author login(String email, String password) throws IllegalArgumentException, NoSuchElementException{
        // email이 존재하지 않으면 예외 발생 (NoSuchElementException)
        Optional<Author> findAuthor = authorRepository.getAuthorByEmail(email);
        if (findAuthor.isEmpty()){
            throw new NoSuchElementException("존재하지 않는 이메일입니다.");
        }
        // password가 불일치하면 예외 발생 (IllegalArgumentException)
        if (!findAuthor.get().getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
        System.out.println("성공적으로 로그인 되었습니다.");
        return findAuthor.get();
    }
}