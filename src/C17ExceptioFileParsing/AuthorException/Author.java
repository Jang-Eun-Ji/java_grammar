package C17ExceptioFileParsing.AuthorException;


//엔티티
class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    static Long static_id = 0L;

    //    포스트 리스트 변수
    Author(String name, String email, String password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}

