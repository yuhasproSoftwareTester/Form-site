package form.entity;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;

    private String password;
    private Integer age;
    private String gender;
    private String country;
    private String skills;
    private LocalDate dateOfBirth;
    private String phone;
    private String comments;
    private String documentName;

    public void setId(Integer id) {
    this.id = id;
}

public Integer getId() {
    return id;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
}

public String getFirstName() {
    return firstName;
}

public void setLastName(String lastName) {
    this.lastName = lastName;
}

public String getLastName() {
    return lastName;
}

public void setEmail(String email) {
    this.email = email;
}

public String getEmail() {
    return email;
}

public void setPassword(String password) {
    this.password = password;
}

public String getPassword() {
    return password;
}

public void setAge(Integer age) {
    this.age = age;
}

public Integer getAge() {
    return age;
}

public void setGender(String gender) {
    this.gender = gender;
}

public String getGender() {
    return gender;
}

public void setCountry(String country) {
    this.country = country;
}

public String getCountry() {
    return country;
}

public void setSkills(String skills) {
    this.skills = skills;
}

public String getSkills() {
    return skills;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
}

public LocalDate getDateOfBirth() {
    return dateOfBirth;
}

public void setPhone(String phone) {
    this.phone = phone;
}

public String getPhone() {
    return phone;
}

public void setComments(String comments) {
    this.comments = comments;
}

public String getComments() {
    return comments;
}

public void setDocumentName(String documentName) {
    this.documentName = documentName;
}

public String getDocumentName() {
    return documentName;
}
}
