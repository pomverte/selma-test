package fr.pomverte;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RichParameter {
    private String user;
    private String password;
    private String adress;
    private String language;
}
